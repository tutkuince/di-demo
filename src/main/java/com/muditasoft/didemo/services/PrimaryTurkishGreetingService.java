package com.muditasoft.didemo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("tr")
@Primary
public class PrimaryTurkishGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Merhaba Birincil Tebrik Servisi";
    }
}
