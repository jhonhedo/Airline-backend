package com.abm.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abm.dto.addPassengersStatus;
import com.abm.entity.Passengers;
import com.abm.exception.PassengerServiceException;
import com.abm.service.PassengersService;

@RestController
@CrossOrigin
@RequestMapping("/passenger-controller")
public class PassengersController {
	@Autowired
	private PassengersService passengersService;
	private static final Logger log = LoggerFactory.getLogger(PassengersController.class);

	/*@PostMapping("/add-passenger")
	public String addPassengers(@RequestBody Passengers passengers) {
		return passengersService.addPassengers(passengers);

	}*/
	//http://localhost/7777/passenger-controller/add-passenger
	 @PostMapping("/add-passenger")
	public addPassengersStatus addPassengers(@RequestBody Passengers passengers) {

		try {			
			Long id=passengersService.addPassengers(passengers);
			addPassengersStatus status=new addPassengersStatus();
			status.setStatus(true);
			status.setMessageIfAny("Passengers added Successfully..!");
			status.setPassengerId(id);		
			return status;
		}
		catch (PassengerServiceException e) {
			addPassengersStatus status=new addPassengersStatus();
			status.setStatus(true);
			status.setMessageIfAny("Passengers added already..!");
			return status;
		}
	}


}
