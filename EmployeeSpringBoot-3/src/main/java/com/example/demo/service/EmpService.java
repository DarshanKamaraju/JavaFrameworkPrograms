package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Employee;

public interface EmpService 
   {
	public String addEmp(Employee e);
	
	 Employee getEmpInfo(String empId);
	 
	 List<Employee> getAllEmpInfo();
	 
	 String updateEmp(Employee e);
	 
	 String deleteEmp(String empId);
	 }
