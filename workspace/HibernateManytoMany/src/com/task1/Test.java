package com.task1;

import org.hibernate.Session;

public class Test {
	public static void main(String[] args) {
		Session session=HibernateUtil.getSessionFactory().openSession();

		Course c1=new Course();
		c1.setId(1);
		c1.setCname("PYTHON");

		Course c2=new Course();
		c2.setId(2);
		c2.setCname("JAVA");

		Student stu=new Student();
		stu.setRollno(102);
		stu.setName("POOJA SHARMA");
		stu.setAddr("NOIDA");

		Student stu1=new Student();
		stu.setRollno(202);
		stu1.setName("PRIYANK GUPTA");
		stu1.setAddr("DELHI");

		stu.getScourse().add(c1);
		stu.getScourse().add(c2);
		stu1.getScourse().add(c1);
		stu1.getScourse().add(c1);
		session.save(stu);
		session.save(stu1);
		session.beginTransaction().commit();
	}

}
