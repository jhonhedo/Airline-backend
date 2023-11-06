package com.abm.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abm.repository.SeatAvailabilityRepository;

@RestController
@RequestMapping("/seatavailability-controller")
public class SeatAvailabilityController {
	@Autowired
	private SeatAvailabilityRepository seatAvailabilityRepository;
	
	private static final Logger log = LoggerFactory.getLogger(SeatAvailabilityController.class);

}
