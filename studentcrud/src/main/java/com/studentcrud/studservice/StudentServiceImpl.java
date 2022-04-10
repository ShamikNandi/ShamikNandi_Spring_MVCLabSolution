package com.studentcrud.studservice;

import java.util.List;



import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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

	@Transactional
	public List<Student> findAll() {
		// TODO Auto-generated method stub
		return studRep.findAll();
	}

	@Transactional
	public Student findById(int iID) {
		// TODO Auto-generated method stub
		return studRep.findById(iID);
	}

	@Transactional
	public void save(Student sStud) {
		// TODO Auto-generated method stub
		studRep.save(sStud);
	}

	@Transactional
	public void deleteById(int iID) {
		// TODO Auto-generated method stub
		studRep.deleteById(iID);
	}

}
