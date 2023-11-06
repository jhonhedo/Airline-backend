package com.abm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.abm.entity.Airline;

@Repository
public interface AirlineRepository  extends JpaRepository<Airline, Long>{

}
