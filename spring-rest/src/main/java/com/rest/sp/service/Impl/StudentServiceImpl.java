package com.rest.sp.service.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.sp.model.Student;
import com.rest.sp.repository.StudentRepository;
import com.rest.sp.service.IStudentService;

@Service
public class StudentServiceImpl implements IStudentService{
	
	@Autowired
	private StudentRepository studentRepository;//has -A

	@Override
	public Integer saveStudent(Student s) {
		
		return studentRepository.save(s).getStdId();
	}

	@Override
	public List<Student> getAllStudents() {
		
		return studentRepository.findAll();
	}

	@Override
	public Optional<Student> getOneStudent(Integer id) {
		
		return studentRepository.findById(id);
	}

	@Override
	public boolean isExist(Integer id) {
		
		return studentRepository.existsById(id);
	}

	@Override
	public void deleteStudent(Integer id) {
		studentRepository.deleteById(id);
		
	}

}
