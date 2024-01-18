package com;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Test {

	public static void main(String[] args) {

		List<Customerorder> l=new ArrayList<Customerorder>();
		Customer c=new Customer();
		c.setCid(1234);
		c.setCname("Ajas");

		Customerorder o=new Customerorder();
		o.setOid(3);
		o.setOname("Headset");

		Customerorder o1=new Customerorder();
		o1.setOid(4);
		o1.setOname("Laptop");

		l.add(o);
		l.add(o1);
		
		c.setOrders(l);
//		c.getOrders().add(o);
//		c.getOrders().add(o1);
		
		SessionFactory sf=HibernateUtil.getSessionFactory();
		Session session=sf.openSession();
		
		session.save(c);
		session.beginTransaction().commit();
		System.out.println("Done");
	}
	
}
