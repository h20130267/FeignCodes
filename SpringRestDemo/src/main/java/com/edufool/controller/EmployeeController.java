package com.edufool.controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edufool.model.Employee;

@RestController
public class EmployeeController {

	@RequestMapping("/getEmployees")
	public List<Employee> getEmployeeDetails() throws CloneNotSupportedException {
		 return(getEmployees());
		 
	}
	
	@GetMapping("/getEmployeeByName/{name}")
	public Employee getEmployeeByName(@PathVariable("name") String name) throws CloneNotSupportedException {
		for(Employee e: getEmployees()) {
			if(e.geteName().equals(name)) {
				return e;
			}
		}
		return null;		
	}

	private List<Employee> getEmployees() throws CloneNotSupportedException {
		Employee e1 = new Employee(1, "Manoj", "Kooli");
		Employee e2 = (Employee) e1.clone();
		Employee e3 = (Employee) e1.clone();
		e3.seteName("Phani");
		e2.seteName("Papa");

		List<Employee> listOfEmp = new ArrayList<Employee>();
		listOfEmp.add(e1);
		listOfEmp.add(e2);
		listOfEmp.add(e3);
		return listOfEmp;
	}
}
