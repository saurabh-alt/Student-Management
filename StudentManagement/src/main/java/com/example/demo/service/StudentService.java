package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;

@Service
public interface StudentService {
	public Student addStudent(Student s);
	public List<Student> findAll();
	public Student findStudentById(int id);
	public Student updateStudent(int id, Student s);
	public String deleteStudent(int id);
}
