package com.ONE_2_MANY_unidirection;

//ONE TO MANY UNIDIRECTIONAL EX 

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;

public class Test {

	public static void main(String[] args) {
		Session session=HibernateUtil.getSessionFactory().openSession();
		
		List<CustomerOrder> l=new ArrayList<CustomerOrder>();
		Customer c=new Customer();
		c.setCid(5868);
		c.setCname("Ajas");

		CustomerOrder o=new CustomerOrder();
		o.setOid(5);
		o.setOname("Headset");

		CustomerOrder o1=new CustomerOrder();
		o1.setOid(6);
		o1.setOname("Laptop");
		
		l.add(o);
		l.add(o1);
		
		c.setOrders(l);
		//c.getOrders().add(o);
		//c.getOrders().add(o1);
		session.save(c);
		session.beginTransaction().commit();
		System.out.println("===done====");
		
	}

}
