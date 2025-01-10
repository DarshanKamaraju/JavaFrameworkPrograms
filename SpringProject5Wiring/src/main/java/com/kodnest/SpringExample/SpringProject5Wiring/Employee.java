package com.kodnest.SpringExample.SpringProject5Wiring;

public class Employee {
	int empID;
	String empName;
	int empSalary;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int empID, String empName, int empSalary) {
		super();
		this.empID = empID;
		this.empName = empName;
		this.empSalary = empSalary;
	}
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(int empSalary) {
		this.empSalary = empSalary;
	}
	@Override
	public String toString() {
		return "Employee [empID=" + empID + ", empName=" + empName + ", empSalary=" + empSalary + "]";
	}
	
	

}
