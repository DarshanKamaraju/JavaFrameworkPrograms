package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;
import com.example.demo.repositories.EmplyeeRepository;
@Service
public class EmpServiceImplementation implements EmpService{
	
	EmplyeeRepository emprepo;

	public EmpServiceImplementation(EmplyeeRepository emprepo) {
		super();
		this.emprepo = emprepo;
	}

	@Override
	public String addEmp(Employee e) {
		emprepo.save(e);
		return "Emplyee is created and Saved";
		
	}

	@Override
	public Employee getEmpInfo(String empId) {
		Employee e=emprepo.findById(empId).get();
		return e;
	}

	@Override
	public List<Employee> getAllEmpInfo() {
		 List<Employee> empList=emprepo.findAll();
		return empList;
	}

	@Override
	public String updateEmp(Employee e) {
	  emprepo.save(e);
		return "Emplyee object is updated and saved";
	}

	@Override
	public String deleteEmp(String empId) {
		emprepo.deleteById(empId);
		return "Employee object is deleted";
	}


	
}
