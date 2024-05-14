package com.tscode.java5.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/home")
    public String ViewHome() {
        return "home"; // Trả về trang chủ
    }
}
