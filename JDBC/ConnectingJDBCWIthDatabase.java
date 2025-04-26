import java.sql.*;
public class ConnectingJDBCWIthDatabase {

    public static void main(String[] args){

        String url = "jdbc:mysql://localhost:3306/my_db";
        String user = "root";
        String pass = "29344";

        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver loaded successfully");
        }catch(ClassNotFoundException e){
          e.printStackTrace();
        }


        
    }
    
}
