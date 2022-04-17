package com.ankit.springdi.service;

/**
 * created by ADMIN on Mar, 2022
 */


public class PrimaryGreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello wold friends";
    }
}
