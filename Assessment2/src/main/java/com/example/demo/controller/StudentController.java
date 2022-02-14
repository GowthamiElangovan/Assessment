package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;
import com.example.demo.serviceimplementation.StudentImpl;

@RestController
public class StudentController {
	@Autowired
	StudentImpl studentimpl;
	@PostMapping("/Add")
	public void add(@RequestBody Student student) {
	studentimpl.Add(student);
	}
	@GetMapping("/Display")
	public List<Student> display() {
		return studentimpl.show();
	}
	@PutMapping("/Update")
	public void update(@RequestBody Student student) {
		studentimpl.Add(student);
	}
	@DeleteMapping("/Delete")
	public void delete(@RequestBody Student student) {
		studentimpl.delete(student);
	}
}