package com.abm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abm.entity.Passengers;
import com.abm.entity.Reservation;
import com.abm.exception.ReservationServiceException;
import com.abm.repository.ReservationRepository;

@Service
public class ReservationService {
	@Autowired
	private ReservationRepository reservationRepository;

	public Long addReservation(Reservation reservation) {
		  
		Long count=reservationRepository.findIfReservationExists(reservation.getReservationId());
		if(count==0) {
			/*for(Passengers passengers:reservation.getReservationId()) {
				passengers.setReservation(reservation);*/
			
			 List<Passengers> passengersList = reservation.getPassengers(); // Use the correct method to get passengers
	            for (Passengers passengers : passengersList) {
	                passengers.setReservation(reservation);
			}
			Reservation savedReservations=reservationRepository.save(reservation);
			return savedReservations.getReservationId();
		}
		else {
			throw new ReservationServiceException("Reservation already exists");
		}
		
	}

}
