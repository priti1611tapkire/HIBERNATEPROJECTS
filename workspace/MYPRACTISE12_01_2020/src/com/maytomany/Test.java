package com.maytomany;

import java.util.*;

import org.hibernate.Session;
import org.hibernate.mapping.Array;

public class Test {
	public static void main(String[] args) {
		Session session=HibernateUtil.getSessionFactory().openSession();
		
		List<Course> clist=new ArrayList<>();
		List<Student> slist=new ArrayList<>();
		Course c=new Course();
		c.setCid(1);
		c.setCname("JAVA");
		
		
		Course c1=new Course();
		c1.setCid(2);
		c1.setCname("PYTHON");
		
		
		
		
		Student s=new Student();
		s.setRollno(11);
		s.setName("YOGITA");
		s.setAddress("PUNE");
		
		Student s1=new Student();
		s1.setRollno(22);
		s1.setName("birendra");
		s1.setAddress("Kolkata");
		
		
		slist.add(s);
		slist.add(s1);
		c.setStudent(slist);
		c1.setStudent(slist);
		clist.add(c);
		clist.add(c1);
		s.setCourse(clist);
		s1.setCourse(clist);
		
		session.save(s);
		session.save(s1);
		session.save(c);
		session.save(c1);
		session.beginTransaction().commit();
		
	}

}
