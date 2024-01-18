package com.dao;

import java.util.List;


import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.config.HibernateUtil;
import com.model.Client;


public class DaoImpl implements DaoI {
	SessionFactory sf=HibernateUtil.getSessionFactory();

	@Override
	public void insertData(Client client) {
		// TODO Auto-generated method stub
		System.out.println("in Dao Layer:"+client);
		Session session=sf.openSession();
		session.save(client);
		session.beginTransaction().commit();
		System.out.println("Data Successfully inserted");
	}

	@Override
	public List<Client> getAlldata(String u, String p) {
		// TODO Auto-generated method stub
		Session session=sf.openSession();
		List<Client> clist=null;
		if(u.equals("admin") && p.equals("admin")){
			Query<Client> q=session.createQuery("from Client");
			clist=q.getResultList();
			return clist;
		}
		else{
			Query<Client> q=session.createQuery("from Client where cuname=:uname AND cpass=:pass");
			q.setParameter("uname", u);
			q.setParameter("pass", p);
			clist=q.getResultList();
			return clist;
		}

	}

	@Override
	public Client getSingleClient(String cid) {
		// TODO Auto-generated method stub
		Session session=sf.openSession();
		Client c=session.get(Client.class, cid);
		return c;
	}

	@Override
	public List<Client> getUpdateData(Client client) {
		// TODO Auto-generated method stub
		Session session=sf.openSession();
		session.beginTransaction();
		session.update(client);
		session.getTransaction().commit();

		Query<Client> query=session.createQuery("from Client");
		List<Client> clist=query.getResultList();

		return clist;
	}
	
	public List<Client> getAlldatat(){
		 Session session2=sf.openSession();
		    List<Client> slist= session2.createQuery("from Client").getResultList();	
		return slist;
	}

	@Override
	public void deleteData(String deleteid) {
		// TODO Auto-generated method stub
		Session session=sf.openSession();
		session.beginTransaction();
		Client s=session.get(Client.class, deleteid);
	    session.delete(s);
	    session.getTransaction().commit();

		
	}

}
