package com.Subhajit.microservice.limitsservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Subhajit.microservice.limitsservice.bean.Limits;
import com.Subhajit.microservice.limitsservice.config.Configuration;

@RestController
public class LimitsController {
@Autowired
	private Configuration config; 
	@GetMapping("/limits")
	public Limits retreiveLimits() {
		
		return new Limits(config.getMinimum(),config.getMaximum());
		//return new Limits(1,1000);
	}
}
