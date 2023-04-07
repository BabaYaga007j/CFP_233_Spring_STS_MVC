package com.example.springMVC.contoller;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {
    @GetMapping("/web")
    public String greeting(){

        return "hello";
    }
    @GetMapping("/web/message")
    public String message(Model model){
        model.addAttribute("message","Hello From Bridgelabz");
        return "message";
    }
}
