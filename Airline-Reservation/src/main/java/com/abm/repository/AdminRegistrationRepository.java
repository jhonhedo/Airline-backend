package com.abm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abm.entity.AdminRegistration;
import com.abm.entity.Users;

public interface AdminRegistrationRepository extends JpaRepository<AdminRegistration, Integer>{

	AdminRegistration findByAdminNameAndPassword(String userName, String password);

}
