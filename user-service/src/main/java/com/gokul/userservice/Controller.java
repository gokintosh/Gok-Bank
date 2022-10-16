package com.gokul.userservice;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class Controller {

    @GetMapping()
    public String returnName(){
        return "Gokul";
    }

    @PostMapping("/register")
    public String registerUser(){
        return "Registered!!";
    }
}
