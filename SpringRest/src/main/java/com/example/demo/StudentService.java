package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class StudentService implements StudentInterface{

	List<Student> students=null; 
	public StudentService() {
		super();
		// TODO Auto-generated constructor stub
		students=new ArrayList<Student>();
		students.add(new Student(1,"Divya", "MCA"));
		students.add(new Student(3,"Neha", "Ph.D"));
		students.add(new Student(2,"Reena", "MBA"));
	}

	@Override
	public List<Student> getStudents() {
		// TODO Auto-generated method stub
		return students;
	}

	@Override
	public Student getStudent(int sid) {
		// TODO Auto-generated method stub
		Student s=null;
		for (Student ss:students)
		{
			if(ss.getSid()==sid)
			{
				s=ss;
				break;
			}
		}
		return s;
	}

	@Override
	public Student addStudent(Student student) {
		// TODO Auto-generated method stub
		students.add(student);
		return student;
	}

	
}
