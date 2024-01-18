package com.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.config.HibernateUtil;
import com.model.Student;

public class DaoImpl implements DaoI {

	SessionFactory sf=HibernateUtil.getSessionFactory();
	@Override
	public void addStudentData(Student student) {
		Session session=sf.openSession();
		session.save(student);
		session.beginTransaction().commit();
		System.out.println("done");
		
	}

}
