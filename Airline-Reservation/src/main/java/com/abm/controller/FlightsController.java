package com.abm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.abm.entity.Flights;
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
	
	//http://localhost:7777/flights-controller/flight-search?from=mumbai&to=goa

		@GetMapping("/flight-search") 
public List<Flights> flightSearching(@RequestParam String from, String to){
		List<Flights>list=	flightsService.flightSearching(from,to);
		return list;
			
		}
	
}
