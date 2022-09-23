package com.example.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.model.Passenger;



public interface PassengerRepository extends JpaRepository<Passenger, Integer> {
	@Query("select u from Passenger u where u.airline=?1")
	public List<Passenger> searchByAirline(String airline);

	

}
