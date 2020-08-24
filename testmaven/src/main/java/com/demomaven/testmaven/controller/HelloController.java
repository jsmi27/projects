package com.demomaven.testmaven.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("/")
    public String getGreetings() {
        return "Hello World !";
    }
}
