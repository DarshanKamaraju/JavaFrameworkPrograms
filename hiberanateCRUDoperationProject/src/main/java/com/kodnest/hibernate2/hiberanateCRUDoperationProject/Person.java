package com.kodnest.hibernate2.hiberanateCRUDoperationProject;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Person {
	@Id
    int p_id;
    String p_name;
    int p_age;
    String p_email;
    long p_phone;
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(int p_id, String p_name, int p_age, String p_email, long p_phone) {
		super();
		this.p_id = p_id;
		this.p_name = p_name;
		this.p_age = p_age;
		this.p_email = p_email;
		this.p_phone = p_phone;
	}
	public int getP_id() {
		return p_id;
	}
	public void setP_id(int p_id) {
		this.p_id = p_id;
	}
	public String getP_name() {
		return p_name;
	}
	public void setP_name(String p_name) {
		this.p_name = p_name;
	}
	public int getP_age() {
		return p_age;
	}
	public void setP_age(int p_age) {
		this.p_age = p_age;
	}
	public String getP_email() {
		return p_email;
	}
	public void setP_email(String p_email) {
		this.p_email = p_email;
	}
	public long getP_phone() {
		return p_phone;
	}
	public void setP_phone(long p_phone) {
		this.p_phone = p_phone;
	}
	@Override
	public String toString() {
		return "Person [p_id=" + p_id + ", p_name=" + p_name + ", p_age=" + p_age + ", p_email=" + p_email
				+ ", p_phone=" + p_phone + "]";
	}
	
    
}
