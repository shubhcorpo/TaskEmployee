package com.shubham.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int employeeid;
	private String employeename;
	private int employeesalary;

	public Employee(){
		super();
	}
	
	
	public Employee(int empID, String empName, int empSalary) {
		// TODO Auto-generated constructor stub
		super();
		this.employeeid=empID;
		this.employeename=empName;
		this.employeesalary=empSalary;
	}
	
	

	public int getEmployeeid() {
		return employeeid;
	}

	public void setEmployeeid(int employeeid) {
		this.employeeid = employeeid;
	}

	public String getEmployeename() {
		return employeename;
	}

	public void setEmployeename(String employeename) {
		this.employeename = employeename;
	}

	public int getEmployeesalary() {
		return employeesalary;
	}

	public void setEmployeesalary(int employeesalary) {
		this.employeesalary = employeesalary;
	}

}
