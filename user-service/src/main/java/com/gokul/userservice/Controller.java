package com.gokul.userservice;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@RequestMapping("/user/register")
public class Controller {

    @GetMapping()
    public String returnName(Principal principal){
        return "Gokul"+principal.getName();
    }

    @PostMapping()
    public String registerUser(){
        return "Registered!!";
    }

//    todo
//    separate register endpoint
//    login fuctionality
//    minus amount from account


}
