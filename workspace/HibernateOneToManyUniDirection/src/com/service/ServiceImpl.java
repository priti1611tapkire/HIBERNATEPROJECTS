package com.service;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.model.LoginAccountDetails;

import com.model.User;
import com.utility.HibernateUtil;

public class ServiceImpl implements ServiceI  {

	SessionFactory sf=HibernateUtil.getSessionFactory();
	Scanner sc=new Scanner(System.in);

	@Override
	public void insertAllData() {
		User u=new User();
		System.out.println("Enter Your Username");
		u.setUname(sc.next());

		System.out.println("Enter Your Paasword");
		u.setPass(sc.next());

		System.out.println("How many Account to be register");
		int n=sc.nextInt();

		for(int i=0;i<n;i++){
			LoginAccountDetails l=new LoginAccountDetails();

			System.out.println("Enter "+i+ "th loginAccountDetails loginAccount Name" );
			l.setLaccountname(sc.next());

			u.getLoginAccountDetails().add(l);

		}
		Session session=sf.openSession();
		session.save(u);
		session.beginTransaction().commit();
		System.out.println("------------DATA INSERTED SUCCESSFULLY----------");	

	}

	@Override
	public void displayAllData() {

		Session session=sf.openSession();
		List<User> ulist=session.createQuery("from User").getResultList();

		System.out.println("----------xxxxxxxxxxxx------------");
		for(User u:ulist) {
			System.out.println(u);
			System.out.println("-------DETAILS DISPLAY SUCCESSFULLY----------");
		}

	}

	@Override
	public void updateAllData() {
		// TODO Auto-generated method stub
		displayAllData();
		SessionFactory sf=HibernateUtil.getSessionFactory();
		Session session1=sf.openSession();
		session1.beginTransaction();
		System.out.println("Enter your User Id for Updating Details: ");
		int id1=sc.nextInt();
		User u=session1.get(User.class, id1);
		System.out.println("Enter Your uodated Username");
		u.setUname(sc.next());

		System.out.println("Enter Your uodated Paasword");
		u.setPass(sc.next());

		List<LoginAccountDetails> list=u.getLoginAccountDetails();
		Iterator itr=list.iterator();
		while(itr.hasNext()){
			LoginAccountDetails l=(LoginAccountDetails) itr.next();
			System.out.println(l.getLid());
			System.out.println(l.getLaccountname());
			System.out.println("Enter upadted account name");
			l.setLaccountname(sc.next());
			//l.setLid(l.getLid());
		}
		session1.update(u);
		session1.getTransaction().commit();
		System.out.println("----------------DATA UPDATED SUCCESSFULLY-------------");		
	}

	@Override
	public   void updateperticularData() {
		// TODO Auto-generated method stub
		displayAllData();
		SessionFactory sf=HibernateUtil.getSessionFactory();
		Session session1=sf.openSession();
		session1.beginTransaction();
		System.out.println("Enter your User Id for Updating Details: ");
		int id1=sc.nextInt();
		User u=session1.get(User.class, id1);
		System.out.println("Enter your Login id which you want to update ");
		int id=sc.nextInt();
		List<LoginAccountDetails> list=u.getLoginAccountDetails();
		Iterator itr=list.iterator();
		while(itr.hasNext()){
			LoginAccountDetails l=(LoginAccountDetails) itr.next();

			if(id==l.getLid()){
				System.out.println("Enter upadted account name");
				l.setLaccountname(sc.next());
			}
		}
		session1.update(u);
		session1.getTransaction().commit();
		System.out.println("-------------DATA UPDATED SUCCESSFULLY-------------");		
	}

	@Override
	public void deleteAllData() {

		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		displayAllData();
		System.out.println("Enter Your id To be All delete ");
		int id=sc.nextInt();
		User u=session.get(User.class, id);
		session.delete(u);
		tx.commit();
		System.out.println("-------ALL DATA DELETE SUCCESSFULLY----------");
	}

	@Override
	public void deleteperticularData() {
		System.out.println("==========list of data==========");
		// TODO Auto-generated method stub
		SessionFactory sf=HibernateUtil.getSessionFactory();
		Session session=sf.openSession();
		List<User> ulist=session.createQuery("from User").getResultList();
		for(User u:ulist){
			System.out.println(u);
			System.out.println("==================");
		}
		LoginAccountDetails lad1=null;
		System.out.println("Enter your User Id which we want to delete perticular login accountdeatils");
		int id=sc.nextInt();
		User u=session.get(User.class, id);
		System.out.println(u);
		List<LoginAccountDetails> lglist=u.getLoginAccountDetails();
		boolean flag=false;
		System.out.println("Enter id which loginaccount you want to delete");
		int id1=sc.nextInt();
		for(LoginAccountDetails lg:lglist){
			if(id1==lg.getLid()){
				flag=true;
				lad1=lg;
			}
		}
		if(flag){
			u.getLoginAccountDetails().remove(lad1);
			session.delete(lad1);
			session.beginTransaction().commit();
			System.out.println("delete successfully");
		}
		System.out.println("==========list of data after==========");
		List<User> ulist1=session.createQuery("from User").getResultList();
		for(User u2:ulist1){
			System.out.println(u2);
			System.out.println("======SUCCESSFULLY COMPLETED=====");
		}


	}

}





