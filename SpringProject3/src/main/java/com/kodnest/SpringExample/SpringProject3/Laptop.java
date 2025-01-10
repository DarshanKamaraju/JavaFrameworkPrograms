package com.kodnest.SpringExample.SpringProject3;

public class Laptop {
	int SrNo;
	String brand;
	float cost;
	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Laptop(int srNo, String brand, float cost) {
		super();
		SrNo = srNo;
		this.brand = brand;
		this.cost = cost;
	}
	public int getSrNo() {
		return SrNo;
	}
	public void setSrNo(int srNo) {
		SrNo = srNo;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "Laptop [SrNo=" + SrNo + ", brand=" + brand + ", cost=" + cost + "]";
	}
	

}
