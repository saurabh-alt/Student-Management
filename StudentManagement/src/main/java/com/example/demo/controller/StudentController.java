package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;

@RestController
public class StudentController {
	@Autowired
	StudentService studentService;
	
	@PostMapping("/Student")
	public Student addStudent(Student s) {
		return studentService.addStudent(s);
	}
	
	@GetMapping("/Student")
	public List<Student> findAllStudent(){
		return studentService.findAll();
	}
	
	@DeleteMapping("/Student/{id}")
	public void deleteStudent(int id) {
		studentService.deleteStudent(id);
	}
	
	@GetMapping("/Student/{id}")
	public Student findStudentById(@PathVariable int id) {
		return studentService.findStudentById(id);
	
	}
	
	@PutMapping("/Student")
	public Student updateStudent(int id,Student s) {
		return studentService.updateStudent(id, s);
	}
	
	
	
	
	
}
