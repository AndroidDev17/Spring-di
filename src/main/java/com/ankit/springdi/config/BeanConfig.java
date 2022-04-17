package com.ankit.springdi.config;

import com.ankit.localEntity.PetService;
import com.ankit.localEntity.PetServiceFactory;
import com.ankit.localEntity.PetType;
import com.ankit.springdi.controllers.*;
import com.ankit.springdi.service.*;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

/**
 * created by Ankit on 17 of Apr, 2022
 */

@Configuration
public class BeanConfig {

    @Bean
    PetServiceFactory getPetFactory(){
        return new PetServiceFactory();
    }

    @Bean
    @Qualifier(PetType.DOG_TYPE)
    @Primary
    PetService getDogService(PetServiceFactory factory){
        return factory.create(PetType.DOG);
    }

    @Bean
    @Qualifier(PetType.CAT_TYPE)
    PetService geCatService(PetServiceFactory factory){
        return factory.create(PetType.CAT);
    }

    @Bean(name = "PetController")
    PetController getPetController(PetService service) {
        return new PetController(service);
    }

    @Profile("DE")
    @Bean(name = "i18nService")
    GreetingService getDEGreetingService(GreetingServiceFactory factory){
        return factory.create(GreetingServiceType.DE);
    }

    @Profile("IT")
    @Bean(name = "i18nService")
    GreetingService getITGreetingService(GreetingServiceFactory factory){
        return factory.create(GreetingServiceType.IT);
    }

    @Bean(name = "i18nController")
    I18nController getI18nController(@Qualifier("i18nService")GreetingService service) {
        return new I18nController(service);
    }

    @Bean
    GreetingServiceFactory getGreetingFactory() {
        return new GreetingServiceFactory();
    }

    @Bean(name = "EnglishGreetingServiceImpl")
    GreetingService getENGGreetingService(GreetingServiceFactory factory){
        return factory.create(GreetingServiceType.ENG);
    }

    @Bean(name = "FrenchGreetingServiceImpl")
    GreetingService getFRGreetingService(GreetingServiceFactory factory){
        return factory.create(GreetingServiceType.FR);
    }

    @Bean(name = "SpanishGreetingServiceImpl")
    GreetingService getSEGreetingService(GreetingServiceFactory factory){
        return factory.create(GreetingServiceType.SE);
    }

    @Bean(name = "PrimaryGreetingServiceImpl")
    @Primary
    GreetingService getDefaultGreetingService(GreetingServiceFactory factory){
        return factory.create(GreetingServiceType.PRIMARY);
    }


    @Bean(name ="SetterGreetingController")
    SetterGreetingController getSetterGreetingController() {
        return new SetterGreetingController();
    }

    @Bean(name ="PropertyInjectedController")
    PropertyInjectedController getPropertyInjectedController() {
        return new PropertyInjectedController();
    }

    @Bean(name ="ConstructorInjectedController")
    ConstructorInjectedController getConstructorInjectedController(@Qualifier("FrenchGreetingServiceImpl") GreetingService greetingService) {
        return new ConstructorInjectedController(greetingService);
    }

    @Bean(name ="MyController")
    MyController getMyController(GreetingService greetingService) {
        return new MyController(greetingService);
    }


}
