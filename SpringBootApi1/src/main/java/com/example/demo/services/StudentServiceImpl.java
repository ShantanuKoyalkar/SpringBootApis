package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;

 @Service
 public class StudentServiceImpl implements StudentService {
	 @Autowired
	 private StudentRepository studentRepository;
	@Override
	public Optional<Student> getById(Integer id) {
		
		return studentRepository.findById(id) ;
	}
	@Override
	public Student savedata(Student student) {
		
		return studentRepository.save(student);
	}
	@Override
	public List<Student> getAll() {
		
		return (List<Student>) studentRepository.findAll();
	}

}
