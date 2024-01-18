package com;

import org.hibernate.Session;

public class Test_update {
	public static void main(String[] args) {
		Session session=HibernateUtil.getsessionfactory().openSession();

		Team t=new Team();
		t.setTeammembers(3);
		//update Team t set e=s.marks=50 where s.studentId=?;
	}

}
