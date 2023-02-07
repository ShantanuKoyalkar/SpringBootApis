package com.apis.project.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.apis.project.entities.Employee;
import com.apis.project.services.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService empService;
	@PostMapping("/saveemp")
	public ResponseEntity<Employee> addPerson(@RequestBody Employee employee) {
		Employee emp=empService.addPerson(employee);
		return ResponseEntity.ok().body(emp);	
	}
	@GetMapping("/getAll")
	public ResponseEntity<List<Employee>> getAllCustomers(){
		List<Employee> list=empService.getAllCustomers();
		return ResponseEntity.of(Optional.of(list));
	
	}

}
