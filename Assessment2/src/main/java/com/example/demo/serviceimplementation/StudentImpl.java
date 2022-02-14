package com.example.demo.serviceimplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;
import com.example.demo.service.StudentService;
@Service
public class StudentImpl implements StudentService {
	@Autowired(required=true)
	StudentRepository studentrepo;
	@Override
	public void Add(Student student) {
		// TODO Auto-generated method stub
		studentrepo.save(student);
	}

	@Override
	public List<Student> show() {
		// TODO Auto-generated method stub
		return studentrepo.findAll();
	}

	@Override
	public void delete(Student student) {
		// TODO Auto-generated method stub
		studentrepo.delete(student);
	 
	}

	@Override
	public void update(Student student) {
		// TODO Auto-generated method stub
		studentrepo.save(student);
	}

}
