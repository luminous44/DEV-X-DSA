package com.example.learnspring.springlearning.Helper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.ssl.SslProperties;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

@Component
public class FileUploadHelper {

    public final String filePath = "E:\\learning\\spring boot\\springlearning\\src\\main\\resources\\static\\image";


   public  boolean fileUpload(MultipartFile file){

       boolean isUpload = false;
       try{
           Files.copy(file.getInputStream(), Paths.get(filePath+File.separator+file.getOriginalFilename()), StandardCopyOption.REPLACE_EXISTING);
           isUpload = true;

       }catch(Exception ex){
           ex.printStackTrace();
       }

       return  isUpload;
   }
}
