import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.Thread.Builder.OfVirtual;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ImageHandeling {

    public static void main(String[] args) throws ClassNotFoundException, SQLException,IOException {
        
        String url = "jdbc:mysql://localhost:3306/my_db";
        String user = "root";
        String password = "29344";

        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, user, password);
        //storeImage(con);
         getImage(con);
          
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

    public static void getImage(Connection con) throws SQLException, IOException{
        String folderPath = "D:\\images\\";
        File file = new File(folderPath);
        if (!file.exists()) {
            file.mkdir();
        }
        byte[] image;
        PreparedStatement pst = con.prepareStatement("SELECT image FROM imagetable WHERE imgId = ?");
        pst.setInt(1, 3);
        ResultSet rs = pst.executeQuery();
        if(rs.next()){
            image = rs.getBytes("image");
            String imagePath = folderPath+"flower.jpg";
            OutputStream out = new FileOutputStream(imagePath);
            out.write(image);
        }else{
            System.out.println("image not found");
        }
      

    }
}
