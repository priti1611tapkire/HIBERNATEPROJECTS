package com;

import java.util.*;

import org.hibernate.Session;

public class Test {
	public static void main(String[] args) {
		Session session=HibernateUtil.getsessionfactory().openSession();
	
		List<Team> list=session.createQuery("From Team").getResultList();
		
		for(Team team:list){
			System.out.println(team.getTeammates());
			System.out.println(team.getTeammembers());
			System.out.println(team.getWork());
		}
			
	}

}
