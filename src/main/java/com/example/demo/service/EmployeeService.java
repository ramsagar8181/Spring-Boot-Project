package com.example.demo.service;

import java.util.List;

import com.example.demo.domain.Employee;

public interface EmployeeService {

	public Long createEmployee(Employee employee);

	public List<Employee> findAllEmployee();
	
	public List<Employee> findByName(String name);

	public List<Employee> findByAge(int age);

}
