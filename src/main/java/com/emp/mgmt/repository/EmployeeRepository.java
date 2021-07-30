package com.emp.mgmt.repository;

import org.springframework.data.repository.CrudRepository;

import com.emp.mgmt.model.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer>{
	
}