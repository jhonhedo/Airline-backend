package com.abm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abm.entity.Airline;
import com.abm.entity.Flights;
import com.abm.exception.AirlineServiceException;
import com.abm.repository.AirlineRepository;

@Service
public class AirlineService {
	@Autowired
	AirlineRepository airlineRepository;
	
	/*public String addAirline(Airline airline) {
		airlineRepository.save(airline);
		
		return "added airline successfully..!!";
		

	}*/
	public Long addAirline(Airline airline) {
		Long count=airlineRepository.findIfAirlineExists(airline.getName());
		
		if(count==0) {
			for(Flights flights : airline.getFlights()) {
				flights.setAirline(airline);
			}
			Airline savedAirline=airlineRepository.save(airline);
			return savedAirline.getAirlineId();
		}
		else {
			throw new AirlineServiceException("Airline already exists");
		}
		
	}
	
	

}
