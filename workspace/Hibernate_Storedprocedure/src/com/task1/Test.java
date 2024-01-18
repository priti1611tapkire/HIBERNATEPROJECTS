package com.task1;

import org.hibernate.Session;

public class Test {
public static void main(String[] args) {
	Session session=HibernateUtil.getSessionFactory().openSession();
	
	Student stu=new Student();
	stu.setRollno(1);
	stu.setName("XYZ");
	stu.setAddr("Karvenagar");
	
	Phone p=new Phone();
	p.setId(12);
	p.setPhoto("78282685954");
	p.setStudent(stu);
	
	Phone p1=new Phone();
	p1.setId(13);
	p1.setPhoto("89525635214");
	p1.setStudent(stu);
	
	Student stu1=new Student();
	stu1.setRollno(2);
	stu1.setName("ABC");
	stu1.setAddr("AKURDI");
	
	Phone p2=new Phone();
	p2.setId(22);
	p2.setPhoto("78676565954");
	p2.setStudent(stu1);
	
	Phone p3=new Phone();
	p3.setId(23);
	p3.setPhoto("89425635214");
	p3.setStudent(stu1);
	
	stu.getPh().add(p2);
	stu.getPh().add(p3);
	stu1.getPh().add(p);
	stu1.getPh().add(p1);
	
	session.save(stu1);
	session.save(stu);
	session.beginTransaction().commit();
	
	
}
}
