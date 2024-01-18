package com.task1;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.query.Query;

public class Test {
	public static void main(String[] args) {
		Session session=HibernateUtil.getSessionFactory().openSession();

		Student s=new Student();
		s.setRollno(1);
		s.setName("PRITI");
		s.setAddr("ABAD");

		Student s1=new Student();
		s1.setRollno(2);
		s1.setName("YOGITA");
		s1.setAddr("PUNE");


		Student s2=new Student();
		s2.setRollno(3);
		s2.setName("GUPTAJI");
		s2.setAddr("KOLKATA");

		session.save(s);
		session.save(s1);
		session.save(s2);
		session.beginTransaction().commit();
	//}
	//	==============================================================================================================
//	 FOR FETCHING ALL DATA WE USE THIS PROCEDURE
//		CriteriaBuilder builder=session.getCriteriaBuilder();
//
//		CriteriaQuery<Student>query=builder.createQuery(Student.class);
//
//		Root<Student> root=query.from(Student.class);
//
//		query.select(root);
//
//		Query<Student> hq=session.createQuery(query);
//
//		List<Student> list=hq.getResultList();
//		for(Student stu: list){
//			System.out.println(stu.getRollno());
//			System.out.println(stu.getName());
//			System.out.println(stu.getAddr());
//			System.out.println("=====SUCESSFULLY====");
}

	//==========================================================================================================	
//	 SELECT * FROM STUDENT WHERE ROLLNO=?; Query	
//			CriteriaBuilder builder=session.getCriteriaBuilder();
//	
//			CriteriaQuery<Student>query=builder.createQuery(Student.class);
//				
//			Root<Student> root=query.from(Student.class);
//			
//			query.select(root).where(builder.equal(root.get("rollno"),2));
//			
//			Query<Student> hq=session.createQuery(query);
//			
//			Student list=hq.getSingleResult();
//		    System.out.println(list);
//					

	//=======================================================================================================
//	SELECT NAME FROM STUDENT
//			CriteriaBuilder builder=session.getCriteriaBuilder();
//	
//			CriteriaQuery<String>query=builder.createQuery(String.class);
//				
//			Root<Student> root=query.from(Student.class);
//			
//			query.select(root.get("name"));
//			Query<String> hq=session.createQuery(query);
//			
//			List<String> list=hq.getResultList();
//			for(String nm:list){
//				System.out.println(nm);
//			}

	//=======================================================================================================
//	SELECT NAME, DESIGNATION FROM STUDENT
//			
//			CriteriaBuilder builder=session.getCriteriaBuilder();
//			CriteriaQuery<Object[]>query=builder.createQuery(Object[].class);
//			
//			Root<Student> root=query.from(Student.class);
//			
//			query.multiselect(root.get("name"), root.get("addr"));
//			
//			Query<Object[]> hq=session.createQuery(query);
//			List<Object[]> list=hq.getResultList();
//			
//			for(Object obj[]:list){
//				System.out.println(obj[0]);
//				System.out.println(obj[1]);
//			System.out.println("=====ala====");

}


