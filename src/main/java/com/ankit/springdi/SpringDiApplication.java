package com.ankit.springdi;

import com.ankit.springdi.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringDiApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(SpringDiApplication.class, args);
		MyController myController = (MyController) context.getBean("myController");
		System.out.println(myController.sayHello());
	}

}
