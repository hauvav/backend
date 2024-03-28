package com.da.excercise1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.da.excercise1.model.Student;
import com.da.excercise1.repository.StudentRepository;

@Service
public class StudentServiceImplement implements StudentService {
	
	@Autowired
	private StudentRepository stuRepo;
	

	@Override
	public List<Student> getStudents() {
		return stuRepo.findAll();
		
	}


	@Override
	public void addStudent(Student student) {
		this.stuRepo.save(student);
	}
	

}
