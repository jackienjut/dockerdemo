package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("test/{name}")
    public String getTest(@PathVariable String  name){
        return  name + " is handsome mam!";
    }

    @GetMapping("aa")
    public String getTest(){
        return    "I an handsome mam!";
    }
}
