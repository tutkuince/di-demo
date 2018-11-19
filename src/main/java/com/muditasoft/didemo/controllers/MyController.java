package com.muditasoft.didemo.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public String hello(){
        System.out.println("Helloo!!!");
        return "foo";
    }
}
