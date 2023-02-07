package com.apis.project.repository;

import org.springframework.data.repository.CrudRepository;

import com.apis.project.entities.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

}
