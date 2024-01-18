package com;

import java.util.Scanner;

import org.hibernate.Session;

public class Test {
	public static void main(String[] args) {
		Session session=HibernateUtil.getSessionFactory().openSession();
		Scanner sc=new Scanner(System.in);
		for(int i=0; i<=5; i++){
			Customers c=new Customers();
			c.setCid(sc.nextInt());
			c.setCustomername(sc.next());
			c.setContactname(sc.next());
			c.setAddress(sc.next());
			c.setPostalcode(sc.nextInt());
			c.setCity(sc.next());
			c.setCountry(sc.next());
			System.out.println("okay");
			session.save(c);
			session.beginTransaction().commit();
		}

	}
}
