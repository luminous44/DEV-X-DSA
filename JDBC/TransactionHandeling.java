import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TransactionHandeling{


    public static void main(String[] args) throws ClassNotFoundException,SQLException {
        
        String url = "jdbc:mysql://localhost:3306/my_db";
        String user = "root";
        String password = "29344";

        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, user, password);
        con.setAutoCommit(false);

        String withdrawalQuery = "update account set balance = balance - ? where accNo = ?";
        String depositQuery = "update account set balance = balance + ? where accNo = ?";

        PreparedStatement wp = con.prepareStatement(withdrawalQuery);
        PreparedStatement dp = con.prepareStatement(depositQuery);
        wp.setInt(1, 100);
        wp.setString(2, "acc234");
        dp.setInt(1, 100);
        dp.setString(2, "acc456");
        int wr = wp.executeUpdate();
        int dr = dp.executeUpdate();

        if(wr>0 && dr>0 ){
            con.commit();
            System.out.println("transaction Sucessfull");
        }else{
            con.rollback();
            System.out.println("Failed to transaction");
        }

    }

}