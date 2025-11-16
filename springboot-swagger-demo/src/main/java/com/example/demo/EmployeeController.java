package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Employee;
import com.example.demo.service.EmployeeService;

import io.swagger.v3.oas.annotations.tags.Tag;


// Combination of @Controller and @ResponseBody
@RestController
@RequestMapping("/api")
//@Controller

@Tag(name = "Employee Management System", description = "Read, Create, Update, Delete Employee")
public class EmployeeController {
	
	
	@Autowired
	EmployeeService empService;
	
//	@RequestMapping(path = "/getemployee", method=RequestMethod.GET)
//	@ResponseBody
	
	@GetMapping("/getemployee")
	public String getEmployee()
	{
//		return "Employee";
		return empService.getEmployeeService();
	}
	
	@GetMapping("/getemployeeById")
	public String getEmployeeById(@RequestParam Integer empId)
	{
		return "Employee";
	}
	
	@GetMapping("/getemployeeByPathVariable/{empId}")
	public String getEmployeeByIdPath(@PathVariable(name = "empId") Integer empId)
	{
		return "Employee";
	}
	
//	@RequestMapping(path = "/addemployee", method=RequestMethod.POST)
	@PostMapping("/addemployeeReq")
	public int addEmployeeRe(@RequestBody Employee emp) {
		int num1 = 10;
		int num2 = 20;
		int sum = num1 + num2;
//		return "Add Employee";
		return sum;
	}
	
	
	@PostMapping("/addemployee")
	public String addEmployee(Employee emp) {
		return "Add Employee";
	}
	
	
//	@RequestMapping(path = "/updateemployee", method=RequestMethod.PUT)
	@PutMapping("/updateemployee")
	public String updateEmployee() {
		return "Update Employee";
	}
	
//	@RequestMapping(path = "/deleteemployee", method=RequestMethod.DELETE)
	@DeleteMapping("/deleteemployee")
	public String deleteEmployee() {
		return "Delete Employee";
	}
}
