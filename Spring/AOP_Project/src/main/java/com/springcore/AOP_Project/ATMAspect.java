package com.springcore.AOP_Project;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Aspect
@Component
@EnableAspectJAutoProxy
public class ATMAspect {
	
	@Pointcut("execution(public void credit())")
	public void welcomethanku(){}
	@Before("execution(public void credit())")
	public void welcome()
	{
		System.out.println("Welcome to ATM");
	}
	
	@After("execution(public void credit())")
	public void thanku()
	{
		System.out.println("Thank you");
	}
}
