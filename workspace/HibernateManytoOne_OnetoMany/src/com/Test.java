package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Test {
	public static void main(String[] args) {
		Session session=HibernateUtil.getSessionFactory().openSession();
		
		Department dept=new Department();
		dept.setDid(101);
		dept.setName("DRAFTING");
		
		Employee e1=new Employee();
		e1.setEmpid(1);
		e1.setName("Nilesh Kadam");
		e1.setDesignation("Drafteman");
		e1.setDept(dept);
		
		Employee e2=new Employee();
		e2.setEmpid(2);
		e2.setName("Omkar Narve");
		e2.setDesignation("Cheker");
		e2.setDept(dept);
		
		dept.getSemp().add(e1);
		dept.getSemp().add(e2);
		session.save(dept);
		session.beginTransaction().commit();
		
		System.out.println("DATA INSERTED SUCCESSFULLY");	
	}
}
