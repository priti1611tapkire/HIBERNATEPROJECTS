package com.config;

import java.util.*;


import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Environment;

import com.model.Student;

public class HibernateUtil {
	
	private static StandardServiceRegistry registry=null;
	
	private static SessionFactory sf=null;
	
	public static SessionFactory getSessionFactory(){
		
		if(sf==null){
			Map<String, Object> m=new HashMap<String, Object>();
			m.put(Environment.DRIVER, "com.mysql.jdbc.Driver");
			m.put(Environment.URL, "jdbc:mysql://localhost:3306/servlethibernateimage");
			m.put(Environment.USER, "root");
			m.put(Environment.PASS, "root");
			
			m.put(Environment.DIALECT, "org.hibernate.dialect.MySQL5Dialect");
			m.put(Environment.SHOW_SQL, "true");
			m.put(Environment.HBM2DDL_AUTO, "update");
			
			registry=new StandardServiceRegistryBuilder().applySettings(m).build();
			MetadataSources mds=new MetadataSources(registry).addAnnotatedClass(Student.class);
			Metadata md=mds.getMetadataBuilder().build();
			sf=md.getSessionFactoryBuilder().build();
		}
		return sf;
		
	}
	

}
