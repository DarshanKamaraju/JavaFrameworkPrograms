package com.kodnest.hibernate2.HibernateProject2;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Bike {
	@Id
    int bike_No;
    String bike_brand;
    int bike_cost;
    
	public Bike() {
		super();
	}
	public Bike(int bike_No, String bike_brand, int bike_cost) {
		super();
		this.bike_No = bike_No;
		this.bike_brand = bike_brand;
		this.bike_cost = bike_cost;
	}
	
	public int getBike_No() {
		return bike_No;
	}
	public void setBike_No(int bike_No) {
		this.bike_No = bike_No;
	}
	public String getBike_brand() {
		return bike_brand;
	}
	public void setBike_brand(String bike_brand) {
		this.bike_brand = bike_brand;
	}
	public int getBike_cost() {
		return bike_cost;
	}
	public void setBike_cost(int bike_cost) {
		this.bike_cost = bike_cost;
	}
	@Override
	public String toString() {
		return "Bike [bike_No=" + bike_No + ", bike_brand=" + bike_brand + ", bike_cost=" + bike_cost + "]";
	}
    
}
