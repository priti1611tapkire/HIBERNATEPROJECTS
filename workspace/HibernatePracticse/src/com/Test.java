package com;

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
		
		Person pr=new Person();
		pr.setName(sc.next());
		pr.setAddress(sc.next());
		pr.setAge(sc.next());
		pr.setNationality(sc.next());
		pr.setPassport(p);
		
		session.save(pr);
		session.beginTransaction().commit();
		System.out.println("done");
		
		
	}

}
