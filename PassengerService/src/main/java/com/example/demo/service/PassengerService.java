package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Passenger;



public interface PassengerService {
	public List<Passenger> getAllPassenger();
	public List<Passenger> searchByAirline(String airline);
}
