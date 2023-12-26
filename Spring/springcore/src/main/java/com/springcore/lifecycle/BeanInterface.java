package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanInterface implements InitializingBean, DisposableBean{
private double price;

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	this.price = price;
}

public BeanInterface() {
	super();
	// TODO Auto-generated constructor stub
}

@Override
public String toString() {
	return "BeanInterface [price=" + price + "]";
}

@Override
public void afterPropertiesSet() throws Exception {
	// TODO Auto-generated method stub
	System.out.println("calling init thorugh interface");
}

@Override
public void destroy() throws Exception {
	// TODO Auto-generated method stub
	System.out.println("calling destroy thorugh interface");
}

}
