package com;

import org.hibernate.Session;

public class Test {
	public static void main(String[] args) {
		Session session=HibernateUtil.getsessionfactory().openSession();
		/*Product p=new Product();
		p.setName("Washing Machine");
		p.setAddress("Flipkart");*/
		
		Product p1=new Product();
		p1.setName("REFRIGIRATOR");
		p1.setAddress("CHROMA");
		
	//	session.save(p);
		session.save(p1);
		session.beginTransaction().commit();
		System.out.println("successfully inserted----------");
	}
}
