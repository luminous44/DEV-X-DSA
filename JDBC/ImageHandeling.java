import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ImageHandeling {

    public static void main(String[] args) throws ClassNotFoundException, SQLException,FileNotFoundException {
        
        String url = "jdbc:mysql://localhost:3306/my_db";
        String user = "root";
        String password = "29344";

        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, user, password);
        storeImage(con);
          
    }

    public static void storeImage(Connection con) throws SQLException{
        String imagePath = "C:\\Users\\user\\Downloads\\493227280_655155851008776_4213635021050063443_n.jpg";
        byte[] image;
        try {
            FileInputStream input = new FileInputStream(imagePath);
            image = new byte[input.available()];
           input.read(image);
           PreparedStatement pt = con.prepareStatement("insert into  imagetable (image) values(?) ");
            pt.setBytes(1, image);
            int rowEffected = pt.executeUpdate();
            if(rowEffected>0){
                System.out.println("image added successfully");
            }else{
                System.out.println("failed to add image");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
