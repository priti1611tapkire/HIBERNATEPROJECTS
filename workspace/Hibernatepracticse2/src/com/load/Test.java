package com.load;

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

		//Airways a=session.load(Airways.class, 844);//first data and then query fired
		Airways a=session.get(Airways.class, 844);//first query fired n then data displayed
		System.out.println(a.getTicketno());
		System.out.println(a.getPasseangername());
		System.out.println(a.getFrom1());
		System.out.println(a.getTo1());
		System.out.println("Successfuly fatched---------");
	}

}
