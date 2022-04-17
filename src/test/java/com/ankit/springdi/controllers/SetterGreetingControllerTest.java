package com.ankit.springdi.controllers;

import com.ankit.springdi.service.GreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SetterGreetingControllerTest {

    GreetingService sut;
    @BeforeEach
    void setUp() {
    }


    @Test
    void getGreeting() {
        System.out.println(sut.sayGreeting());
    }
}