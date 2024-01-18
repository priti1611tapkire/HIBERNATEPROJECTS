package com.joinedquery;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.query.Query;

public class Test {
	public static void main(String[] args) {
		Session session=HibernateUtil.getSessionFactory().openSession();

		//		Scanner sc=new Scanner(System.in);
		//		System.out.println("enter employee details");
		//		
		//		for(int i=1; i<=5; i++){
		//			System.out.println("STAFF TABLE");
		//			Staff_table st=new Staff_table();
		//			System.out.println("staff id: ");
		//			st.setSid(sc.nextInt());
		//			System.out.println("staff name: ");
		//			st.setSname(sc.next());
		//			System.out.println("staff address: ");
		//			st.setSaddress(sc.next());
		//			System.out.println("staff age:");
		//			st.setSage(sc.nextInt());
		//			System.out.println("staff package: ");
		//			st.setMonthlypakg(sc.nextDouble());
		//			
		//			System.out.println("PAYMENT TABLE");	
		//			Payment_table pt=new Payment_table();
		//			System.out.println("payment id: ");
		//			pt.setPayid(sc.nextInt());
		//			System.out.println("payment amt: ");
		//			pt.setAmaount(sc.nextDouble());
		//			System.out.println("payment date: ");
		//			pt.setDate(sc.next());
		//			st.setPt(pt);
		//			session.save(st);
		//			
		//			session.beginTransaction().commit();
		//			System.out.println("==================================");	
		//		}

		//==================================================================================================================================================
		//		SELECT Staff_ID, Staff_NAME, Staff_AGE, AMOUNT   
		//		   FROM STAFF s, PAYMENT p  
		//		   WHERE s.ID =p.STAFF_ID; 
//		//		
//				Query<Object[]> query=session.createNativeQuery("select sid, sname, sage, amaount from staff_table s, payment_table p where p.payid=s.pt_payid  ");
//						
//				List<Object[]> list=query.getResultList();
//				 
//				for(Object[] o:list){
//					System.out.println(o[0]);
//					System.out.println(o[1]);
//					System.out.println(o[2]);
//					System.out.println(o[3]);
//				}

		//========================================================================================================================================		
		//		SELECT column_name(s)
		//		FROM table1
		//		LEFT JOIN table2
		//		ON table1.column_name = table2.column_name;

//				Query<Object[]> query=session.createNativeQuery("select sid, sname, sage, amaount, date, saddress, monthlypakg from staff_table LEFT JOIN payment_table on payid=pt_payid ");
//				
//				List<Object[]> list=query.getResultList();
//				 
//				for(Object[] o:list){
//					System.out.println(o[0]);
//					System.out.println(o[1]);
//					System.out.println(o[2]);
//					System.out.println(o[3]);
//					System.out.println(o[4]);
//					System.out.println(o[5]);
//					System.out.println(o[6]);
//				}


		//======================================================================================================================================			
		//		SELECT column_name(s)
		//		FROM table1
		//		RIGHT JOIN table2
		//		ON table1.column_name = table2.column_name;
		//		


//		Query<Object[]> query=session.createNativeQuery("select sid, sname, amaount, date, saddress, monthlypakg from staff_table RIGHT JOIN payment_table on payid=pt_payid ");
//
//		List<Object[]> list=query.getResultList();
//
//		for(Object[] o:list){
//			System.out.println(o[0]);
//			System.out.println(o[1]);
//			System.out.println(o[2]);
//			System.out.println(o[3]);
//			System.out.println(o[4]);
//			System.out.println(o[5]);
//			//System.out.println(o[6]);
//		}
//		
//		SELECT column_name(s)
//		FROM table1
//		FULL OUTER JOIN table2
//		ON table1.column_name = table2.column_name
//		WHERE condition;
		
	//	Query<Object[]> query=session.createNativeQuery("select sid, sname, amaount, date, saddress, monthlypakg from staff_table FULL OUTER JOIN payment_table on payid=pt_payid where staff_table.sname");
		//
//				List<Object[]> list=query.getResultList();
		//
//				for(Object[] o:list){
//					System.out.println(o[0]);
//					System.out.println(o[1]);
//					System.out.println(o[2]);
//					System.out.println(o[3]);
//					System.out.println(o[4]);
//					System.out.println(o[5]);
//					//System.out.println(o[6]);
//				}
	}
	
	

}
