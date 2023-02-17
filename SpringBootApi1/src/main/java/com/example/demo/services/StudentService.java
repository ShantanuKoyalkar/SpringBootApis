package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.model.Student;


public interface StudentService {
  public Optional<Student> getById(Integer id);
  
  public Student savedata(Student student);
  
  public List<Student> getAll();
}
