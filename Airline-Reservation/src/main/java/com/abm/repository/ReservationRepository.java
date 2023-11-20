package com.abm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.abm.entity.Reservation;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation, Long> {
    
	@Query("select count(c) from Reservation c where c.reservationId = ?1")
	Long findIfReservationExists(Long reservationId);

}
