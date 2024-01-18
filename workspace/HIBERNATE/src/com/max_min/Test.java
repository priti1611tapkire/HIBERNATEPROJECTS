package com.max_min;

import org.hibernate.Session;

public class Test {
public static void main(String[] args) {
	Session session=HibernateUtil.getSessionFactory().openSession();
	
	Student stu=new Student();
	stu.setRollno(1);
	stu.setName("XYZ");
	stu.setAddr("Karvenagar");
	stu.setPercentage(90);
	
	
	Student stu1=new Student();
	stu1.setRollno(2);
	stu1.setName("ABC");
	stu1.setAddr("AKURDI");
	stu1.setPercentage(80);
	

	session.save(stu1);
	session.save(stu);
	session.beginTransaction().commit();
	
	
}
}
