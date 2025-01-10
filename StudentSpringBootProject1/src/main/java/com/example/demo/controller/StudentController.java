package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController 
{
	@GetMapping("create")
	public String createStudent()
	{
		return "Student object is created";
	}
	@GetMapping("fetch")
	public String fetchStudent()
	{
		return "Student object is fetched";
	}
}
