package com.data_1table2_secondtable;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

public class Test {

	public static void main(String[] args) {
		
		Session session=HibernateUtil.getSessionFactory().openSession();
		
//		Teacher teacher=new Teacher();
//		teacher.setId(17);
//		teacher.setName("Nilesh");
//		teacher.setAddress("Pune");
//		
//		session.save(teacher);
//		session.beginTransaction().commit();
//		System.out.println("Done");
		session.beginTransaction();
		Query<Teacher> query=session.createNamedQuery("insertInNewTable");
		query.executeUpdate();
		
//		
//		Query<Teacher> query=session.createNamedQuery("getAll");
//		List<Teacher> tlist=query.getResultList();
//		System.out.println(tlist);
//
//		Query<Teacher> query1=session.createNamedQuery("singleData");
//		query1.setParameter("id1", 12);
//		Teacher t=query1.getSingleResult();
//		System.out.println(t);
//		
//		session.beginTransaction();
//		Query<Teacher> query2=session.createNamedQuery("deleteData");
//		query2.setParameter("i", 13);
//		query2.executeUpdate();
//		
//		Query<Teacher> query3=session.createNamedQuery("updateData");
//		query3.setParameter("n", "Ajas");
//		query3.setParameter("a", "Nigdi");
//		query3.setParameter("i", 11);
//		query3.executeUpdate();
	}
}

