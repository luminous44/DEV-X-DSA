package com.example.learnspring.springlearning.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {

    @GetMapping("/about")
    public String about(Model model) {

        model.addAttribute("name","Aklema Sultana");
        model.addAttribute("age",25);

        List<String> disf = List.of("M1","Thorfin","No One","June","Kormosuchi","Homeless","Arique");
        model.addAttribute("fn",disf);

        return "about";

    }
    @GetMapping("/home")
    public String home(Model model) {

        List<String> disf = List.of("M1","Thorfin","No One","June","Kormosuchi","Homeless","Arique");
        model.addAttribute("fn",disf);

        return "home";

    }

}
