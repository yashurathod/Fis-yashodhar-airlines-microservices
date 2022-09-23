package com.example.fisadminservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
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
	

	
}
