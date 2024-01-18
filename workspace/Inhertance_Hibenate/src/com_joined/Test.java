package com_joined;

import org.hibernate.Session;

public class Test {
	public static void main(String[] args) {
		Session session=HibernateUtil.getSessionFactory().openSession();
		Karvenagar k=new Karvenagar();
		k.setId(11);
		k.setSname("MAHIRA");
		k.setCname("MPPS");
		k.setRegularbatch("B126");
		
		Akurdi a=new Akurdi();
		a.setId(22);
		a.setSname("ANSH");
		a.setCname("LRDA");
		a.setWeekendbatches("B125");
	
		
		session.save(k);
		session.save(a);
		session.beginTransaction().commit();
	}


}
