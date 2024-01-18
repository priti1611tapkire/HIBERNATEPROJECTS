package com_alldatabasequreis;

import java.util.List;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureQuery;
import org.hibernate.Session;

public class Test {

	public static void main(String[] args) {
		
		// Data Insertion using Stored Procedure
		Session session=HibernateUtil.getSessionFactory().openSession();
		StoredProcedureQuery spq=session.createStoredProcedureQuery("insertdatademo");

		spq.registerStoredProcedureParameter("rollno1",Integer.class, ParameterMode.IN);
		spq.registerStoredProcedureParameter("name1",String.class, ParameterMode.IN);
		spq.registerStoredProcedureParameter("addr",String.class, ParameterMode.IN);

		spq.setParameter("rollno1", 506);
		spq.setParameter("name1", "TEENA");
		spq.setParameter("addr", "DELHI");

		spq.execute();
		System.out.println("Yaay1");
		session.beginTransaction().commit();

//=================================================================================================================
		// Fetch Single Data using Stored Procedure
		Session session1=HibernateUtil.getSessionFactory().openSession();
		StoredProcedureQuery spq1=session1.createStoredProcedureQuery("fetchsingledata");
		spq1.registerStoredProcedureParameter("rollno1", Integer.class, ParameterMode.INOUT);
		spq1.registerStoredProcedureParameter("name1", String.class, ParameterMode.OUT);
		spq1.registerStoredProcedureParameter("address1", String.class, ParameterMode.OUT);

		spq1.setParameter("rollno1", 505);

		System.out.println(spq1.getOutputParameterValue("rollno1"));
		System.out.println(spq1.getOutputParameterValue("name1"));
		System.out.println(spq1.getOutputParameterValue("address1"));

		spq1.execute();
		session1.beginTransaction().commit();

//===============================================================================================================
		// Fetch All Data using Stored Procedure
		Session session2=HibernateUtil.getSessionFactory().openSession();
		StoredProcedureQuery spq2=session2.createStoredProcedureQuery("fetchingalldata");	
		spq2.execute();
		List<Object[]> list = spq2.getResultList();
		for(Object[] o:list)
		{
			int rollno=(int)o[0];
			System.out.println(rollno);
			String name=(String)o[1];
			System.out.println(name);
			String address=(String)o[2];
			System.out.println(address);
			System.out.println("=====================");
		    session2.beginTransaction().commit();
		}

//===============================================================================================================		
		// Update Data using Stored Procedure
		Session session3 = HibernateUtil.getSessionFactory().openSession();
		StoredProcedureQuery spq3 = session3.createStoredProcedureQuery("updatedata");

		spq3.registerStoredProcedureParameter("rollno1", Integer.class, ParameterMode.INOUT);
		spq3.registerStoredProcedureParameter("name1", String.class, ParameterMode.INOUT);
		spq3.registerStoredProcedureParameter("address1", String.class, ParameterMode.INOUT);

		spq3.setParameter("rollno1", 506);
		spq3.setParameter("name1", "SIYA");
		spq3.setParameter("address1", "AURANGABAD");

		spq3.execute();
		spq3.setParameter("rollno1", 506);

		System.out.println(spq3.getOutputParameterValue("rollno1"));
		System.out.println(spq3.getOutputParameterValue("name1"));
		System.out.println(spq3.getOutputParameterValue("address1"));
	    session3.beginTransaction().commit();

		//===============================================================================================================		
		// Delete Data using Stored Procedure
		Session session4 = HibernateUtil.getSessionFactory().openSession();
		StoredProcedureQuery spq4 = session4.createStoredProcedureQuery("deletedata");

		spq4.registerStoredProcedureParameter("rollno1", Integer.class, ParameterMode.IN);
		spq4.setParameter("rollno1", 506);
		spq4.execute();

		session4.beginTransaction().commit();
		System.out.println("Yaay");    

	}
}





