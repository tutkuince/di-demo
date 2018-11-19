package com.muditasoft.didemo.services;

public class SetterGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello - I was injected by the setter";
    }
}
