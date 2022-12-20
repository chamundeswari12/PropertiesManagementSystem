package com.example.demo.controller;

import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

	
	
	@GetMapping("/add/{num1}/{num2}")
	public Double add(@PathVariable Double num1,@PathVariable Double num2)
	{
		return num1+num2;
	}
}
