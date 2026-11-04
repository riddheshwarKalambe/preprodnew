package com.example.simple.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
// new preprod

    @GetMapping("/hello")
    public String hello() {
        return "Hello! Spring Boot 3.5.14 with Java 21 is running.";
    }
}
