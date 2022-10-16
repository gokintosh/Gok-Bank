package com.gokul.userservice;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@RequestMapping("/user")
public class Controller {

    @GetMapping()
    public String returnName(Principal principal){
        return "Gokul"+principal.getName();
    }

    @PostMapping("/register")
    public String registerUser(){
        return "Registered!!";
    }
}
