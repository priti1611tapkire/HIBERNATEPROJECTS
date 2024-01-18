package com.service;

import com.dao.DaoI;
import com.dao.DaoImpl;
import com.model.Student;

public class ServiceImpl implements ServiceI {
	DaoI d=new DaoImpl();

	@Override
	public void addStudentData(Student student) {
		// TODO Auto-generated method stub
		d.addStudentData(student);
		
	}

}
