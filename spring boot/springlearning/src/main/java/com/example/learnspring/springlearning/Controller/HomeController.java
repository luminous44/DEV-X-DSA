package com.example.learnspring.springlearning.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/about")
    public String about(Model model) {

        model.addAttribute("name","Aklema Sultana");
        model.addAttribute("age",25);

        return "about";

    }

}
