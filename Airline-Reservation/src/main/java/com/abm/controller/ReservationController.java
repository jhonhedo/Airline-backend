package com.abm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.abm.repository.ReservationRepository;

@Controller
public class ReservationController {
	
	@Autowired
	private ReservationRepository reservationRepository;
	//start writing the methds regardinbg to the reservations

}
