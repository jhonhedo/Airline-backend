package com.abm.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.abm.entity.Flights;
import com.abm.request.FlightUpdateRequest;

@Repository
public interface FlightsRepository extends JpaRepository<Flights, Long>{

	List<Flights> findByFromAndTo(String from, String to);



}
