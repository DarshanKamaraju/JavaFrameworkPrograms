package com.kodnest.hibernate2.Hibernate1To1BiDirectionalMapping;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Person {
	@Id
	int P_id;
	String P_name;
	int P_age;
	@OneToOne
    Bike b;
	
	public Person() {
		super();
    }

	public Person(int p_id, String p_name, int p_age, Bike b) {
		super();
		P_id = p_id;
		P_name = p_name;
		P_age = p_age;
		this.b = b;
	}

	public int getP_id() {
		return P_id;
	}

	public void setP_id(int p_id) {
		P_id = p_id;
	}

	public String getP_name() {
		return P_name;
	}

	public void setP_name(String p_name) {
		P_name = p_name;
	}

	public int getP_age() {
		return P_age;
	}

	public void setP_age(int p_age) {
		P_age = p_age;
	}

	public Bike getB() {
		return b;
	}

	public void setB(Bike b) {
		this.b = b;
	}

	@Override
	public String toString() {
		return "Person [P_id=" + P_id + ", P_name=" + P_name + ", P_age=" + P_age + ", b=" + b + "]";
	}

	
}
