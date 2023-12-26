package com.springcore.beanscope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	ApplicationContext context=	new ClassPathXmlApplicationContext("com/springcore/beanscope/autoconfig.xml");
	Address add=context.getBean("obj", Address.class);
	System.out.println(add.hashCode());
	Address add1=context.getBean("obj", Address.class);
	System.out.println(add1.hashCode());
	}

}
