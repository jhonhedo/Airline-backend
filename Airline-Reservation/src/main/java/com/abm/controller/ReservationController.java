package com.abm.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abm.repository.ReservationRepository;

@RestController
@CrossOrigin
@RequestMapping("/reservation_controller")
public class ReservationController {
	
	@Autowired
	private ReservationRepository reservationRepository;
	//start writing the methds regardinbg to the reservations
	private static final Logger log = LoggerFactory.getLogger(ReservationController.class);

}
