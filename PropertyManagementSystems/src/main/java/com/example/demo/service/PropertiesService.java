package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.PropertyDTO;
import com.example.demo.repo.PropertiesRepo;
@Service
public class PropertiesService  implements PropertiesServiceInterface{
	
	@Autowired
	private PropertiesRepo propertiesRepo;

	@Override
	public PropertyDTO saveProperty(PropertyDTO propertyDto) {
	return 	propertiesRepo.save(propertyDto);
		
	}

}
