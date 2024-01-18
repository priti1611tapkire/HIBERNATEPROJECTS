package com;

import org.hibernate.Session;

public class Test {
	public static void main(String[] args) {
		Session session=HibernateUtil.getSessionFactory().openSession();

		Address a=new Address();
		a.setaId(111);
		a.settAddr("Pune");
		a.setpAddr("Abad");

		Employee e=new Employee();
		e.setId(1);
		e.setAddress(a);
		e.setName("Priti");
		e.setMobno(756236986);
		e.setSalary(50000);

		Address a1=new Address();
		a1.setaId(112);
		a1.settAddr("Kolkata");
		a1.setpAddr("Abad");

		Employee e1=new Employee();
		e1.setId(2);
		e1.setAddress(a1);
		e1.setName("Shradha");
		e1.setMobno(856236986);
		e1.setSalary(52000);

		Address a2=new Address();
		a2.setaId(113);
		a2.settAddr("Pawai");
		a2.setpAddr("Pune");

		Employee e2=new Employee();
		e2.setId(3);
		e2.setAddress(a2);
		e2.setName("Somesh");
		e2.setMobno(756236986);
		e2.setSalary(42000);

		session.save(e);
		session.save(e1);
		session.save(e2);

		session.beginTransaction().commit();
		System.out.println("done");

	}
}
