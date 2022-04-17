package com.ankit.springdi.service;

/**
 * created by ADMIN on Mar, 2022
 */

public class FrenchGreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "bonjour les amis";
    }
}
