package com.ankit.springdi.controllers;

import com.ankit.springdi.service.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;

public class PropertyInjectedController {

    @Qualifier("SpanishGreetingServiceImpl")
    private GreetingService greetingService;

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
