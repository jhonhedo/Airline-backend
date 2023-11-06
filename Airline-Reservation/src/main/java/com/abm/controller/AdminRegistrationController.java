package com.abm.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.abm.entity.AdminRegistration;
import com.abm.service.AdminRegistrationService;

@RestController
@RequestMapping("/admin-registration")
@CrossOrigin
public class AdminRegistrationController {

	@Autowired
	AdminRegistrationService  adminRegistrationService ;
	
	private static final Logger log = LoggerFactory.getLogger(AdminRegistrationController.class);

	@PostMapping("/add-admin")
	public String adminRegistration(@RequestBody AdminRegistration request) {
		log.info("adminRegistration :"+request);
		return adminRegistrationService.adminRegistration(request);
	}
	//http://localhost:7777/admin-registration/add-admin

	@PostMapping("/admin-login")  //user Login method
    public AdminRegistration adminLogin(@RequestParam String adminName, @RequestParam String password) {
		   return  adminRegistrationService.findByUserNameAndPassword(adminName, password);
     
    }
	////http://localhost:7777/admin-registration/admin-login?adminName=kishore&password=passw0rd
}
