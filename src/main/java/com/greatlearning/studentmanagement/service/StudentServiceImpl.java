package com.greatlearning.studentmanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.greatlearning.studentmanagement.entity.Student;
import com.greatlearning.studentmanagement.repository.StudentRepository;

// implementation of services mentioned in the interface
@Repository
public class StudentServiceImpl 
	implements StudentService{

	// for Spring to create dynamic implementation of StudentRepository
	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public List<Student> findAll() {
		
		return studentRepository.findAll();
	}
	
	public void save(Student theStudent) {

		studentRepository.save(theStudent);
	}

	public Student findById(int id) {

		return studentRepository.findById(id).get();
	}

	@Override
	public void deleteById(int theId) {
		
		studentRepository.deleteById(theId);
		
	}



}

