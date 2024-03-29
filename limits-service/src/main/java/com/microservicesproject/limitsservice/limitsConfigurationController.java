package com.microservicesproject.limitsservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservicesproject.limitsservice.bean.Configuration;
import com.microservicesproject.limitsservice.bean.LimitConfiguration;

@RestController
public class limitsConfigurationController {

	 @Autowired
	 private Configuration configuration;
	@GetMapping("/limits")
	public LimitConfiguration retrieveLimitsFromConfiguration()
	{
	return new LimitConfiguration(configuration.getMaximum(), configuration.getMinimum());	
		
	}
	
}
