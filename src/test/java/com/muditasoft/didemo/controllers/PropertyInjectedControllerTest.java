package com.muditasoft.didemo.controllers;

import com.muditasoft.didemo.services.GreetingServiceImpl;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class PropertyInjectedControllerTest {

    private PropertyInjectedController propertyInjectedController;

    @Before
    public void setUp() {
        this.propertyInjectedController = new PropertyInjectedController();
        this.propertyInjectedController.greetingService = new GreetingServiceImpl();
    }

    @Test
    public void testGreeting() {
        assertEquals(GreetingServiceImpl.HELLO_EVERYONE, propertyInjectedController.sayHello());
    }
}
