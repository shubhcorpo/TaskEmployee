package com.shubham;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.atLeastOnce;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;

import com.shubham.Entity.Employee;
import com.shubham.repository.EmployeeInterface;
import com.shubham.service.EmployeeService;

@SpringBootTest
public class TestEmployee {
    
	@InjectMocks
	private EmployeeService employeeservice;

	@Mock
	private EmployeeInterface employeeinterface;

	@Mock
	private Employee employee;

	@Test
	void contextLoads() {
	}

	@Test
	public void testFindAll() {
		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee(111, "Nitesh", 20000));
		list.add(new Employee(112, "Shubham", 20000));
		list.add(new Employee(113, "Shivam", 20000));
		when(employeeinterface.findAll()).thenReturn(list);
		List<Employee> result = employeeservice.getAllEmployees();
		verify(employeeinterface, atLeastOnce()).findAll();
		assertNotNull(result);
		assertFalse(result.isEmpty());
	}
	
}
