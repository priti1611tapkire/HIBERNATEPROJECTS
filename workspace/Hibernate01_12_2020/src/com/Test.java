package com;

import org.hibernate.Session;

public class Test {
	public static void main(String[] args) {
		Session session=HibernateUtil.getSessionFactory().openSession();
		
		Student s=new Student();
		s.setRollno(120);
		s.setName("RESHMA");
		s.setAddr("Nagpur");
		
		Student s1= new Student();           
		s1.setRollno(130);
		s1.setName("SUSHMA");
		s1.setAddr("KOLHAPUR");
		
		session.save(s);
		session.save(s1);
		session.beginTransaction().commit();
		System.out.println("------SUCESSFULLY-----");
	}

}
