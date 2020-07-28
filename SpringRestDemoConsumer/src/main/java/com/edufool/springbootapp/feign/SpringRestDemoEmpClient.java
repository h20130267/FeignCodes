package com.edufool.springbootapp.feign;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.edufool.springbootapp.controller.Employee;

@FeignClient(value="ED", url="http://localhost:9356")
public interface SpringRestDemoEmpClient {
	 
	    @RequestMapping(value="/getEmployees", method = RequestMethod.GET)
	    public List<Employee> findAll();
	    
	    @GetMapping(value="/getEmployeeByName/{name}")
	    public Employee findEligibleEmp(@PathVariable("name") String name);
	
}
