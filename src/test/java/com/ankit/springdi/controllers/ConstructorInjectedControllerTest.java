package com.ankit.springdi.controllers;

import com.ankit.springdi.service.GreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class ConstructorInjectedControllerTest {

    @Autowired
    GreetingService sut;

    @BeforeEach
    void setUp() {

    }

    @Test
    void getGreeting() {
        System.out.println(sut.sayGreeting());
    }
}