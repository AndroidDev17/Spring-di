package com.ankit.springdi.controllers;

import com.ankit.springdi.service.GreetingService;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PropertyInjectedControllerTest {

    GreetingService sut;

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getGreeting() {
        System.out.println(sut.sayGreeting());
    }
}