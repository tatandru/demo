package com.tatandru.demo.controllers;

import com.tatandru.demo.controller.ConstructorInjectedController;
import com.tatandru.demo.controller.PropertyInjectedController;
import com.tatandru.demo.services.GreetingServiceImplementation;
import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConstructorInjectedControllerTest {
    private ConstructorInjectedController constructorInjectedController;

    @Before
    public void setUp() throws Exception{
        this.constructorInjectedController=new ConstructorInjectedController(new GreetingServiceImplementation());
    }

    @Test
    public void testGreeting() throws Exception{
        assertEquals(GreetingServiceImplementation.HELLO,constructorInjectedController.sayHello());
    }
}
