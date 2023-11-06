package com.abm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.abm.entity.Flights;

@Repository
public interface FlightsRepository extends JpaRepository<Flights, Long>{

}
