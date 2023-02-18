package com.rest.sp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rest.sp.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{
	
	

}
