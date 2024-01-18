package com.onetomanyunidirection;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Test {
	public static void main(String[] args) {
		Custmor c=new Custmor();
		c.setCid(1);
		c.setCname("NEHA");
		
		
		Product p=new Product();
		p.setPid(11);
		p.setPname("MOBILE");
		p.setCustmor(c);
		
		Product p1=new Product();
		p1.setPid(22);
		p1.setPname("HEADPHONES");
		p1.setCustmor(c);
		
		c.getProducts().add(p);
		c.getProducts().add(p1);
		
		Session session=HibernateUtil.getSessionFactory().openSession();
		
		session.save(c);
		session.beginTransaction().commit();
		System.out.println("Data inserted Successfully-----");
	}

}
