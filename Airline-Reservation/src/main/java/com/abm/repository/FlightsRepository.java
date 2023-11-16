package com.abm.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.abm.dto.FlightUpdateRequest;
import com.abm.entity.Flights;

@Repository
public interface FlightsRepository extends JpaRepository<Flights, Long>{

	List<Flights> findByFromAndTo(String from, String to);

	Flights findByFlightId(Long flightId);

	@Query("select count(c) from Flights c where c.flightId = ?1")
	Long findIfFlightExists(Long flightId);



}
