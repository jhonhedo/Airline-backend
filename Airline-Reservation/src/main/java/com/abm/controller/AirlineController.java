package com.abm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import com.abm.repository.AirlineRepository;

@RestController
@CrossOrigin
public class AirlineController {

	@Autowired
	private AirlineRepository airlineRepository;
	//start writing the methods regarding to airline

}
