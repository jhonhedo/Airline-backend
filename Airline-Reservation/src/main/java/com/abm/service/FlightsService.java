package com.abm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abm.entity.Flights;
import com.abm.repository.FlightsRepository;
import com.abm.request.FlightsAddingRequest;

@Service
public class FlightsService {  

	@Autowired
	FlightsRepository  flightsRepository;

	public String addFlights(FlightsAddingRequest request) {
		Flights flights=new Flights();
		flights.setFrom(request.getFrom());
		flights.setTo(request.getTo());
		flights.setArrivalTime(request.getArrivalTime());
		flights.setDepartureTime(request.getDepartureTime());
		flights.setAirline(request.getAirline());
		//flights.setAirline(request.getAirline());
		flightsRepository.save(flights);
		return "Flight added successfully...!!";

	}

	public List<Flights> flightSearching(String from, String to) {
		
		return flightsRepository.findByFromAndTo(from, to);
		
	}



}
