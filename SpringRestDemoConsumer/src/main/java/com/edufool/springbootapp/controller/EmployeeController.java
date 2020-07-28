package com.edufool.springbootapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edufool.springbootapp.feign.SpringRestDemoEmpClient;



@RestController
public class EmployeeController {

	
	private SpringRestDemoEmpClient client;
	
	@Autowired
	public EmployeeController(SpringRestDemoEmpClient client) {
		this.client = client;
	}

	@GetMapping("/getEmployees")
	public List<Employee> getEmployeeDetails() {
		return client.findAll();
	}
	
	@GetMapping("/EligibleEmployee")
	public Employee eligibleEmp() {
		return client.findEligibleEmp("Phani");
	}
}
