package com.ankit.springdi;

import com.ankit.springdi.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"com.ankit.springdi","com.ankit.localEntity"})
@SpringBootApplication
public class SpringDiApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(SpringDiApplication.class, args);
//		Object lifeCycleDemoBean = context.getBean("lifeCycleDemoBean");
		beanDiTest(context);
	}

	private static void beanDiTest(ConfigurableApplicationContext context) {
		I18nController i18nController = (I18nController) context.getBean("i18nController");
		System.out.println(i18nController.sayHello());

//		MyController myController = (MyController) context.getBean("myController");
//		System.out.println(myController.sayHello());

//		System.out.println("property ..............");
//		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) context.getBean("propertyInjectedController");
//		System.out.println(propertyInjectedController.getGreeting());
//
//		System.out.println("setter ..............");
//		SetterGreetingController setterGreetingController = (SetterGreetingController) context.getBean("setterGreetingController");
//		System.out.println(setterGreetingController.getGreeting());
//
//		System.out.println("constructor ..............");
//		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) context.getBean("constructorInjectedController");
//		System.out.println(constructorInjectedController.getGreeting());

		PetController petController = (PetController) context.getBean("PetController");
		petController.run();
	}

}
