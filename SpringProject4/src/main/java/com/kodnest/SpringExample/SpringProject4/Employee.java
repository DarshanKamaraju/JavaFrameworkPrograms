package com.kodnest.SpringExample.SpringProject4;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee {
	List<String> technology;
	Set<String> project;
	Map<String,String> company;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(List<String> technology, Set<String> project, Map<String, String> company) {
		super();
		this.technology = technology;
		this.project = project;
		this.company = company;
	}
	public List<String> getTechnology() {
		return technology;
	}
	public void setTechnology(List<String> technology) {
		this.technology = technology;
	}
	public Set<String> getProject() {
		return project;
	}
	public void setProject(Set<String> project) {
		this.project = project;
	}
	public Map<String, String> getCompany() {
		return company;
	}
	public void setCompany(Map<String, String> company) {
		this.company = company;
	}
	@Override
	public String toString() {
		return "Employee [technology=" + technology + ", project=" + project + ", company=" + company + "]";
	}

}
