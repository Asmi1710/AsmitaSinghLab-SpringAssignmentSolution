package com.greatlearning.studentmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.greatlearning.studentmanagement.entity.Student;


//Through the JPA repository, all the commonly used CRUD operations will be supported 
// We don't create any implementation class but Spring Boot takes the responsibility to 
// dynamically create the class for StudentRepository during runtime
public interface StudentRepository extends JpaRepository<Student, Integer> {
	
}
