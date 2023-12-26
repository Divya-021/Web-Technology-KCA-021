package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class BeanAnnotation {
private String subject;

public String getSubject() {
	return subject;
}

public void setSubject(String subject) {
	this.subject = subject;
}

public BeanAnnotation() {
	super();
	// TODO Auto-generated constructor stub
}

@Override
public String toString() {
	return "BeanAnnotation [subject=" + subject + "]";
}

@PostConstruct
public void start()
{
	System.out.println("annotation init called");
}

@PreDestroy
public void end()
{
	System.out.println("annotation destroy called");
}
}
