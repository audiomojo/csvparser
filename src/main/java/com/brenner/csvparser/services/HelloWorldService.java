package com.brenner.csvparser.services;

import org.springframework.stereotype.Service;

@Service
public class HelloWorldService {
    public String processHelloWorld(String name) {
        return "The World says Hello to " + name;
    }
}
