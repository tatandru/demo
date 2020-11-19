package com.tatandru.demo.controller;

import com.tatandru.demo.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {
    private GreetingService greetingService;
    public String sayHello(){
        return greetingService.sayGreeting();
    }
    public ConstructorInjectedController(@Qualifier("constructorGreetingService") GreetingService greetingService){
        this.greetingService=greetingService;
    }
}
