package com.example.JSP_Serverlet.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @RequestMapping("/")
    public String greeting() {

        return "<h1>Hello!!! I'm Kasuni. Welcome!!</h1>";
    }
}

