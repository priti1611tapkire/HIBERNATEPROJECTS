package com;

import org.hibernate.Session;

public class Test_set {
	public static void main(String[] args) {
		Session session=Hibernateutil.getSessionFactory().openSession();
		
		Employee e=new Employee();
		e.setId(50);
		e.setName("kunal jangade");
		e.setAddress("california");
		e.setMob(898586685l);
		session.save(e);
		System.out.println("Successfully inserted------------------------");
		session.beginTransaction().commit();
		
	}

}
