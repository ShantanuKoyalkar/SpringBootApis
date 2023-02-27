package com.apis.project.services;

import java.util.List;



import com.apis.project.entities.Employee;

public interface EmployeeService {
	public Employee addPerson(Employee emp);
	public List<Employee> getAllCustomers();

}
