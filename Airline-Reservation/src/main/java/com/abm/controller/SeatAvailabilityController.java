package com.abm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.abm.repository.SeatAvailabilityRepository;

@Controller
public class SeatAvailabilityController {
	@Autowired
	private SeatAvailabilityRepository seatAvailabilityRepository;

}
