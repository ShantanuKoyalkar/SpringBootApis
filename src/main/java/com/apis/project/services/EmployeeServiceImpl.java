package com.apis.project.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apis.project.entities.Employee;
import com.apis.project.repository.EmployeeRepository;
@Service
public class EmployeeServiceImpl implements EmployeeService{
	@Autowired
	private EmployeeRepository emprepo;
	
	
	@Override
	public Employee addPerson(Employee emp) {
		return emprepo.save(emp);
	}

	@Override
	public List<Employee> getAllCustomers() {
		List<Employee> list=(List<Employee>) emprepo.findAll();
		return list;
	}

}
