package com.example.learnspring.springlearning.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FileUploderController {
    @PostMapping("/fil-upload")
    public  String isUploaded(){

        return "Working-";
    }
}
