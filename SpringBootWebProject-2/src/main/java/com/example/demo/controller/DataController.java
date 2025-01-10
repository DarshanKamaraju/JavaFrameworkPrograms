package com.example.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/control")
public class DataController 
{
	@PostMapping
	public String displayData(@RequestParam String name,int marks1
			,int marks2,int marks3,int marks4,int marks5)
	{
		double per=((marks1+marks2+marks3+marks4+marks5)/500.0)*100.0;
		return name+"Percentage is " +per+"%";
	}
	
	

}
