package com.example.fisadminservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.fisadminservice.model.PassengerDto;
import com.example.fisadminservice.model.Admin;
import com.example.fisadminservice.service.AdminService;

@RestController
@RequestMapping("/admin")
public class AdminController {
	
	@Autowired
	AdminService service;
	
	
	
	@GetMapping("/all")
	public List<Admin> getAll(){
		return service.findAllAdmin();
	}
	
	@GetMapping("/search/passenger/{airline}")
	public List<PassengerDto> searchByAirline(@PathVariable("airline") String airline){
		return service.findByAirline(airline);
		
	}
	
	
	
}
