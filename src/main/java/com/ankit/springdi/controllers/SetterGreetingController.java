package com.ankit.springdi.controllers;

import com.ankit.springdi.service.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;

public class SetterGreetingController {

    private GreetingService greetingService;

    @Qualifier("EnglishGreetingServiceImpl")
    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
