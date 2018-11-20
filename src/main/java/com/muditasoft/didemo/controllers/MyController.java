package com.muditasoft.didemo.controllers;

import com.muditasoft.didemo.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String hello() {
        System.out.println("Helloo!!!");
        return greetingService.sayGreeting();
    }
}
