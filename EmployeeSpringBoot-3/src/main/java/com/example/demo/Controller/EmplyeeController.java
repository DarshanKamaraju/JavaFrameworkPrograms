package com.example.demo.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employee;
import com.example.demo.service.EmpService;

@RestController
@RequestMapping("emp")
public class EmplyeeController {
	
	EmpService empservice;

	public EmplyeeController(EmpService empseervice) {
		super();
		this.empservice = empseervice;
	}
	
	@PostMapping
	public String addEmp(@RequestBody Employee e)
	{
		String msg = empservice.addEmp(e);
		return msg;
	}
	@GetMapping(value="{empId}")
	public Employee getEmpInfo(@PathVariable String empId) {
		Employee e=empservice.getEmpInfo(empId);
		return e;
	}	
		@GetMapping()
		public List<Employee> getAllEmpInfo() {
			List<Employee> empList=empservice.getAllEmpInfo();
			return empList;
     }
		@PutMapping()
		public String updateEmp(@RequestBody Employee e) {
			String msg=empservice.updateEmp(e);
			return msg;
		}
		
		@DeleteMapping(value="{empId}")
		public String deleteEmp(@PathVariable String empId) {
			String msg=empservice.deleteEmp(empId);
			return msg;
		}
}
