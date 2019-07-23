package com.hwua.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloConreoller {

    @RequestMapping("/hello")
    public String hello(){
        return "Hello World";
    }

}
