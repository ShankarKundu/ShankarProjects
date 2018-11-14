package com.example.springrestimpl.controller;


import com.example.springrestimpl.ServiceClass.appService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller1 {
    @Autowired
    private appService ser;
    public Controller1() {
        System.out.println("Controller() class");
    }
    @RequestMapping("/hello")
    public String sayHi(){

        return ser.getName();
    }
}
