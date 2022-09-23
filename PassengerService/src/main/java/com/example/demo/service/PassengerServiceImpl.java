package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Passenger;
import com.example.demo.repo.PassengerRepository;



@Service
public class PassengerServiceImpl implements PassengerService {
	
	
	@Autowired
	PassengerRepository repo;


	@Override
	public List<Passenger> getAllPassenger() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}


	@Override
	public List<Passenger> searchByAirline(String airline) {
		// TODO Auto-generated method stub
		return repo.searchByAirline(airline);
	}
	
	

}
