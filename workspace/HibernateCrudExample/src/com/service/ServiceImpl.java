package com.service;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.query.Query;

import com.model.User;
import com.utility.HibernateUtil;

public class ServiceImpl implements ServiceI {
	Scanner sc=new 	Scanner(System.in);

	@Override
	public void addUser() {
		User u=new User();
		System.out.println("Enter Your Name: ");
		String a=sc.next();
		u.setName(a);
		System.out.println("Enter Your Address: ");
		String b=sc.next();
		u.setAddress(b);
		System.out.println("Enter Your USER Name: ");
		String c=sc.next();
		u.setUname(c);
		System.out.println("Enter Your Password: ");
		String d=sc.next();
		u.setPass(d);

		System.out.println("----####----DETAILS INSERTED SUCCESSFULLY IN USERTABLE: "+u);

		Session session=HibernateUtil.getSessionFactory().openSession();
		session.save(u);
		session.beginTransaction().commit();	
	}

	@Override
	public List<User> displayDetails() {
		// TODO Auto-generated method stub
		Session session=HibernateUtil.getSessionFactory().openSession();
		Query<User> query=session.createQuery("From User");
		List<User> list=query.getResultList();
		for(User u:list){
			System.out.println("Display details: "+u);
			System.out.println("------xxxxxxx--------");
			System.out.println("---------####----Details DISPLAYED SUCCESSFULLY----####--------");
		}
		return list;


	}

	@Override
	public void updateDetails() {
		Session session=HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		List<User> ulist=displayDetails();
		System.out.println("Enter your Id for Updating Details: ");
		int id=sc.nextInt();
		for(User u:ulist){
			if(u.getId()==id){
			System.out.println("Enter Your updated  Name: ");
			String m=sc.next();
			u.setName(m);

			System.out.println("Enter Your updated Address: ");
			String n=sc.next();
			u.setAddress(n);

			System.out.println("Enter Your updated Username: ");
			String o=sc.next();
			u.setUname(o);

			System.out.println("Enter Your updated Password:");
			String p=sc.next();
			u.setPass(p);

			session.update(u);
			session.getTransaction().commit();
			}
			System.out.println("-----####----DETAILS UPDATED SUCCESSFULLY----####-----:"+u);
		}
	}

	@Override
	public void deleteDetails() {
		displayDetails();
		Session session=HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		System.out.println("Enter your Id for Deleting Details: ");
		int id=sc.nextInt();
		User user=session.get(User.class, id);
		session.delete(user);
		session.getTransaction().commit();
		System.out.println("------####---DETAILS DELETED SUCCESSFULLY----####-----:"+user);
	}
	
	@Override
	public void updateNewWay() {
		displayDetails();
		Session session=HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		System.out.println("Enter Your id to be updating");
		int id=sc.nextInt();
		User user=session.get(User.class, id);
		
		System.out.println("Show USer Details  : " +user);
		 System.out.println("Enter Your updated  Name:");
		 String x=sc.next();
		 user.setName(x);

		 System.out.println("Enter Your updated Address:");
		 String y=sc.next();
		 user.setAddress(y);

		 System.out.println("Enter your updated uname");
		 String z=sc.next();
		 user.setUname(z);

		 System.out.println("Enter your updated Pass");
		 String v=sc.next();
		 user.setPass(v);
		
		 session.update(user);
		 session.getTransaction().commit();
	}
	
}
