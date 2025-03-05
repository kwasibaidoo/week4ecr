package com.week4ecr.week4ecr.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HelloController {

    @GetMapping("/")
    public String sayHello() {
        return "Hello, This is a java app";
    }
    
}
