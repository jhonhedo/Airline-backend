package com.abm.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.abm.dto.FlightAddingStatus;
import com.abm.dto.FlightUpdateRequest;
import com.abm.dto.FlightsAddingRequest;
import com.abm.entity.Flights;
import com.abm.exception.FlightServiceException;
import com.abm.service.FlightsService;

@RestController
@RequestMapping("/flights-controller")
@CrossOrigin
public class FlightsController {

	@Autowired
	private FlightsService flightsService;
	// Start writing the Methods regarding to flights
	private static final Logger log = LoggerFactory.getLogger(FlightsController.class);

	/*
	 * { "departureTime": "2023-11-05T10:00:00", "arrivalTime":
	 * "2023-11-05T15:30:00", "from": "City A", "to": "City B" }
	 */
	// http://localhost:7777/flights-controller/adding-flights
	/*@PostMapping("/adding-flights")
	public String addFlights(@RequestBody FlightsAddingRequest request) {
		String response = flightsService.addFlights(request);

		return response;
	}*/
	
	@PostMapping("/adding-flights")
	public FlightAddingStatus addFlights(@RequestBody Flights flights) {
		try {
			Long id=flightsService.addFlights(flights);
			
			FlightAddingStatus status=new FlightAddingStatus();
			status.setStatus(true);
			status.setMessageIfAny("Flight added successfully");
			status.setFlightId(id);
			
			return status;
		}
		catch (FlightServiceException e) {
			FlightAddingStatus status=new FlightAddingStatus();
			status.setStatus(false);
			status.setMessageIfAny(e.getMessage());
			return status;
		}
		//http://localhost:7777/flights-controller/adding-flights
	}

	// http://localhost:7777/flights-controller/flight-search?from=mumbai&to=goa

	@GetMapping("/flight-search")
	public List<Flights> flightSearching(@RequestParam String from, @RequestParam String to) {
		List<Flights> list = flightsService.flightSearching(from, to);

		return list;

	}

	
	 //now i am working on admin login so, flows are in comment i.e updates
	 
	 @PutMapping("/update-flight/{flightId}")
	 public String  flightUpdate( @RequestBody Flights	request, @PathVariable Long  flightId) {
	 
	 String result=flightsService.flightUpdate(request);
	 
	 return result; 
	 }
//	http://localhost:7777/flights-controller/update-flight/{flightId}1001

	

	@DeleteMapping("/delete-flight/{flightId}")
	public String deleteByFlightId(@PathVariable Long flightId) {
		// log.info("controller before"+orderId);
		String response = flightsService.deleteByFlightId(flightId);
		return response;
	}
	// http://localhost:7777/flights-controller/delete-flight/{orderId}
	
	@GetMapping("/fetch-details/{flightId}")
	public Flights fetchDetailsByFlightId(@PathVariable Long flightId) {
		Flights flights= flightsService.fetchDetailsByFlightId(flightId);
		return flights;
		
	}
	// http://localhost:7777/flights-controller/fetch-details/1001
	

}
