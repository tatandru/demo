package com.tatandru.demo.controller;

import com.tatandru.demo.services.GreetingServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    @Autowired
    public GreetingServiceImplementation greetingService;
    public String sayHello(){
        return greetingService.sayGreeting();
    }

}
