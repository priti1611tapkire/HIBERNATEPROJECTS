package com.task1;

import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureQuery;

import org.hibernate.Session;

public class Test1 {
	public static void main(String[] args) {
		Session session=HibernateUtil.getSessionFactory().openSession();
		
		StoredProcedureQuery spq=session.createStoredProcedureQuery("phone_count");
		
		spq.registerStoredProcedureParameter("rollno_rn",Integer.class, ParameterMode.IN);

		spq.registerStoredProcedureParameter("phc",Integer.class, ParameterMode.OUT);
		spq.setParameter("rollno_rn", 1);
		spq.setParameter("rollno_rn", 2);
		spq.execute();
		System.out.println(spq.getOutputParameterValue("phc"));

	}
}
