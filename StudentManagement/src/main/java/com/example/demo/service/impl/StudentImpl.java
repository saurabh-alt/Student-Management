package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;
import com.example.demo.service.StudentService;

@Service
public class StudentImpl implements StudentService {
	@Autowired
	StudentRepository studentRepository;
	
	@Override
	public Student addStudent(Student s) {
		// TODO Auto-generated method stub
		return studentRepository.save(s);
	}

	@Override
	public List<Student> findAll() {
		// TODO Auto-generated method stub
		return studentRepository.findAll();
	}


	@Override
	public Student updateStudent(int id, Student s) {
		// TODO Auto-generated method stub
		Student S=studentRepository.findById(id).get();
		S.setStudentname(s.getStudentname());
		S.setContactnumber(s.getContactnumber());
		return null;
	}

	@Override
	public String deleteStudent(int id) {
		// TODO Auto-generated method stub
		return "Student Details Deleted Succesfully" ;
	}

	@Override
	public Student findStudentById(int id) {
		// TODO Auto-generated method stub
		return studentRepository.findById(id).get();
	}

	
}
