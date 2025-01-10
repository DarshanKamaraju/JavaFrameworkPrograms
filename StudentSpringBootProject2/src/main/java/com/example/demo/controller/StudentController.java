package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Student;

@RestController   //Any method in rest controller class will always return something
@RequestMapping("stud")
public class StudentController
{
	@GetMapping("{kodId}")
	public Student getStudentInfo(@PathVariable String kodId)
	{
		Student st=new Student(kodId,"Amith",23);
		return st;
	}
}
