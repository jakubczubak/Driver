package com.czubakjakub.driverapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/hello")
    public String getHomePage(){
        return "Hello in Driver-app";
    }
}
