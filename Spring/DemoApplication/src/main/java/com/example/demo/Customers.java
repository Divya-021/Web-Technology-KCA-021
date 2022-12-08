package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
public class Customers {
	private int custid;
	private String custname;
	private String coursename;
	
	@Autowired 			//searches by type
	@Qualifier("tech")	//searches by name
	private Technologies techdetail;

	public Customers() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("object created");
	}
	public int getCustid() {
		return custid;
	}
	public void setCustid(int custid) {
		this.custid = custid;
	}
	public String getCustname() {
		return custname;
	}
	public void setCustname(String custname) {
		this.custname = custname;
	}
	public String getCoursename() {
		return coursename;
	}
	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}
	public void display()
	{
		System.out.println("customers method");
		techdetail.tech();
	}
}
