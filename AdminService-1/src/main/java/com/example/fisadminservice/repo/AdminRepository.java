package com.example.fisadminservice.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.fisadminservice.model.Admin;

public interface AdminRepository extends JpaRepository<Admin,Integer>{
	
	

}
