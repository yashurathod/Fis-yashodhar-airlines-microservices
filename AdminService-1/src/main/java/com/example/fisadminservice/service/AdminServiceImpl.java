package com.example.fisadminservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.client.RestTemplate;

import com.example.fisadminservice.model.PassengerDto;
import com.example.fisadminservice.model.Admin;
import com.example.fisadminservice.repo.AdminRepository;


@Service
public class AdminServiceImpl implements AdminService{
	
	@Autowired
	FeignProxy proxy;
	
	@Autowired
	RestTemplate template;
	
	@Autowired
	AdminRepository repo;
	
	 
	@Override

	public List<Admin> findAllAdmin() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}
	
	
	@Override
	public List<PassengerDto> findByAirline(String airline) {
		// TODO Auto-generated method stub
		return proxy.searchByairline(airline);
	}
	
	@Override
	public Admin addNewFlight(Admin admin) {
		return repo.save(admin);
	}

	@Override
	public Admin updateFlight(Admin admin) {
		if(repo.existsById(admin.getFlight_id())){
			return repo.save(admin);
		}
	return null;
	}

	@Override
	public String deleteFlight(int flight_id) {
		repo.deleteById(flight_id);
		return "Flight cancelled!";

	
}
}
