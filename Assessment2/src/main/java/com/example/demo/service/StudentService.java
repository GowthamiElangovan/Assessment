package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Student;

public interface StudentService {
	public void Add(Student student);
	public List<Student> show();
	public void update(Student student);
	public void delete(Student student);
}
