package com.example.demo.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entities.Bike;
import com.example.demo.repositories.BikeRepositories;
@Service
public class BikeServiceImplementation implements BikeService{
	
	BikeRepositories bkrep;

	public BikeServiceImplementation(BikeRepositories bkrep) {
		super();
		this.bkrep = bkrep;
	}

	@Override
	public String createBike(Bike b) {
	 bkrep.save(b);
	return "Bike Object is created and saved";
	}

	@Override
	public List<Bike> fetchAllBike() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateBike(Bike b) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteBike(String engNo) {
		// TODO Auto-generated method stub
		return null;
	}

}
