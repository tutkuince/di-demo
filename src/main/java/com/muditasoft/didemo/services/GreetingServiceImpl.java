package com.muditasoft.didemo.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {
    public static final String HELLO_EVERYONE = "Hello Everyone!!!";

    @Override
    public String sayGreeting() {
        return HELLO_EVERYONE;
    }
}
