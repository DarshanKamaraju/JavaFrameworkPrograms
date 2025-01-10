package com.example.demo.services;

import java.util.List;

import com.example.demo.entities.Bike;


public interface BikeService {
	
	public String createBike(Bike b);
	
	public List<Bike> fetchAllBike();
	
	public String updateBike(Bike b);
	
	public String deleteBike(String engNo);
	
	
	

}
