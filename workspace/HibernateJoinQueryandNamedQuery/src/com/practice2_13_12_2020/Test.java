package com.practice2_13_12_2020;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.query.Query;

public class Test {
	public static void main(String[] args) {
		Session session=HibernateUtil.getSessionFactory().openSession();

//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter Details");
//
//
//		for(int i=1; i<=5; i++){
//
//			Customer c=new Customer();
//			System.out.println("enter your Customer details");
////			c.setCid(sc.nextInt());
////			c.setCname(sc.next());
//		
//			CustomerOrder cd=new CustomerOrder();
//			System.out.println("enter your Customerorder details");
////			cd.setOid(sc.nextInt());
////			cd.setOname(sc.next());
//		
//			System.out.println("===========");
//			session.save(c);
//			session.save(cd);
//			session.beginTransaction().commit();
//
//		}
//		
		Query<Object[]> query=session.createNativeQuery("select customer.cname,  customerorder.oname from customer inner join customerorder ON customer.cid=customer.cid");
		
		
		List<Object[]> list =query.getResultList();
		
		for(Object[] o:list){
			System.out.println(o[0]);
			System.out.println(o[1]);
		}
	}
}
