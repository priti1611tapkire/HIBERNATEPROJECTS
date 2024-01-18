package com.service;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.model.Pancard;
import com.model.Person;
import com.utility.HibernateUtil;

public class ServiceImpl implements ServiceI {

	SessionFactory sf=HibernateUtil.getSessionFactory();
	Scanner sc=new Scanner(System.in);
	
	@Override
	public void addDetails() {
	
		Person p=new Person();
		System.out.println("Enter Your name");
		String a=sc.next();
		p.setPname(a);
		
		System.out.println("Enter your Address");
		String b=sc.next();
		p.setPaddress(b);
		
		Pancard pc=new Pancard();
		System.out.println("Enter your pancard name");
		String c=sc.next();
		pc.setPanName(c);
		
		p.setPancard(pc);
		pc.setPerson(p);
		
		Session session=sf.openSession();
		session.save(p);
		
		session.beginTransaction().commit();
		System.out.println("----PERSON DETAILS INSERTED SUCCESSFULLY---");
		
	}

	@Override
	public void displayAllDetails() {
       // Using Person table
		Session session=sf.openSession();
		List<Person> plist=session.createQuery("from Person").getResultList();
		for(Person p:plist) {
			System.out.println(p);
		}
           
		// Using Pancard table HERE
				Session session1=sf.openSession();
				List<Pancard> panlist=session1.createQuery("from Pancard").getResultList();
				for(Pancard pan:panlist) {
					System.out.println("===========================List Of Data==========================");
					System.out.println("Person Id : " + pan.getPerson().getPid());
					System.out.println("Person Name : " + pan.getPerson().getPname());
					System.out.println("Person Address : " +pan.getPerson().getPaddress());
					System.out.println("PanCard PanId : " +pan.getPanid());
					System.out.println("Pancard PanName : " +pan.getPanName());
					System.out.println("----------------------------------------------------------------");
				}
		           
	}

	@Override
	public void updatPersonAllDetails() {
		Session session=sf.openSession();
		session.beginTransaction();
		displayAllDetails();
		System.out.println("Enter Your id To be Updating");
		int id=sc.nextInt();
		
		Person p=session.get(Person.class, id);
		
		System.out.println("Enter your updated name");
		String m=sc.next();
		p.setPname(m);
		
		System.out.println("Enter Your updating address ");
		String n=sc.next();
		p.setPaddress(n);
		
		
		System.out.println("Enter your pan name to be upadting");
		p.getPancard().setPanName(sc.next());
		
		
		session.update(p);
		session.getTransaction().commit();
		System.out.println("updating Done");
		
	
		
	}

	@Override
	public void deleteDetails() {
		
		Session session=sf.openSession();
	    Transaction tx=session.beginTransaction();
	    displayAllDetails();
		System.out.println("Enter Your id To be Updating");
		int id=sc.nextInt();
		Person p=session.get(Person.class, id);
		session.delete(p);
		tx.commit();
	}

}

