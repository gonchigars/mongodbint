package com.example.demo.controller;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")  // Set a base path for your API endpoints
public class HomeController {

    @GetMapping("/home")  // Adjusted endpoint
    public String home() {
        return "Welcome to the API";
    }
}