package com.springcore.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext context= new AnnotationConfigApplicationContext(Config.class);
Student s=context.getBean(Student.class);
System.out.println(s);
s.display();
	}

	
}
