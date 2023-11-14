package com.abm.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "tbl_Airline")
public class Airline {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Airline_Id")
    private Long airlineId;

    @Column(name = "Name")
    private String name;

    @OneToMany(mappedBy = "airline", cascade = CascadeType.ALL)
    private List<Flights> flights;

	public Long getAirlineId() {
		return airlineId;
	}

	public void setAirlineId(Long airlineId) {
		this.airlineId = airlineId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Flights> getFlights() {
		return flights;
	}

	public void setFlights(List<Flights> flights) {
		this.flights = flights;
	}

    
}
