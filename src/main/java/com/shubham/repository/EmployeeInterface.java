package com.shubham.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shubham.Entity.Employee;

@Repository
public interface EmployeeInterface  extends JpaRepository<Employee, Integer>{
	
	

}
