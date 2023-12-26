package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    AbstractApplicationContext context= new ClassPathXmlApplicationContext("com/springcore/lifecycle/config.xml");
	/*BeanClass b1=(BeanClass) context.getBean("b1");
	System.out.println(b1);*/
	context.registerShutdownHook();
	/*
	System.out.println("+++++++++++++");
	BeanInterface b2=(BeanInterface) context.getBean("b2");
	System.out.println(b2);
	*/
	System.out.println("+++++++++++++");
	BeanAnnotation b3= (BeanAnnotation) context.getBean("b3");
	System.out.println(b3);
	
	}

}
