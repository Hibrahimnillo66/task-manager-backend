package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "home"; // Return the name of the view
    }

    @GetMapping("/login")
    public String login() {
        return "login"; // Return the name of the login view
    }
}
