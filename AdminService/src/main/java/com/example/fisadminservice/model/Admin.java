package com.example.fisadminservice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="admin")
public class Admin {
	@Id
	int flight_id ;
	
	@Column
	String airline_id ; 
	@Column
	String from_location;
	@Column
	String to_location ;
	@Column
	String departure_time ;
	@Column
	String arrival_time;
	@Column
	String duration ;
	@Column
	int total_seats ;
	
	Admin(){}

	public Admin(int flight_id, String airline_id, String from_location, String to_location, String departure_time,
			String arrival_time, String duration, int total_seats) {
		super();
		this.flight_id = flight_id;
		this.airline_id = airline_id;
		this.from_location = from_location;
		this.to_location = to_location;
		this.departure_time = departure_time;
		this.arrival_time = arrival_time;
		this.duration = duration;
		this.total_seats = total_seats;
	}

	public int getFlight_id() {
		return flight_id;
	}

	public void setFlight_id(int flight_id) {
		this.flight_id = flight_id;
	}

	public String getAirline_id() {
		return airline_id;
	}

	public void setAirline_id(String airline_id) {
		this.airline_id = airline_id;
	}

	public String getFrom_location() {
		return from_location;
	}

	public void setFrom_location(String from_location) {
		this.from_location = from_location;
	}

	public String getTo_location() {
		return to_location;
	}

	public void setTo_location(String to_location) {
		this.to_location = to_location;
	}

	public String getDeparture_time() {
		return departure_time;
	}

	public void setDeparture_time(String departure_time) {
		this.departure_time = departure_time;
	}

	public String getArrival_time() {
		return arrival_time;
	}

	public void setArrival_time(String arrival_time) {
		this.arrival_time = arrival_time;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public int getTotal_seats() {
		return total_seats;
	}

	public void setTotal_seats(int total_seats) {
		this.total_seats = total_seats;
	}
}
