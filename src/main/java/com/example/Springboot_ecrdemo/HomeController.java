package com.example.Springboot_ecrdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/hello")
    public String getHello()
    {
        return "Welcome to AWS Ecr!";
    }
}
