package com.abm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abm.entity.Passengers;
import com.abm.repository.PassengersRepository;

@Service
public class PassengersService {
	@Autowired
	private PassengersRepository passengersRepository;

	public String  addPassengers(Passengers passengers) {
		passengersRepository.save(passengers);
		return "Passenger added successfully..!!";

	}

}
