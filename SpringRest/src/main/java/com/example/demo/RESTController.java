package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RESTController {

	@Autowired
	StudentInterface students;
	//Services of GETS
	@GetMapping("/students")
	public List<Student> getStudents()
	{
		return students.getStudents();
		
	}
	//Services of GET
	@GetMapping("/students/{sid}")
	public Student getStudent(@PathVariable int sid)
	{
		return students.getStudent(sid);
	}
	
	//Services of POST
		@PostMapping("/students")
		public Student getStudent(@RequestBody Student student)
		{
			return students.addStudent(student);
			
		}
	
}
