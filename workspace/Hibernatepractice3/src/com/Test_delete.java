package com;

import org.hibernate.Session;

public class Test_delete {
	public static void main(String[] args) {
		Session session=HibernateUtil.getsessionfactory().openSession();
		
		Team t=new Team();
		t.setTeammembers(3);
		session.delete(t);
		session.beginTransaction().commit();
		
		
	}

}
