package com.abm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.abm.entity.Airline;

@Repository
public interface AirlineRepository  extends JpaRepository<Airline, Long>{
    
	@Query("select count(c) from Airline c where c.name = ?1")
	Long findIfAirlineExists(String name);

	//Airline getAirlineByAirlineId(Long airlineId);
}
