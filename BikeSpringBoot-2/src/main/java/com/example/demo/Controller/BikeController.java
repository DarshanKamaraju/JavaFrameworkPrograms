package com.example.demo.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Bike;
import com.example.demo.services.BikeService;


@RestController
@RequestMapping("/bike")
public class BikeController {
	BikeService bkservice;

	public BikeController(BikeService bkservice) {
		super();
		this.bkservice = bkservice;
	}
	@PostMapping
	public String createBike(@RequestBody Bike b)
	{
		String msg=bkservice.createBike(b);
		return msg;
	}
	
}
