package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.entity.Student;
import com.example.demo.services.StudentService;
@Controller
public class StudentController 
{
	@Autowired
	StudentService stdservice;
	
	@GetMapping("/map-create")
	public String mapCreateStudent()
	{
		return "createStudent";
	}
	
	@PostMapping("/createStudent")
    public String createStudent(@ModelAttribute Student s) {
		String msg=stdservice.createStudent(s);//calling the method present inside the StudentService.java
		return "createStudentSuccess";
	}
	@GetMapping("/read-student")
	public String readStudent(Model model)
	{
		List<Student>  listStudvalues =stdservice.readStudent();
		model.addAttribute("students", listStudvalues);
		return "viewstudent";
	}
	/*
	@GetMapping("/update-student")
	@PutMapping()
	public String updateStudent(@RequestBody Student s) {
		String msg=stdservice.updateStudent(s);
		return "Student details is updated";
	}
	@GetMapping("/delete-student")
	public String deleteStd()
	{
		return"studentdelete";
	}
    @GetMapping("/delete-student")
    @DeleteMapping(value="{roll}")
	public String deleteStudent(@PathVariable String roll)
	{
		String msg=stdservice.deleteStudent(roll);
		return "studentdelete";
	}
	*/
}
