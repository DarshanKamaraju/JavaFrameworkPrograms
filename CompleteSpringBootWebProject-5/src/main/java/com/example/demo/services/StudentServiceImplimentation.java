package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;

@Service
public class StudentServiceImplimentation implements StudentService
{
	@Autowired
	StudentRepository stdrepo;

	@Override
	public String createStudent(Student s) {
		stdrepo.save(s);
		return "Student is created and saved";
	}

	@Override
	public List<Student> readStudent() {
		List<Student> stdobject=stdrepo.findAll();
		return stdobject;
	}
     /*
	@Override
	public String updateStudent(Student s) {
		stdrepo.save(s);
		return "Student details is updated";
	}

	@Override
	public String deleteStudent(String roll) {
		stdrepo.deleteById(roll);
		return "Student object is deleted";
	}
	*/
}
