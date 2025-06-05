package com.tutormanager.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/api/hello")
    public String helloTutors() {
        return "Hello Tutors 👋 Your SaaS backend is up!";
    }
}

