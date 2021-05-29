package com.shubham;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmployeegetApplication {

	
	
	public static void main(String[] args) {
		
		Logger logger = LoggerFactory.getLogger(EmployeegetApplication.class);
		logger.info("Main method..");
		SpringApplication.run(EmployeegetApplication.class, args);
	}

}
