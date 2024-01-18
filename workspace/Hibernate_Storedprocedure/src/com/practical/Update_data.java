package com.practical;

import java.util.Scanner;

import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureQuery;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class Update_data {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Session session=HibernateUtil.getSessionFactory().openSession();
		//		Client c=new Client();
		//		c.setId(1);
		//		c.setName("GOPALE");
		//		c.setAddress("KHED");
		//		session.save(c);
		//		session.beginTransaction().commit();

		//		
		StoredProcedureQuery squery=session.createStoredProcedureQuery("updateClient");
		squery.registerStoredProcedureParameter("id1", Integer.class, ParameterMode.INOUT);
		squery.registerStoredProcedureParameter("name1", String.class, ParameterMode.OUT);
		squery.registerStoredProcedureParameter("address1", String.class, ParameterMode.OUT);

		squery.setParameter("id1", 1);
		squery.execute();

		int i=(int)squery.getOutputParameterValue("id1");
		System.out.println("Cliennt Id : " + i);
		String name=(String) squery.getOutputParameterValue("name1");
		System.out.println("Client Name : "+ name);
		System.out.println("Client Address : "+squery.getOutputParameterValue("address1"));

		Session session1=HibernateUtil.getSessionFactory().openSession();
		session1.beginTransaction();
		StoredProcedureQuery squery1=session1.createStoredProcedureQuery("updateClient");
		squery1.registerStoredProcedureParameter("id1", Integer.class, ParameterMode.INOUT);
		squery1.registerStoredProcedureParameter("name1", String.class, ParameterMode.INOUT);
		squery1.registerStoredProcedureParameter("address1", String.class, ParameterMode.INOUT);
		Scanner sc=new Scanner(System.in);
		System.out.println(i);
		squery1.setParameter("id1", i);
		System.out.println("Enter Your name");
		String name1=sc.next();
		squery1.setParameter("name1",name1);
		System.out.println("Enter Your address");
		squery1.setParameter("address1", sc.next());
//		squery1.setParameter("id1", i);
//		squery1.setParameter("address1", "abc");
//squery1.setParameter("address1", "PUNE");
	squery1.execute();
	
		session1.getSession().refresh(Client.class);
		//session1.getSession().refresh(Client.class).commit();
		System.out.println("Update");

	}


}
