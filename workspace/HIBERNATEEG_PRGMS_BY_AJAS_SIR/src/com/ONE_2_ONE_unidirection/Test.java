package com.ONE_2_ONE_unidirection;

//ONE TO ONE UNIDIRECTION EX

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Test {
	public static void main(String[] args) 
	{

		SessionFactory sf=HibernateUtil.getSessionFactory();
		Session session=sf.openSession();

		Person p=new Person();
		p.setId(222);
		p.setPname("XYZ");
		Passport ps=new Passport();
		ps.setPid(143);
		ps.setPassporttype("International");
		p.setP(ps);

		session.save(p);

		session.beginTransaction().commit();
		System.out.println("Done");

	}

}
