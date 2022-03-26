package com.ankit.springdi.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    public String sayHello(){
        return  "Hello from Spring Boot";
    }
}
