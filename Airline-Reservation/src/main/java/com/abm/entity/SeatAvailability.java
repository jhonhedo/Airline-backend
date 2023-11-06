package com.abm.entity;

import javax.persistence.*;

import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "tbl_Seat_Availability")
public class SeatAvailability {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "SeatAvailability_Id")
    private Long seatAvailabilityId;

    @ManyToOne
    @JoinColumn(name = "Flight_Id")
    private Flights flight;

    @Column(name = "Seat_Number")
    private String seatNumber;

    @Column(name = "Is_Available")
    private boolean isAvailable;

    @Column(name = "Date")
    private LocalDate date;

	public Long getSeatAvailabilityId() {
		return seatAvailabilityId;
	}

	public void setSeatAvailabilityId(Long seatAvailabilityId) {
		this.seatAvailabilityId = seatAvailabilityId;
	}

	public Flights getFlight() {
		return flight;
	}

	public void setFlight(Flights flight) {
		this.flight = flight;
	}

	public String getSeatNumber() {
		return seatNumber;
	}

	public void setSeatNumber(String seatNumber) {
		this.seatNumber = seatNumber;
	}

	public boolean isAvailable() {
		return isAvailable;
	}

	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

    
}
