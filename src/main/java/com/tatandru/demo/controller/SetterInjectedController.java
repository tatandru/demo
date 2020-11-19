package com.tatandru.demo.controller;

import com.tatandru.demo.services.GreetingService;
import com.tatandru.demo.services.GreetingServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedController {
    private GreetingService greetingService;
    public String sayHello(){
        return greetingService.sayGreeting();
    }

    @Autowired

    public void setGreetingService(@Qualifier("setterGreetingService") GreetingService greetingService){
        this.greetingService=greetingService;
    }
}
