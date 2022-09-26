package com.example.fisadminservice.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.fisadminservice.model.PassengerDto;


@FeignClient(name="passengerservice")
public interface FeignProxy {
	
	@GetMapping("passenger/search/{airline}")
	public List<PassengerDto> searchByairline(@PathVariable("airline") String airline);



}
