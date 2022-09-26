package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Passenger;
import com.example.demo.service.PassengerService;



@RestController
@RequestMapping("/passenger")
public class PassengerController {
	@Autowired
	PassengerService service;
	
	@GetMapping("/all")
	public ResponseEntity<List<Passenger>> displayAll(){

		return new ResponseEntity<>(service.getAllPassenger(), HttpStatus.OK);
	}
	@GetMapping("/search/{airline}")
	public ResponseEntity<List<Passenger>> searchByAirline(@PathVariable("airline") String airline){
		return new ResponseEntity<>(service.searchByAirline(airline), HttpStatus.OK);
	}
	

}
