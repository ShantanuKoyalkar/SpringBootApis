package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.services.StudentService;

import ch.qos.logback.core.status.Status;
@RestController
public class StudentController {
	@Autowired
 private StudentService studentService;
	
	private static final Logger logger = LoggerFactory.getLogger(StudentController.class);
	@GetMapping("/getstuds/{id}")
	public ResponseEntity<Optional<Student>> getStudentById(@PathVariable("id") int id) {
		Optional<Student> student=studentService.getById(id);
		logger.info("Get studentById api excuted");
		return ResponseEntity.ok().body(student);
		
	}
	@SuppressWarnings("unchecked")
	@PostMapping("/savedata")
	public ResponseEntity<Student> saveStudentdata(@RequestBody Student student) {
		studentService.savedata(student);
		return ResponseEntity.ok().body(student);
		
	}
	@GetMapping("/getall")
	public ResponseEntity<List<Student>> getAllStudent(){
		List<Student> list=studentService.getAll();
		return ResponseEntity.ok().body(list);
	}
}
