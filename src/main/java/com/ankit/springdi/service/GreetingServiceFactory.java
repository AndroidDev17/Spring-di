package com.ankit.springdi.service;

/**
 * created by Ankit on 17 of Apr, 2022
 */
public class GreetingServiceFactory {

    public GreetingService create(GreetingServiceType type){
        switch (type) {
            case DE: return new I18nGermanGreetingServiceImpl();
            case FR: return new FrenchGreetingServiceImpl();
            case IT: return new I18nItalianGreetingServiceImpl();
            case SE: return new SpanishGreetingServiceImpl();
            case ENG: return new EnglishGreetingServiceImpl();
            default: return new PrimaryGreetingServiceImpl();
        }
    }
}
