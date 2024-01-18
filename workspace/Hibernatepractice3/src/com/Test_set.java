package com;

import org.hibernate.Session;

public class Test_set {
	public static void main(String[] args) {
		Session session=HibernateUtil.getsessionfactory().openSession();
		
		Team t=new Team();
		t.setTeammembers(9);
		t.setTeammates("reha");
		t.setWork("Mapping");
		
		Team t1=new Team();
		t1.setTeammembers(15);
		t1.setTeammates("Rohit");
		t1.setWork("Layout Planning");
		
		Team t2=new Team();
		t2.setTeammembers(4);
		t2.setTeammates("Priti");
		t2.setWork("Analysis");
		
		Team t3=new Team();
		t3.setTeammembers(6);
		t3.setTeammates("Poonam");
		t3.setWork("Checking");
		
		session.save(t);
		session.save(t1);
		session.save(t2);
		session.save(t3);
		session.beginTransaction().commit();
		
	}

}
