package com.example.demo.Controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Laptop;

@RestController
@RequestMapping("laptop")
public class LaptopController 
    {
	Laptop lap;
	@PostMapping
	public String createLaptop(@RequestBody Laptop lap)
	{
		this.lap=lap;
		return "Laptop is created";
	}
	@GetMapping("{srNo}")
	public Laptop fetchLaptop(@PathVariable String srNo)
	{
		return lap;
	}
	
	@PutMapping
	public String updateLaptop(@RequestBody Laptop lap)
	{
		this.lap=lap;
		return "Laptop is updated";
	}
	@DeleteMapping("{srNo}")
	public String deleteLaptop(@PathVariable String srNo)
	{
		lap=null;
		return "Laptop is deleted";
	}
}
