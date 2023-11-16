package com.abm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abm.entity.Flights;
import com.abm.entity.Reservation;
import com.abm.exception.FlightServiceException;
import com.abm.repository.FlightsRepository;

@Service
public class FlightsService {  

	@Autowired
	private FlightsRepository  flightsRepository;
	/*
	 * @Autowired private AirlineRepository airlineRepository;
	 */

	/*public String addFlights(FlightsAddingRequest request) {
		Flights flights=new Flights();
		flights.setFrom(request.getFrom());
		flights.setTo(request.getTo());
		flights.setArrivalTime(request.getArrivalTime());
		flights.setDepartureTime(request.getDepartureTime());
		//flights.setAirline(airlineRepository.getAirLineById(request.getAirlineId()));
		//flights.setAirline(request.getAirline());
		flightsRepository.save(flights);
		return "Flight added successfully...!!";

	}*/

	public List<Flights> flightSearching(String from, String to) {

		return flightsRepository. findByFromAndTo(from,to);
	}


	public String flightUpdate(Flights request) {

		flightsRepository.save(request);
		return "Flight updated successfully...!!";
	}

	public String deleteByFlightId(Long flightId) {
		flightsRepository.deleteById(flightId);
		return "Flight delect successfully...!!";
	}

	public Flights fetchDetailsByFlightId(Long flightId) {
		
		return flightsRepository.findByFlightId(flightId);
	}

	public Long addFlights(Flights flights) {
		Long count=flightsRepository.findIfFlightExists(flights.getFlightId());
		
		if(count==0) {
			for(Reservation reservation:flights.getReservations()) {
				reservation.setFlight(flights);
			}
			Flights savedFlights=flightsRepository.save(flights);
			return  savedFlights.getFlightId();
		}
		else {
			 throw new FlightServiceException("Flight already exixts");
		}
				
	}



}
