package com.example.demo.entities;

public class Student {
	String kodId;
	String name;
	int age;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String kodId, String name, int age) {
		super();
		this.kodId = kodId;
		this.name = name;
		this.age = age;
	}
	public String getKodId() {
		return kodId;
	}
	public void setKodId(String kodId) {
		this.kodId = kodId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [kodId=" + kodId + ", name=" + name + ", age=" + age + "]";
	}
	
}
