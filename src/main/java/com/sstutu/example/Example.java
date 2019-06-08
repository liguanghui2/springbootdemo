package com.sstutu.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class Example {

    @RequestMapping(value = "/hello")
    public String hello() {
        List<String> list=new ArrayList<String>();
        Map map=new HashMap();
        return "hello word";
    }
}
