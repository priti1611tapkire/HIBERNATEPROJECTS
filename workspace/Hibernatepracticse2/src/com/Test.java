package com;

import org.hibernate.Session;

//insert data
public class Test {
	public static void main(String[] args) {
		Session session=HibernateUtil.getSessionFactory().openSession();
		
		Airways a=new Airways();
		a.setTicketno(855);
		a.setPasseangername("Rishab Singhania");
		a.setFrom1("Aurangabad");
		a.setTo1("Delhi");
		
		Airways a1=new Airways();
		a1.setTicketno(844);
		a1.setPasseangername("Yogita Surve");
		a1.setFrom1("Pune");
		a1.setTo1("Delhi");
		
		Airways a2=new Airways();
		a2.setTicketno(822);
		a2.setPasseangername("Birendra Gupta");
		a2.setFrom1("Kolkata");
		a2.setTo1("Delhi");
				
		
		Airways a3=new Airways();
		a3.setTicketno(833);
		a3.setPasseangername("Neha Sinha");
		a3.setFrom1("Mumbai");
		a3.setTo1("Delhi");
		session.save(a);
		session.save(a1);
		session.save(a2);
		session.save(a3);
		
		session.beginTransaction().commit();	
		
	}

}
