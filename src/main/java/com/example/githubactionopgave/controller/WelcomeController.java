package com.example.githubactionopgave.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("welcome")
@Controller
public class WelcomeController {

    @GetMapping("")
    public String welcome(){
        return "welcome";
    }

    //bare lige lidt notee

}
