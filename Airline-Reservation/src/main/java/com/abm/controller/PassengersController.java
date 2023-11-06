package com.abm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abm.entity.Passengers;
import com.abm.service.PassengersService;

@RestController
@CrossOrigin
@RequestMapping("/passenger-controller")
public class PassengersController {
	@Autowired
	private PassengersService passengersService;

	  @PostMapping("/add-passenger")
	public String addPassengers(@RequestBody Passengers passengers) {
		return passengersService.addPassengers(passengers);
		
	}
	  //http://localhost/7777/passenger-controller/add-passenger
}
