package com.practice;

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
		//		for(int i=1; i<=10; i++){
		//			
		//		
		//		PersonalDetails pd=new PersonalDetails();
		//		pd.setPanid(sc.nextInt());
		//		pd.setName(sc.next());
		//		pd.setAddress(sc.next());
		//		pd.setGender(sc.next());
		//		pd.setAge(sc.nextInt());
		//		pd.setMobileno(sc.next());
		//		pd.setWeight(sc.nextDouble());
		//		
		//		session.save(pd);
		//	}
		//		session.beginTransaction().commit();
		//	}
		//				Query<PersonalDetails> query=session.createNativeQuery("select count(name) from personaldetails ");
		//			
		//						//List<PersonalDetails> list=query.getResultList();
		//				List<PersonalDetails> list=query.getResultList();
		//					//	list.forEach(n -> System.out.println(n));
		//			System.out.println(list);
		//	


		//=====================================================================================================================================
		//
		//		//		//MAXIMUM QUERY
		//				Session session1=HibernateUtil.getSessionFactory().openSession();
		//				Query<PersonalDetails> query1=session1.createNativeQuery("select max(age) as maximumage from personaldetails");
		//		
		//				//List<PersonalDetails> list1=query1.getResultList();
		//				List<PersonalDetails> list1=query1.getResultList();
		//				//	list.forEach(n -> System.out.println(n));
		//				System.out.println(list1);


		//=====================================================================================================================================
		//		// SUM AND AVG QUERY
		//				Session session1=HibernateUtil.getSessionFactory().openSession();
		//				Query<PersonalDetails> query1=session1.createNativeQuery("select sum(age) from personaldetails");
		//		
		//				//List<PersonalDetails> list1=query1.getResultList();
		//				List<PersonalDetails> list1=query1.getResultList();
		//				//	list.forEach(n -> System.out.println(n));
		//				System.out.println(list1);

		//=====================================================================================================================================

		//		//MINIMUM QUERY
		//		Session session2=HibernateUtil.getSessionFactory().openSession();
		//		Query<PersonalDetails> query2=session2.createNativeQuery("select min(age) as minimumage from personaldetails");
		//
		//		//List<PersonalDetails> list2=query.getResultList();
		//		List<PersonalDetails> list2=query2.getResultList();
		//		//	list2.forEach(n -> System.out.println(n));
		//		System.out.println(list1);
		//
		//		//=====================================================================================================================================
		//
		//		//ORDERBY QUERY
		//		Session session3=HibernateUtil.getSessionFactory().openSession();
		//		Query<Integer> query3=session3.createNativeQuery("select age from personaldetails order by age DESC");
		//
		//		//List<PersonalDetails> list3=query3.getResultList();
		//		List<Integer> list3=(List<Integer>)query3.getResultList();
		//		list3.forEach(n -> System.out.println(n));
		//		//System.out.println(list3);
		//
		//		//=====================================================================================================================================
		//
		//		//ORDERBY QUERY
		//		Session session4=HibernateUtil.getSessionFactory().openSession();
		//		Query<String> query4=session4.createNativeQuery("select name from personaldetails order by name DESC");
		//
		//		//List<PersonalDetails> list4=query4.getResultList();
		//		List<String> list4=(List<String>)query4.getResultList();
		//		list4.forEach(n -> System.out.println(n));
		//		//System.out.println(list4);
		//		
		//		
		//		




		//=====================================================================================================================================

		//BETWEEN QUERY

		//				Session session5=HibernateUtil.getSessionFactory().openSession();
		//	
		//				Query<String> query5=session5.createNativeQuery("select name from personaldetails where age between 28 and 30");
		//		
		//				//List<PersonalDetails> list5=query5.getResultList();
		//				List<String> list5=(List<String>)query5.getResultList();
		//				list5.forEach(n -> System.out.println(n));
		//				//System.out.println(list5);
		//		

		//=====================================================================================================================================

		//LIKE QUERY
		//		Session session6=HibernateUtil.getSessionFactory().openSession();
		//
		//				Query<PersonalDetails> query6=session6.createNativeQuery("select * from personaldetails where name like 'g%' ", PersonalDetails.class);
		//		
		//				//List<PersonalDetails> list6=query6.getResultList();
		//				List<PersonalDetails> list6=query6.getResultList();
		//				list6.forEach(n -> System.out.println(n));
		//				//System.out.println(list6);

		//=====================================================================================================================================

		//IN QUERY
		//				Session session7=HibernateUtil.getSessionFactory().openSession();
		//		
		//				Query<String> query7=session7.createNativeQuery("select name from personaldetails where age in(30, 28, 25)");
		//		
		//				//List<PersonalDetails> list7=query7.getResultList();
		//				List<String> list7=(List<String>)query7.getResultList();
		//				list7.forEach(n -> System.out.println(n));
		//				//System.out.println(list7);

		//		//=====================================================================================================================================
		//
		//		//IN QUERY
		//		Session session8=HibernateUtil.getSessionFactory().openSession();
		//		Query<String> query8=session8.createNativeQuery("select name from personaldetails where weight in(56, 60, 65)");
		//
		//		//List<PersonalDetails> list8=query8.getResultList();
		//		List<String> list8=(List<String>)query8.getResultList();
		//		list8.forEach(n -> System.out.println(n));
		//		//System.out.println(list8);
		//
		//
		//		//=====================================================================================================================================
		//		//SELECT TOP 3 * FROM Customers;
		//		
		//				Session session9=HibernateUtil.getSessionFactory().openSession();
		//				Query<PersonalDetails> query9=session9.createNativeQuery("select TOP 3 * from  personaldetails");
		//		
		//				//List<Integer> list9=query.getResultList();
		//				List<PersonalDetails> list9=query9.getResultList();
		//				list9.forEach(n -> System.out.println(n));
		//				//System.out.println(list9);


		//=====================================================================================================================================
		//		//SELECT TOP 3 * FROM Customers;	

		//ALL DATA GAIN QUERY
		Session session1=HibernateUtil.getSessionFactory().openSession();
		//		Query<PersonalDetails> query1=session1.createNativeQuery("select * from personaldetails",PersonalDetails.class);
		//
		//		//List<PersonalDetails> list1=query1.getResultList();
		//		List<PersonalDetails> list1=query1.getResultList();
		//			//list1.forEach(n -> System.out.println(n));
		//			//System.out.println(list1);
		//			for(PersonalDetails pd: list1){
		//				System.out.println(pd.getPanid());
		//				System.out.println(pd.getName());
		//				System.out.println(pd.getAddress());
		//				System.out.println(pd.getGender());
		//				System.out.println(pd.getAge());
		//				System.out.println(pd.getMobileno());
		//				System.out.println(pd.getWeight());
		//				//System.out.println(pd.);
	}

	//		Session session1=HibernateUtil.getSessionFactory().openSession();
	//		Query<Object[]> query1=session1.createNativeQuery("select name, gender from personaldetails");
	//
	//		//List<PersonalDetails> list1=query1.getResultList();
	//		List<Object[]> list1=query1.getResultList();
	//			//list1.forEach(n -> System.out.println(n));
	//			//System.out.println(list1);
	//			for(Object[] pd: list1){
	//			System.out.println(pd[0]);
	//			System.out.println(pd[1]);
	//				
	//			}
}

