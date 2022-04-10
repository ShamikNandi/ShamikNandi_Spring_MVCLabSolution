package com.studentcrud.repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.studentcrud.entity.Student;

@Repository
public class StudentRepo {

	private Session session;
	@Autowired
	private SessionFactory sessionFactory;

	/*
	 * public StudentRepo(SessionFactory sessionFactory) { this.sessionFactory =
	 * sessionFactory;
	 * 
	 * try { this.session = sessionFactory.getCurrentSession(); } catch
	 * (HibernateException e) {
	 * 
	 * this.session = sessionFactory.openSession(); } }
	 */
	public List<Student> findAll() {
		this.session = sessionFactory.openSession();
		List<Student> studentList = session.createQuery("from Student", Student.class).list();
		return studentList;
	}

	public Student findById(int id) {
		this.session = this.sessionFactory.openSession();
		Student student = session.get(Student.class, id);
		return student;
	}

	public void save(Student theStudent) {
		this.session = this.sessionFactory.openSession();
		session.saveOrUpdate(theStudent);
	}

	public void deleteById(int theId) {
		this.session = this.sessionFactory.openSession();
		Student student = session.get(Student.class, theId);
		System.out.println(student);
		session.delete(student);

	}

}
