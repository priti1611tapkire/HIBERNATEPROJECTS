package com.DEFAULT_INHERITANCE;

//DEFAULT INHERITANCE EX

import org.hibernate.Session;

public class Test {
	public static void main(String[] args) {
		
		Session session=HibernateUtil.getSessionFactory().openSession();
		
		RBI rbi=new RBI();
		//rbi.setRid(25);
		//rbi.setRule("ALL");
		
		SBI sbi=new SBI();
		//sbi.setRid(1);
		sbi.setRule("HOMELOAN");
		sbi.setSbiaddress("CIDCO TOWNHALL");
		
		HDFC hdfc=new HDFC();
		hdfc.setRule("CAR LOAN");
		hdfc.setHdfcaddress("AKASHWANI");
		
		//session.save(rbi);
		session.save(sbi);
		session.save(hdfc);
		
		session.beginTransaction().commit();
		System.out.println("===SUCCESSFULLY===");
		
		
		
	}

}
