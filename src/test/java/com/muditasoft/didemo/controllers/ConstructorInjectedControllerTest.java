package com.muditasoft.didemo.controllers;

import com.muditasoft.didemo.services.GreetingServiceImpl;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class ConstructorInjectedControllerTest {
    private ConstructorInjectedController constructorInjectedController;

    @Before
    public void setUp() {
        this.constructorInjectedController = new ConstructorInjectedController(new GreetingServiceImpl());
    }

    @Test
    public void testGreeting(){
        assertEquals(GreetingServiceImpl.HELLO_EVERYONE, constructorInjectedController.sayHello());
    }
}
