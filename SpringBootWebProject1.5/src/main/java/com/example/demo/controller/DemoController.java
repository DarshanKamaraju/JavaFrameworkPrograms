package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("control")
public class DemoController 
{
	@GetMapping
	public String displayData(@RequestParam String Data)
	{
		return "Entered data is :"+Data;
	}

}
