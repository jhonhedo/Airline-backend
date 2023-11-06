package com.abm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abm.entity.Airline;
import com.abm.repository.AirlineRepository;

@Service
public class AirlineService {
	@Autowired
	AirlineRepository airlineRepository;

	public String addAirline(Airline airline) {
		airlineRepository.save(airline);
		
		return "added airline successfully..!!";
		

	}
	

}
