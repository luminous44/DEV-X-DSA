import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class DeleteData {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/my_db";
        String user = "root";
        String pass = "29344";
        try{
            Class.forName("com.mysql.jdbc.Driver");
        }catch(ClassNotFoundException e){
          e.printStackTrace();
        }
         try{
                Connection con = DriverManager.getConnection(url, user, pass);
                System.out.println("connection builded");
                
                 Statement st = con.createStatement();
    
                 int rowIn = st.executeUpdate("delete from account where name = 'akhi'");
                 if(rowIn>0){
                    System.out.println("data deleted successfull");
                 }else{
                    System.out.println("Failed to delete data");
                 }
        
         st.close();
         con.close();
    
    
            }catch(SQLException e){
                e.printStackTrace();
            }
}
}



