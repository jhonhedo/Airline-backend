package com.abm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abm.entity.Flights;
import com.abm.repository.FlightsRepository;
import com.abm.request.FlightUpdateRequest;
import com.abm.request.FlightsAddingRequest;

@Service
public class FlightsService {  

	@Autowired
	private FlightsRepository  flightsRepository;
	/*
	 * @Autowired private AirlineRepository airlineRepository;
	 */

	public String addFlights(FlightsAddingRequest request) {
		Flights flights=new Flights();
		flights.setFrom(request.getFrom());
		flights.setTo(request.getTo());
		flights.setArrivalTime(request.getArrivalTime());
		flights.setDepartureTime(request.getDepartureTime());
		//flights.setAirline(airlineRepository.getAirLineById(request.getAirlineId()));
		//flights.setAirline(request.getAirline());
		flightsRepository.save(flights);
		return "Flight added successfully...!!";

	}

	public List<Flights> flightSearching(String from, String to) {
		
		return flightsRepository. findByFromAndTo(from,to);
	}

	/*
	 * public String flightUpdate(String flightId, FlightUpdateRequest request) {
	 * 
	 * flightsRepository.flightUpdata(flightId,request); return null; }
	 */
	


}
