package com.task;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

public class Test {
	public static void main(String[] args) {
		Session session=HibernateUtil.getSessionFactory().openSession();
//		Student s=new Student();
//		s.setRollno(100);
//		s.setName("PRITI");
//		s.setAddr("ABAD");
//		
//		Student s1=new Student();
//		s1.setRollno(101);
//		s1.setName("KRITI");
//		s1.setAddr("UBAD");
//		
//		Student s2=new Student();
//		s2.setRollno(102);
//		s2.setName("RITI");
//		s2.setAddr("JALNA");
//		
//		session.save(s);
//		session.save(s1);
//		session.save(s2);
//		
//		session.beginTransaction().commit();
		
//	//	Query<Student> q=session.createNamedQuery("s_All");
//		Query<Student> q=session.createNamedQuery("s_All", Student.class);
//		List<Student> list=q.getResultList();
//		
//		list.forEach(n -> System.out.println(n));
	}

}
