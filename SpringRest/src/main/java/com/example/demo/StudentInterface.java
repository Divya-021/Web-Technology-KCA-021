package com.example.demo;

import java.util.List;

public interface StudentInterface {

	public List<Student> getStudents();
	public Student getStudent(int sid);
	public Student addStudent(Student student);
}
