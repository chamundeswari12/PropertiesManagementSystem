package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.PropertyDTO;
import com.example.demo.service.PropertiesService;

@RestController

public class PropertyController {
	
	@Autowired
	PropertiesService propertiesService;
	@GetMapping("/hello")
	public String getHello()
	{
		return "hello";
	}

	
	
	
	
	@GetMapping("/savedProperty")
	public ResponseEntity<PropertyDTO>  saveproperty(@RequestBody PropertyDTO dto)
	{
	return new ResponseEntity<PropertyDTO>(propertiesService.saveProperty(dto), HttpStatus.OK);
	}
}
