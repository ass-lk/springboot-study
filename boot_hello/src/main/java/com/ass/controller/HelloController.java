package com.ass.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/say")
    public String say(){
        return "hello springboot!!";
    }
}
