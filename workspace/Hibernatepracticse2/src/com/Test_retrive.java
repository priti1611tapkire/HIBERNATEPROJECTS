package com;

import java.util.List;

import org.hibernate.Session;

public class Test_retrive {
	public static void main(String[] args) {
		Session session=HibernateUtil.getSessionFactory().openSession();

		List<Airways> list=session.createQuery("From Airways").getResultList();
		for(Airways a:list){
			System.out.println(a.getTicketno());
			System.out.println(a.getPasseangername());
			System.out.println(a.getFrom1());
			System.out.println(a.getTo1());
			System.out.println("---------------------------");
		}
		session.beginTransaction().commit();
	}
}
