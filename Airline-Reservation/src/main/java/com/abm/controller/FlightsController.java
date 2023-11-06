package com.abm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abm.repository.FlightsRepository;
import com.abm.request.FlightsAddingRequest;
import com.abm.service.FlightsService;

@RestController
@RequestMapping("/flights-controller")
@CrossOrigin
public class FlightsController{

	@Autowired
	private FlightsService  flightsService;
	//Start writing the Methods regarding to flights
	
	/*
	 * { "departureTime": "2023-11-05T10:00:00", "arrivalTime":
	 * "2023-11-05T15:30:00", "from": "City A", "to": "City B" }
	 */
	//http://localhost:7777/flights-controller/adding-flights
	@PostMapping("/adding-flights")
	public String addFlights(@RequestBody FlightsAddingRequest request) {
		String response=flightsService.addFlights(request);
		
		return response;
		
	}
	
}
