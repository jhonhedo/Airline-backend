package com.abm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.abm.entity.Passengers;

@Repository
public interface PassengersRepository  extends JpaRepository<Passengers, Long>{
     
	@Query("select count(c) from Passengers c where c.passengerId = ?1")
	Long findIfPassengerExists(Long passengerId);

}
