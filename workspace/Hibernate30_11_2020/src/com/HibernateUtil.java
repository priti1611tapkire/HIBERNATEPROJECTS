package com;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateUtil {
	public static StandardServiceRegistry registry=null;
	public static SessionFactory sessionfactory=null;

	public static SessionFactory getsessionfactory(){
		if(sessionfactory==null){

			registry=new StandardServiceRegistryBuilder().configure("com/hibernate.cfg.xml").build();

			MetadataSources mds=new MetadataSources(registry);

			Metadata md=mds.getMetadataBuilder().build();

			sessionfactory=md.getSessionFactoryBuilder().build();

		}
		return sessionfactory;	
	}

}
