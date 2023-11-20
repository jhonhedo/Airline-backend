package com.abm.entity;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import com.abm.entity.Users;
@Entity
@Table(name = "tbl_Reservations")
public class Reservation {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Reservation_Id")
	private Long reservationId;

	@ManyToOne
	@JoinColumn(name = "User_Id")
	private Users user;

	@ManyToOne
	@JoinColumn(name = "Flight_Id")
	private Flights flight;

	@Column(name = "Reservation_Date")
	private LocalDate reservationDate;

	@Column(name = "Seat_Number")
	private String seatNumber;

	@Column(name = "Status")
	private String status;

	/*
	 * @ManyToOne
	 * 
	 * @JoinColumn(name = "Passenger_Id")
	 */
	@OneToMany(mappedBy = "reservation")
	private List<Passengers> passengers;

	@OneToOne(mappedBy = "reservation")
	private Payments payment;

	@Column(name = "flight_class")
	private String flightClass;

	public Long getReservationId() {
		return reservationId;
	}

	public void setReservationId(Long reservationId) {
		this.reservationId = reservationId;
	}

	public Users getUser() {
		return user;
	}


	public void setUser(Users user) {
		this.user = user;
	}

	public Flights getFlight() {
		return flight;
	}

	public void setFlight(Flights flight) {
		this.flight = flight;
	}

	public LocalDate getReservationDate() {
		return reservationDate;
	}

	public void setReservationDate(LocalDate reservationDate) {
		this.reservationDate = reservationDate;
	}

	public String getSeatNumber() {
		return seatNumber;
	}

	public void setSeatNumber(String seatNumber) {
		this.seatNumber = seatNumber;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public List<Passengers> getPassengers() {
		return passengers;
	}
	

	

	public void setPassengers(List<Passengers> passengers) {
		this.passengers = passengers;
	}

	public Payments getPayment() {
		return payment;
	}

	public void setPayment(Payments payment) {
		this.payment = payment;
	}

	public String getFlightClass() {
		return flightClass;
	}

	public void setFlightClass(String flightClass) {
		this.flightClass = flightClass;
	}


}
