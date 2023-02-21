package com.github.vinyprogramador.springbootdio.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String HrlloMessage(){
        return "Hello with Dio!";
    }
}
