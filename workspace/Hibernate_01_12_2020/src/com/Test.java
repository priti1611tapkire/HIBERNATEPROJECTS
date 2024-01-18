package com;

import org.hibernate.Session;

public class Test {
	public static void main(String[] args) {
		Session session=HibernateUtil.getSessionFactory().openSession();
		
		Account account=new Account();
		account.setAcno(101);
		account.setName("YOGITA");
		account.setAddr("PUNE");
		
		Account account1=new Account();
		account1.setAcno(102);
		account1.setName("PRITI");
		account1.setAddr("AURANGABAD");
		
		Accountplus acp=new Accountplus();
		acp.setAcpid(1);
		acp.setAmt(50000);
		
		Accountplus acp1=new Accountplus();
		acp1.setAcpid(2);
		acp1.setAmt(60000);
		
		account.setAcp(acp);
		account.setAcp(acp1);
		session.save(account);
		session.save(account1);
		session.beginTransaction().commit();
		
	}

}
