package com.brenner.csvparser.controllers;

import com.brenner.csvparser.services.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/helloworld")
public class HelloWorldController {
    @Autowired
    private HelloWorldService helloWorldService;

    @RequestMapping("/processHelloWorld")
    public String processHelloWorld(@RequestParam(value = "name") String name) {
        return helloWorldService.processHelloWorld(name);
    }
}
