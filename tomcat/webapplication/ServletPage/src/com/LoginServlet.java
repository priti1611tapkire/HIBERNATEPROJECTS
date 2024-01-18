package com;

import java.io.IOException;
import java.util.List;

import javax.persistence.Query;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;

@WebServlet("/log")
public class LoginServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Session session=HibernateUtil.getSessionFactory().openSession();
		String un=request.getParameter("t1");
		String ps=request.getParameter("t2");
		
		System.out.println(un+" "+ps);
		
		if(un.equals("admin") && ps.equals("admin")){
			Query q=session.createQuery("from User");
			List<User> l=q.getResultList();
			request.setAttribute("data", l);
			RequestDispatcher rd=request.getRequestDispatcher("success.jsp");
			rd.forward(request, response);
		}
		
		else{
			Query q=session.createQuery("from User where uname=:un1 AND pass=:ps1");
			q.setParameter("un1", un);
			q.setParameter("ps1", ps);
			List<User> l=q.getResultList();
			request.setAttribute("data", l);
			RequestDispatcher rd=request.getRequestDispatcher("success.jsp");
			rd.forward(request, response);
			
		}
	}
	
}
