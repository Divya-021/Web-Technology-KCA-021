package com.example.demo;

public class Student {
	String name;
	String course;
	int sid;
public Student(int sid,String name, String course) {
		super();
		this.name = name;
		this.course = course;
		this.sid = sid;
	}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCourse() {
	return course;
}
public void setCourse(String course) {
	this.course = course;
}
public int getSid() {
	return sid;
}
public void setSid(int sid) {
	this.sid = sid;
}
}
