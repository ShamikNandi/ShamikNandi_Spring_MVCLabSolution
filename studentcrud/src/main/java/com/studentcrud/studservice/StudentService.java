package com.studentcrud.studservice;

import java.util.List;

import org.springframework.stereotype.Service;

import com.studentcrud.entity.Student;

@Service
public interface StudentService {

	public List<Student> findAll();

	public Student findById(int iID);

	public void save(Student sStud);

	public void deleteById(int iID);

}
