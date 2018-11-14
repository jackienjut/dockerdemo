package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
public class TestController {

    @Autowired
    private Environment env;

    @GetMapping("test/{name}")
    public String getTest(@PathVariable String  name){
        return  name + " is fat mam!";
    }

    @GetMapping("aa")
    public String getTest(){
        return    "I an handsome mam!";
    }


    @GetMapping("test/getpro")
    public String getP(){
        String str =  env.getProperty("test");



        return str;
    }

    public static void main(String[] args){
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String str =  sdf.format(date);
        System.out.println(str);


        String sql = "select * from where pt > \'" + str + "\'";

        System.out.println(sql);
    }
}
