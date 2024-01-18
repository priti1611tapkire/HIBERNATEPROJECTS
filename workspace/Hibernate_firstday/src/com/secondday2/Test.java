package com.secondday2;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class Test {
	public static void main(String[] args) {
		StandardServiceRegistry registry=new StandardServiceRegistryBuilder().configure().build();
		
		MetadataSources mds=new MetadataSources(registry);
		
		Metadata md=mds.getMetadataBuilder().build();
		
		SessionFactory sessionfactory=md.getSessionFactoryBuilder().build();
		
		Session session=sessionfactory.openSession();
		
		List<Student> list=session.createQuery("From Student").getResultList();
		 for(Student stu:list){
			 System.out.println(stu.getRollno());
			 System.out.println(stu.getName());
			 System.out.println(stu.getAddress());
		 }
	}

}
