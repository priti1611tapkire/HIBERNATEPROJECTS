package com.pr1;

import java.util.Scanner;

import org.hibernate.Session;

public class Test {
	public static void main(String[] args) {
		Session session=HibernateUtil.getSessionFactory().openSession();
		
		Scanner sc=new Scanner(System.in);
		Passport p=new Passport();
		p.setPno(sc.nextInt());
		p.setTfrom(sc.next());
		p.setTto(sc.next());
		
		Person p1=new Person();
		p1.setName(sc.next());
		p1.setAddress(sc.next());
		p1.setAge(sc.next());
		p1.setNationality(sc.next());
		p1.setPassport(p);
		p.setPerson(p1);
		
		session.save(p1);
		session.beginTransaction().commit();
		System.out.println("done");
		
	}
}
