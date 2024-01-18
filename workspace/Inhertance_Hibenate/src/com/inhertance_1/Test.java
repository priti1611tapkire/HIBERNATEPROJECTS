package com.inhertance_1;

import org.hibernate.Session;

public class Test {
	public static void main(String[] args) {
		Session session=HibernateUtil.getSessionFactory().openSession();
		Karvenagar k=new Karvenagar();
		k.setId(11);
		k.setSname("punyakshi");
		k.setCname("RSSC");
		k.setRegularbatch("B126");
		
		Akurdi a=new Akurdi();
		a.setId(22);
		a.setSname("ADI");
		a.setCname("CSKC");
		a.setWeekendbatches("B125");
	
		
		session.save(k);
		session.save(a);
		session.beginTransaction().commit();
	}

}
