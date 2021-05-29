package com.shubham.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.shubham.Entity.Employee;
import com.shubham.repository.EmployeeInterface;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeInterface employeeinterface;

	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		
		List<Employee> empList= employeeinterface.findAll();
		
		if(empList.size()>0)
			return empList;
		else {
		
		return new ArrayList<Employee>();
		}
	}
}
