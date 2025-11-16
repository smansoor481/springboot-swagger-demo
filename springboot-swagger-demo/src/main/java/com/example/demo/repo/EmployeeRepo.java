package com.example.demo.repo;

import org.springframework.stereotype.Repository;

@Repository
public class EmployeeRepo {
	public String getEmployeeRepo() {
		// db operations to fetch employee data
		return "Employee from Repo Layer";
	}
}
