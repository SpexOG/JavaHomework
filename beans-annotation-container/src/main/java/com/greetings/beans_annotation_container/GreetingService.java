package com.greetings.beans_annotation_container;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    public String getGreeting(String name){

        return "Hello, " + name;

    }

}
