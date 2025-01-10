package com.example.demo.services;

import java.util.List;

import com.example.demo.entity.Student;

public interface StudentService 
{
	public String createStudent(Student s);
	
	public List<Student> readStudent();
	
	//public String updateStudent(Student s);
	
	//public String deleteStudent(String roll);

}
