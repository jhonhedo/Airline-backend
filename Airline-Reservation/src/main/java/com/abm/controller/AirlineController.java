package com.abm.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abm.entity.Airline;
import com.abm.service.AirlineService;

@RestController
@CrossOrigin
@RequestMapping("/airline-controller")
public class AirlineController {

	@Autowired
	private AirlineService airlineService;
	
	private static final Logger log = LoggerFactory.getLogger(AirlineController.class);
	
	@PostMapping("/add-airline")
	public String addAirline(@RequestBody Airline airline) {
		return	 airlineService.addAirline(airline);
	}
	//http://localhost:7777/airline-controller/add-airline

}
