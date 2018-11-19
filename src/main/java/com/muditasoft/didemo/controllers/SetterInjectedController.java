package com.muditasoft.didemo.controllers;

import com.muditasoft.didemo.services.GreetingService;

public class SetterInjectedController {
    private GreetingService greetingService;

    String sayHello() {
        return greetingService.sayGreeting();
    }

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
}
