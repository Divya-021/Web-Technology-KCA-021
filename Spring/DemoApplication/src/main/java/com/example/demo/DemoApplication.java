package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context =SpringApplication.run(DemoApplication.class, args);
		Customers c = context.getBean(Customers.class);
		c.display();
//		Customers c1 = context.getBean(Customers.class);
//		c1.display();
	}

}
