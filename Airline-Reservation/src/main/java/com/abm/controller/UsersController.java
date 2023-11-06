package com.abm.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.abm.entity.Users;
import com.abm.request.UserRegisterRequest;
import com.abm.service.UsersService;

@RestController
@CrossOrigin("*") 
@RequestMapping("/user-controller")
public class UsersController {
	@Autowired
	UsersService usersService;
	private static final Logger log = LoggerFactory.getLogger(UsersController.class);
	
	@PostMapping("/registration")
	public ResponseEntity<Object> userRegistration(@RequestBody UserRegisterRequest request ) {
		
		ResponseEntity<Object> result=usersService.userRegistration(request);
		return result;
		//http://localhost:7777/user-controller/registration
	}
	
	@PostMapping("/login")  //user Login method
    public Users userLogin(@RequestParam String userName, @RequestParam String password) {
		   return  usersService.findByUserNameAndPassword(userName, password);
     
    }
	//localhost:7777/user-controller/login/userName?=kishore&password?=passw0rd
	//http://localhost:7777/user-controller/login?userName=kishore&password=passw0rd
}
