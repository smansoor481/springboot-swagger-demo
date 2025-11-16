package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repo.EmployeeRepo;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepo empRepo;
	
	public String getEmployeeService() {
//		return "Employee from Service Layer";
		return empRepo.getEmployeeRepo();
	}
}
