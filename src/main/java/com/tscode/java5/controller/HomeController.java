package com.tscode.java5.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/login")
      public String login() {return "login";
    }
    @GetMapping("/home")
    public String viewhome(){
        return "home";
    }
}
