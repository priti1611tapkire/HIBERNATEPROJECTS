package com.task1;

import java.util.List;


import javax.persistence.EntityTransaction;

import org.hibernate.Session;
import org.hibernate.query.Query;

public class Test {
	public static void main(String[] args) {
		Session session=HibernateUtil.getSessionFactory().openSession();

		Student stu = new Student();
		stu.setRollno(3);
		stu.setName("KIRTI");
		stu.setAddr("JALNA");

		session.save(stu);
		session.beginTransaction().commit();

		Query<Student> query = session.createQuery("from Student");
		List<Student> list=query.getResultList();
		for(Student stu1: list) {
			System.out.println(stu1.getRollno());
			System.out.println(stu1.getName());
			System.out.println(stu1.getAddr());


			//
			//			Query<Student> query=session.createQuery("From Student where rollno=:rno");
			//			query.setParameter("rno", 2);
			//			Student stu=query.getSingleResult();
			//			System.out.println(stu.getRollno());
			//			System.out.println(stu.getName());
			//			System.out.println(stu.getAddr());
			//
			//			EntityTransaction tx=session.beginTransaction();
			//			Query<Student> q=session.createQuery("update Student set name=:nm where rollno=:rno");
			//			q.setParameter("nm", "SHRADHA");
			//			q.setParameter("rno", 4);
			//			q.executeUpdate();
			//			System.out.println("updated successfully--------------");
			//			tx.commit();
			//
			//
			//			EntityTransaction tx=session.beginTransaction();
			//			Query<Student> q=session.createQuery("delete from Student where rollno=:rno");
			//			q.setParameter("rno", 2);
			//			q.executeUpdate();
			//			System.out.println("deleted successfully---------");
			//			tx.commit();

		}

	}
}
