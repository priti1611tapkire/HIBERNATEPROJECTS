package com.hqlqueries;

import java.util.List;



import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class Test {

	public static void main(String[] args) {
		
		Session session=HibernateUtil.getSessionFactory().openSession();
//		
//		Student s=new Student();
//		s.setRollno(33);
//		s.setName("PRITI");
//		s.setAddr("ABAD");
//		
//		session.save(s);
//		session.beginTransaction().commit();
		
//		Query<Student> query=session.createQuery("from Student");
//		List<Student> list=query.getResultList();
//		for(Student stu:list){
//			System.out.println(stu.getRollno());
//			System.out.println(stu.getName());
//			System.out.println(stu.getAddr());
//		}
//		
//		Query<Student> query=session.createQuery("from Student where rollno=:r_no");
//		query.setParameter("r_no", 11);
//		Student stu=query.getSingleResult();
////		List<Student> list=query.getResultList();
////		for(Student stu:list){
//			System.out.println(stu.getRollno());
//			System.out.println(stu.getName());
//			System.out.println(stu.getAddr());
//		//}
//		
			
//		Query<Student> q=session.createQuery("delete from Student where rollno=:r_no");
//		q.setParameter("r_no", 33);
//		
//		Transaction tx=session.beginTransaction();
//		q.executeUpdate();
//		tx.commit();
//	
		Transaction tx=session.beginTransaction();
		Query<Student> query=session.createQuery("update Student set name=:nm where rollno=:r_no");
		query.setParameter("nm", "SHRADHA");
		query.setParameter("r_no", 33);
		query.executeUpdate();
		tx.commit();
	}
}
