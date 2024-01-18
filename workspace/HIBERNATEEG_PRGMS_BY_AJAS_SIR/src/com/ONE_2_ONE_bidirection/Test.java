package com.ONE_2_ONE_bidirection;

//ONE TO ONE BIDIRECTION EX

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Test {
	public static void main(String[] args) {
		
	
	SessionFactory sf=HibernateUtil.getSessionFactory();
	
	Session session=sf.openSession();
	
	User u=new User();
	u.setId(12365);
	u.setUname("ZXCVB");
	
	Adharcard ad=new Adharcard();
	ad.setAid(33);
	ad.setAdharnumber("585692");
	
	u.setA(ad);
	ad.setU(u);
	
	//session.save(u);
	session.save(ad);
	session.beginTransaction().commit();
	System.out.println("Done");
	}
}
