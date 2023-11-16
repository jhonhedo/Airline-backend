package com.abm.entity;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_Flights")
public class Flights {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Flight_Id")
	private Long flightId;
	private double price;  //added newly

	@ManyToOne(cascade = CascadeType.PERSIST)//important
	@JoinColumn(name = "Airline_Id")
	private Airline airline;

	@Column(name = "departure_time")
	private LocalDateTime departureTime;

	@Column(name = "arrival_time")
	private LocalDateTime arrivalTime;

	@Column(name = "from_location")
	private String from;

	@Column(name = "to_location")
	private String to;
	@OneToMany(mappedBy = "flight", cascade = CascadeType.ALL)
	private List<Reservation> reservations;

	public Long getFlightId() {
		return flightId;
	}

	public void setFlightId(Long flightId) {
		this.flightId = flightId;
	}

	public Airline getAirline() {
		return airline;
	}

	public void setAirline(Airline airline) {
		this.airline = airline;
	}

	public LocalDateTime getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(LocalDateTime departureTime) {
		this.departureTime = departureTime;
	}

	public LocalDateTime getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(LocalDateTime arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	/*
	 * public String getFlightClass() { return flightClass; }
	 * 
	 * public void setFlightClass(String flightClass) { this.flightClass =
	 * flightClass; }
	 */
   
	public List<Reservation> getReservations() {
		return reservations;
	}

	public void setReservations(List<Reservation> reservations) {
		this.reservations = reservations;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	

}
