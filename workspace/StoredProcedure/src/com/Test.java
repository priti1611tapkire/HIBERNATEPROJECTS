package com;

import java.util.List;

import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureQuery;

import org.hibernate.Session;

public class Test {
	public static void main(String[] args) {

		Session session=HibernateUtil.getSessionFactory().openSession();

		//		StoredProcedureQuery spq=session.createStoredProcedureQuery("insertdata");
		//		
		//		spq.registerStoredProcedureParameter("eid1", Integer.class, ParameterMode.IN);
		//		spq.registerStoredProcedureParameter("eaddr1", String.class, ParameterMode.IN);
		//		spq.registerStoredProcedureParameter("ename1", String.class, ParameterMode.IN);
		//		
		//		spq.setParameter("eid1", 202);
		//		spq.setParameter("eaddr1", "ABAD");
		//		spq.setParameter("ename1", "PRITI");
		//		
		//		spq.execute();
		//		session.beginTransaction().commit();
		//		System.out.println("done");


		//	=================================================================================


		//		StoredProcedureQuery spq1=session.createStoredProcedureQuery("fetchsingledata");
		//		
		//		spq1.registerStoredProcedureParameter("eid1", Integer.class, ParameterMode.INOUT);
		//		spq1.registerStoredProcedureParameter("eaddr1", String.class, ParameterMode.OUT);
		//		spq1.registerStoredProcedureParameter("ename1", String.class, ParameterMode.OUT);
		//		
		//		spq1.setParameter("eid1", 101);
		//		
		//		
		//		System.out.println(spq1.getOutputParameterValue("eid1"));
		//		System.out.println(spq1.getOutputParameterValue("eaddr1"));
		//		System.out.println(spq1.getOutputParameterValue("ename1"));
		//		spq1.execute();
		//		session.beginTransaction().commit();

		//=================================================================================

		//		StoredProcedureQuery spq1=session.createStoredProcedureQuery("fetchalldata");
		//		spq1.execute();
		//		
		//		List<Object[]> list=spq1.getResultList();
		//		for(Object[] obj:list){
		//			System.out.println(obj[0]);
		//			System.out.println(obj[1]);
		//			System.out.println(obj[2]);
		//		}
		//====================================================================================
		//
		//		StoredProcedureQuery spq1=session.createStoredProcedureQuery("updatedata");
		//		spq1.registerStoredProcedureParameter("eid1", Integer.class, ParameterMode.IN);
		//		spq1.registerStoredProcedureParameter("eaddr1", String.class, ParameterMode.IN);
		//		spq1.registerStoredProcedureParameter("ename1", String.class, ParameterMode.IN);
		//
		//		spq1.setParameter("eid1", 202);
		//		spq1.setParameter("eaddr1", "AKOLA");
		//		spq1.setParameter("ename1", "MEENA");
		//		spq1.execute();
		//		session.beginTransaction().commit();
		//		System.out.println("done");
		//		System.out.println("===================UPDATED DATA================");
		//		StoredProcedureQuery spq2=session.createStoredProcedureQuery("fetchsingledata");
		//
		//		spq2.registerStoredProcedureParameter("eid1", Integer.class, ParameterMode.INOUT);
		//		spq2.registerStoredProcedureParameter("eaddr1", String.class, ParameterMode.OUT);
		//		spq2.registerStoredProcedureParameter("ename1", String.class, ParameterMode.OUT);
		//
		//		spq2.setParameter("eid1", 202);
		//
		//		System.out.println(spq2.getOutputParameterValue("eid1"));
		//		System.out.println(spq2.getOutputParameterValue("eaddr1"));
		//		System.out.println(spq2.getOutputParameterValue("ename1"));
		//		spq2.execute();
		//		session.beginTransaction().commit();

		StoredProcedureQuery spq1=session.createStoredProcedureQuery("deletdata");
		spq1.registerStoredProcedureParameter("eid1",Integer.class, ParameterMode.IN);
		spq1.setParameter("eid1", 101);
		spq1.execute();
		System.out.println("DELETED");
		session.beginTransaction().commit();
		StoredProcedureQuery spq2=session.createStoredProcedureQuery("fetchalldata");
		spq2.execute();

		List<Object[]> list=spq2.getResultList();
		for(Object[] obj:list){
			System.out.println(obj[0]);
			System.out.println(obj[1]);
			System.out.println(obj[2]);
		}



	}
}
