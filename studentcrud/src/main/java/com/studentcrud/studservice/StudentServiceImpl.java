package com.studentcrud.studservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studentcrud.entity.Student;
import com.studentcrud.repository.StudentRepo;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepo studRep;

	/*
	 * public StudentServiceImpl(SessionFactory sessionFactory) { studRep = new
	 * StudentRepo(sessionFactory); }
	 */

	public List<Student> findAll() {
		// TODO Auto-generated method stub
		return studRep.findAll();
	}

	public Student findById(int iID) {
		// TODO Auto-generated method stub
		return studRep.findById(iID);
	}

	public void save(Student sStud) {
		// TODO Auto-generated method stub
		studRep.save(sStud);
	}

	public void deleteById(int iID) {
		// TODO Auto-generated method stub
		studRep.deleteById(iID);
	}

}
