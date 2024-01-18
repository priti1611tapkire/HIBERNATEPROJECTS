package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class Test {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StandardServiceRegistry registry=new StandardServiceRegistryBuilder().configure().build();
		
		MetadataSources mds=new MetadataSources(registry);
		Metadata md=mds.getMetadataBuilder().build();
		SessionFactory sf=md.getSessionFactoryBuilder().build();
		
		Session session=sf.openSession();
		
	/*	Student stu=new Student ();
		stu.setRollno(1);
		stu.setName("Prit");
		stu.setAddress("Aurangabad");*/
		
		Student stu1=new Student ();
		stu1.setRollno(9);
		stu1.setName("NEHA");
		stu1.setAddress("KATRAJ");
		
		session.save(stu1);
		
		session.beginTransaction().commit();

	}

}
