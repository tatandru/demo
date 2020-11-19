package com.tatandru.demo.controllers;

import com.tatandru.demo.controller.PropertyInjectedController;
import com.tatandru.demo.services.GreetingServiceImplementation;
import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PropertyInjectedControllerTest {

    private PropertyInjectedController propertyInjectedController;

    @Before
    public void setUp() throws Exception{
        this.propertyInjectedController=new PropertyInjectedController();
        this.propertyInjectedController.greetingService=new GreetingServiceImplementation();
    }

    @Test
    public void testGreeting() throws Exception{
        assertEquals(GreetingServiceImplementation.HELLO,propertyInjectedController.sayHello());
    }
}
