package com.week4ecr.week4ecr.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {

    @GetMapping("/")
    public String sayHello() {
        return "Hello, This is a java app";
    }
    
}
