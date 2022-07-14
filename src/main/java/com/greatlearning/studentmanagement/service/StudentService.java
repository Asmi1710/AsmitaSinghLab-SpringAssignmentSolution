package com.greatlearning.studentmanagement.service;

import java.util.List;
import com.greatlearning.studentmanagement.entity.Student;


// interface listing the services provided to the students 
public interface StudentService {

	List<Student> findAll();
	
	void save(Student thestudent);
	
	Student findById(int theId);
	
	void deleteById(int theId);
}
