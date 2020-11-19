package com.tatandru.demo.controllers;

import com.tatandru.demo.controller.PropertyInjectedController;
import com.tatandru.demo.controller.SetterInjectedController;
import com.tatandru.demo.services.GreetingServiceImplementation;
import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SetterInjectedControllerTest {

    private SetterInjectedController setterInjectedControllerTest;

    @Before
    public void setUp() throws Exception{
        this.setterInjectedControllerTest=new SetterInjectedController();
        this.setterInjectedControllerTest.setGreetingService(new GreetingServiceImplementation());
    }

    @Test
    public void testGreeting() throws Exception{
        assertEquals(GreetingServiceImplementation.HELLO,setterInjectedControllerTest.sayHello());
    }
}
