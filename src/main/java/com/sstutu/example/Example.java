package com.sstutu.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Example {

    @RequestMapping(value = "/hello")
    public String hello() {
        return "hello word";
    }
}
