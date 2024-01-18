package com.task_by_ajassir;


import org.hibernate.Session;
import org.hibernate.query.Query;

public class Test {

	
	public static void main(String[] args) {
	Session session=HibernateUtil.getSessionFactory().openSession();
	session.beginTransaction();
	//Query<User> query=session.createNamedQuery("insertData",User.class);
	//Query<User> query=session.createNativeQuery("insert into user(id,name,address) values(?,?,?)");
	Query<User> query=session.getNamedNativeQuery("insertData");
	query.setParameter(1, 8);
	query.setParameter(2, "NIHAL");
	query.setParameter(3, "NOIDA");
	query.executeUpdate();
	System.out.println("Done");
	
	}
}
