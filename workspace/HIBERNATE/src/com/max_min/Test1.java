package com.max_min;

import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureQuery;

import org.hibernate.Session;

public class Test1 {
	public static void main(String[] args) {
		Session session=HibernateUtil.getSessionFactory().openSession();
		
		StoredProcedureQuery spq=session.createStoredProcedureQuery("com_max");
		
		spq.registerStoredProcedureParameter("minimunpercentage",Integer.class, ParameterMode.OUT);
		//spq.getMaxResults();
		
		spq.execute();
		System.out.println(spq.getOutputParameterValue("minimunpercentage"));

	}
}
