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

        try{
            Connection con = DriverManager.getConnection(url, user, pass);
            System.out.println("connection build sucessfully");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from account");

            while(rs.next()){

                String name = rs.getString("name");
                System.out.println(name);
            }
            rs.close();
            st.close();
            con.close();


        }catch(SQLException e){
            e.printStackTrace();
        }
        
    }
    
}
