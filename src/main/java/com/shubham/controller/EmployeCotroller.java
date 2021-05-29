package com.shubham.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shubham.Entity.Employee;
import com.shubham.service.EmployeeService;

@RestController

public class EmployeCotroller {

	private static final Logger logger = LoggerFactory.getLogger(EmployeCotroller.class);
	
	@Autowired
	private EmployeeService employeeservice;

	@GetMapping("/getallemployees")

	public List<Employee> getAllEmployees() {
          
		logger.debug("Debug message");
		logger.info("This is controller ..: getMethod is called");
		logger.warn("Warning for this application");
		logger.error("Seems some error in the application");
		return employeeservice.getAllEmployees();
	}

}
