package com.ankit.springdi.controllers;

import com.ankit.springdi.service.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * created by ADMIN on Mar, 2022
 */


public class I18nController {
    private final GreetingService greetingService;

    public I18nController(@Qualifier("i18nService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
