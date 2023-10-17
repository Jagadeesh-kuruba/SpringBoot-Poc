package com.example.demoApplication.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app")
public class AppController {

    @GetMapping("/get")
    public String getData(){
        return "Successfully Created our App";
    }
}
