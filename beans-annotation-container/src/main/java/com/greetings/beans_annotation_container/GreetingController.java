package com.greetings.beans_annotation_container;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @Autowired
    private GreetingService greetingService;

    @GetMapping("/greet/{name}")
    public String greet(@PathVariable String name){

        return greetingService.getGreeting(name);

    }

}
