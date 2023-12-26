package com.springcore.lifecycle;

public class BeanClass {
private double price;

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	this.price = price;
	System.out.println("setprice called");
}

public BeanClass() {
	super();
	// TODO Auto-generated constructor stub
}

@Override
public String toString() {
	return "BeanClass [price=" + price + "]";
}
public void init()
{
	System.out.println("init called");
}
public void destroy()
{
	System.out.println("destroy called");
}

}
