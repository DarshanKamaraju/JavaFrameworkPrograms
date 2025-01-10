package com.example.demo.Controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entites.Bike;


@RestController
@RequestMapping("bike")
public class BikeController {
	Bike b;
	@PostMapping
	public String createBike(@RequestBody Bike b)
	{
		this.b=b;
		return "Bike is created";
	}
	@GetMapping("{engNo}")
	public Bike fetchBike(@PathVariable String engNo)
	{
		return b;
	}
	
	@PutMapping
	public String updateBike(@RequestBody Bike b)
	{
		this.b=b;
		return "Bike is updated";
	}
	@DeleteMapping("{engNo}")
	public String deleteBike(@PathVariable String engNo)
	{
		b=null;
		return "Bike is deleted";
	}

}
