package com.example.learnspring.springlearning.Controller;

import com.example.learnspring.springlearning.Helper.FileUploadHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class FileUploderController {

    @Autowired
    private FileUploadHelper fileUploadHelper;
    @PostMapping("/fil-upload")
    public ResponseEntity<String> uploadFile(@RequestParam("file")MultipartFile file){

        try {
            System.out.printf(file.getContentType());
            if (file.isEmpty()){
                return ResponseEntity.status(HttpStatus.NO_CONTENT).body("Request must contain a image file");

            }
            if (!file.getContentType().equals("image/jpeg")){
                return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("file type should be jpeg");

            }
            boolean isUploadFile = fileUploadHelper.fileUpload(file);
            if (isUploadFile){
                return ResponseEntity.ok("Image file upload successfully");
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }

        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Failed to upload image!! Try Again..");
    }
}
