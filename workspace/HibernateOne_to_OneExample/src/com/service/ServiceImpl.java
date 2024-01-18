package com.service;

import java.util.List;
import java.util.Scanner;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import com.model.College;
import com.model.Student;

import com.utility.HibernateUtil;

public class ServiceImpl implements ServiceI  {

	SessionFactory sf=HibernateUtil.getSessionFactory();
	Scanner sc=new Scanner(System.in);
	int stuid=0;
	@Override
	public void insertStudentData() {
		Student s=new Student();

		System.out.println("Enter Your name");
		String a=sc.next();
		s.setSname(a);

		System.out.println("Enter Your Address ");
		String b=sc.next();
		s.setSaddress(b);

		College c=new College();

		System.out.println("Enter Your College Name");
		String c1=sc.next();
		c.setCname(c1);

		s.setCollege(c);

		Session session=sf.openSession();
		session.save(s);
		session.beginTransaction().commit();
		System.out.println("------DATA INSERTED------");

	}
	public void displayStudentData(){ 

		Session session=sf.openSession();
		List<Student> slist=session.createQuery("from Student").getResultList();
		System.out.println("========== Data of Student displayed here ===========");
		slist.forEach((n) -> System.out.println(n));
		System.out.println("-----------------------------------------------------------");
	}
	@Override
	public void updateStudentData() {
		displayStudentData();
		// TODO Auto-generated method stub
		Session session=HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		System.out.println("Enter your Id for Updating Details: ");
		int id1=sc.nextInt();
		Student stu=session.get(Student.class, id1);
		System.out.println("Show USer Details  : " +stu);
		System.out.println("Enter Your updated  Name:");
		String x=sc.next();
		stu.setSname(x);

		System.out.println("Enter Your updated Address:");
		String y=sc.next();
		stu.setSaddress(y);

		int c_id=stu.getCollege().getCid();
		College c=session.get(College.class, c_id);
		System.out.println("Enter Your updated collage name:");
		String z=sc.next();
		c.setCname(z);
		stu.setCollege(c);
		session.update(stu);
		session.getTransaction().commit();
		System.out.println("--------UPDATED SUCCESSFULLY------");
	}
	@Override
	public void deleteStudentData() {
		displayStudentData();
		Session session=HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		System.out.println("Enter your Id for Delete Details: ");
		int id1=sc.nextInt();
		Student stu=session.get(Student.class, id1);
		session.delete(stu);
		session.getTransaction().commit();
		System.out.println("----------Deleted Successfully-----");
	}

}




