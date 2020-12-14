package com.tatandru.demo.controller;

import com.tatandru.demo.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    private GreetingService greetingService;

    public MyController(GreetingService greetingService){
        this.greetingService=greetingService;
    }

    public String hello(){
        System.out.println("Hello-controller");
        return greetingService.sayGreeting();
    }
}
