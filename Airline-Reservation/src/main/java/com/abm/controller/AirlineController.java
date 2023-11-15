package com.abm.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abm.dto.RegistrationStatus;
import com.abm.entity.Airline;
import com.abm.exception.AirlineServiceException;
import com.abm.service.AirlineService;

@RestController
@CrossOrigin
@RequestMapping("/airline-controller")
public class AirlineController {

	@Autowired
	private AirlineService airlineService;
	
	private static final Logger log = LoggerFactory.getLogger(AirlineController.class);
	
/*	@PostMapping("/add-airline")
	public String addAirline(@RequestBody Airline airline) {
		return	 airlineService.addAirline(airline);
	}*/
	//http://localhost:7777/airline-controller/add-airline

	@PostMapping("/add-airline")
	public RegistrationStatus addAirline(@RequestBody Airline airline) {
		try {
			Long id=airlineService.addAirline(airline);
			RegistrationStatus status = new RegistrationStatus();
			status.setStatus(true);
			status.setMessageIfAny("Airline  registered!");
			status.setCustomerId(id);
			
			return status;
		}
		catch (AirlineServiceException e) {
			RegistrationStatus status = new RegistrationStatus();
			status.setStatus(false);
			status.setMessageIfAny(e.getMessage());
			return status;
			
		}
		//http://localhost:7777/airline-controller/add-airline
	}
}
