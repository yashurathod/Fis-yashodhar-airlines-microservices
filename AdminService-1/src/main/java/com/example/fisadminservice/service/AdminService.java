package com.example.fisadminservice.service;

import java.util.List;

import com.example.fisadminservice.model.PassengerDto;
import com.example.fisadminservice.model.Admin;

public interface AdminService {
	
	public List<Admin> findAllAdmin();
	public List<PassengerDto> findByAirline(String airline);
	public Admin addNewFlight(Admin admin);
	public Admin updateFlight(Admin admin);
	public String deleteFlight(int flight_id);
	
}