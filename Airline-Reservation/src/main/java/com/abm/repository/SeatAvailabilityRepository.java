package com.abm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.abm.entity.SeatAvailability;

@Repository
public interface SeatAvailabilityRepository  extends JpaRepository<SeatAvailability, Long>{

}
