package com.abm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abm.entity.AdminRegistration;
import com.abm.repository.AdminRegistrationRepository;

@Service
public class AdminRegistrationService {

	@Autowired
	private AdminRegistrationRepository  adminRegistrationRepository;

	public String adminRegistration(AdminRegistration request) {
		adminRegistrationRepository.save(request);
		return "Admin Registration Successfully..!";

	}

}
