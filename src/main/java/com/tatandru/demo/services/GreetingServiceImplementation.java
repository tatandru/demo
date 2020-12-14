package com.tatandru.demo.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImplementation implements GreetingService{
    public static final String HELLO="HELLO - greeting service implementation";

    @Override
    public  String sayGreeting(){
        return HELLO;
    }
}
