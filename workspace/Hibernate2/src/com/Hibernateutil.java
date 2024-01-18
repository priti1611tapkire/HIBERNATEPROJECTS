package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class Hibernateutil {
	private static StandardServiceRegistry registry=null;

	private static SessionFactory sessionfactory=null;
	public static SessionFactory getSessionFactory()
	{
		if(sessionfactory==null);
		{
			registry=new StandardServiceRegistryBuilder().configure().build();

			MetadataSources mds=new MetadataSources(registry);

			Metadata md=mds.getMetadataBuilder().build();

			sessionfactory=md.getSessionFactoryBuilder().build();


		}
		return sessionfactory;
	}


}
