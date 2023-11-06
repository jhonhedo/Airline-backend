package com.abm.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.abm.entity.Flights;

@Repository
public interface FlightsRepository extends JpaRepository<Flights, Long>{

	List<Flights> findByFromAndTo(String from, String to);

	/*
	 * @Query("SELECT f FROM Flights f WHERE f.from = :fromLocation AND f.to = :toLocation"
	 * ) L
	 *ist<Flights> findFlightsByLocations(@Param("fromLocation") String fromLocation, @Param("toLocation") String toLocation);
   */

}
