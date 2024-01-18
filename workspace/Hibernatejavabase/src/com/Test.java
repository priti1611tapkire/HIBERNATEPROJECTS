package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Test {
public static void main(String[] args) {
		SessionFactory sf=HibenateUtil.getSessionFactory();
		Session session=sf.openSession();
		
		Client c1=new Client();
		c1.setName("PRITY");
		c1.setAddress("ABAD");
		
		session.save(c1);
		session.beginTransaction().commit();
		System.out.println("Data Inserted");
	}
}
