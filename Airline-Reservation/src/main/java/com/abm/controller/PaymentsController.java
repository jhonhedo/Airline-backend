package com.abm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.abm.repository.PaymentsRepository;

@Controller
public class PaymentsController {
	
	@Autowired
	private PaymentsRepository paymentsRepository;
	//start writing the method regarding to the payments

}
