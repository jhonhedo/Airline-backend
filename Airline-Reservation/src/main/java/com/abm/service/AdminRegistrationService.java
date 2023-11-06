package com.abm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties.Admin;
import org.springframework.stereotype.Service;

import com.abm.entity.AdminRegistration;
import com.abm.entity.Users;
import com.abm.repository.AdminRegistrationRepository;

@Service
public class AdminRegistrationService {

	@Autowired
	private AdminRegistrationRepository  adminRegistrationRepository;

	public String adminRegistration(AdminRegistration request) {
		adminRegistrationRepository.save(request);
		return "Admin Registration Successfully..!";

	}

	public AdminRegistration  findByUserNameAndPassword(String adminName, String password) {
		AdminRegistration response=adminRegistrationRepository.findByAdminNameAndPassword(adminName, password);
		return  response;

		/*
		 * if (user != null) { return "Login successful"; } else { return
		 * "Login failed. Invalid credentials."; }
		 */
    }

}
