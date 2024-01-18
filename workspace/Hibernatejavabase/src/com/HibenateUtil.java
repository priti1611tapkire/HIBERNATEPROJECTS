package com;

import java.util.HashMap;
import java.util.Map;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Environment;

public class HibenateUtil {
	private static StandardServiceRegistry registry=null;

	private static SessionFactory sf=null;

	public static SessionFactory getSessionFactory()
	{

		if(sf==null) {

			Map<String, Object> m=new HashMap<String, Object>();
			m.put(Environment.DRIVER, "com.mysql.jdbc.Driver");
			m.put(Environment.URL, "jdbc:mysql://localhost:3306/hibernatejavabase1");
			m.put(Environment.USER, "root");
			m.put(Environment.PASS, "root");

			m.put(Environment.DIALECT, "org.hibernate.dialect.MySQLDialect");
			m.put(Environment.HBM2DDL_AUTO, "update");
			m.put(Environment.SHOW_SQL, "true");

			registry=new StandardServiceRegistryBuilder().applySettings(m).build();

			MetadataSources mds=new MetadataSources(registry).addAnnotatedClass(Client.class);

			Metadata md=mds.getMetadataBuilder().build();

			sf=md.getSessionFactoryBuilder().build();

		}
		return sf;
	}

}
