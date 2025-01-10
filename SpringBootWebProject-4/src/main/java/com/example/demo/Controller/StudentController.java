package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class StudentController {
	@GetMapping("/Create")
	public String createStudent()
	{
		return "createStudent";
	}
	
	@GetMapping("/Read")
	public String readStudent()
	{
		return "readStudent";
	}
	
	@GetMapping("/Update")
	public String updateStudent()
	{
		return "updateStudent";
	}
	
	@GetMapping("/Delete")
	public String deleteStudent()
	{
		return "deleteStudent";
	}
}
