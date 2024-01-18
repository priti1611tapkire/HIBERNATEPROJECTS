package com.ONE_2_MANY_bidirection;

//ONE TO MANY BIDIRECTIONAL EX

import org.hibernate.Session;

public class Test {
	public static void main(String[] args) {
		Session session=HibernateUtil.getSessionFactory().openSession();
		 Customer c=new Customer();
		 c.setCid(12);
		 c.setCname("YOGITA");
		 
		 Product p=new Product();
		 p.setPid(155);
		 p.setPname("MOBILE");
		 p.setCustomer(c);
		 
		 Product p1=new Product();
		 p1.setPid(165);
		 p1.setPname("POWERBANK");
		 p1.setCustomer(c);
		 
		 Customer c1=new Customer();
		 c1.setCid(14);
		 c1.setCname("GUPTAJI");
		 
		 Product p2=new Product();
		 p2.setPid(175);
		 p2.setPname("HEADPHONES");
		 p2.setCustomer(c1);
		 
		 Product p3=new Product();
		 p3.setPid(185);
		 p3.setPname("CHARGER");
		 p3.setCustomer(c1);
		 
		 c.getProducts().add(p);
		 c.getProducts().add(p1);
		 c1.getProducts().add(p2);
		 c1.getProducts().add(p3);
		 
		 session.save(c);
		 session.save(c1);
		 session.beginTransaction().commit();
		 System.out.println("============");
		 }

}
