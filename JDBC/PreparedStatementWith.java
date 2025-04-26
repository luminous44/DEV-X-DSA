import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class PreparedStatementWith {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        
        String url = "jdbc:mysql://localhost:3306/feedback";
        String user = "root"; 
        String pass = "29344";

       Class.forName("com.mysql.jdbc.Driver");
       Connection con = DriverManager.getConnection(url, user, pass);
       String Query1 = "insert into users(id,name,email,role,password) values(?,?,?,?,?)";
       String Query2 = "select * from users where id = ?";
       PreparedStatement pt = con.prepareStatement(Query1);
       PreparedStatement pst = con.prepareStatement(Query2);
       Scanner sc = new Scanner(System.in);
       int id = sc.nextInt();
       String name = sc.nextLine();
       String email = sc.nextLine();
       String role = sc.nextLine();
       String passw = sc.nextLine();
       pt.setInt(1, id);
       pt.setString(2, name);
       pt.setString(3, email);
       pt.setString(4, role);
       pt.setString(5,passw);
       pst.setInt(1, 2);
       int row = pt.executeUpdate();

       if(row>0){
        System.out.println("data inserted successfully");
       }else{
        System.out.println("failed to insert data");
       }
      
       ResultSet rs = pst.executeQuery();
       while(rs.next()){
         System.out.println(rs.getString("name"));
         System.out.println(rs.getString("email"));
       }

    }
    
}
