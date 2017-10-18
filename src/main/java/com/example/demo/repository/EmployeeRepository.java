package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.domain.Employee;


public interface EmployeeRepository extends JpaRepository<Employee, Long> {

	public List<Employee> findByName(String name);

	public List<Employee> findByAge(int age);

}
