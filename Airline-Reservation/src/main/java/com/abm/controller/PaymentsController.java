package com.abm.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abm.repository.PaymentsRepository;

@RestController
@CrossOrigin
@RequestMapping("/payments_controller")
public class PaymentsController {
	
	@Autowired
	private PaymentsRepository paymentsRepository;
	//start writing the method regarding to the payments
	private static final Logger log = LoggerFactory.getLogger(PaymentsController.class);

}
