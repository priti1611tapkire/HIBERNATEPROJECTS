package com;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Test1 {
	public static void main(String[] args) {
		SessionFactory sessionfactrory=Hibernateutil.getSessionFactory();
		Session session=sessionfactrory.openSession();

		List<Employee> list=session.createQuery("From Employee").getResultList();
		
		for(Employee e1:list){
			System.out.println(e1.getId());
			System.out.println(e1.getName());
			System.out.println(e1.getAddress());
			System.out.println(e1.getMob());
		}
		
		session.beginTransaction().commit();
	}

}
