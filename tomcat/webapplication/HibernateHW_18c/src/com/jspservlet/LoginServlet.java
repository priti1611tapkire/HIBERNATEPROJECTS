package com.jspservlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.dbconfig.HibernateUtil;
import com.model.Student;

@WebServlet(urlPatterns="/log")
public class LoginServlet extends HttpServlet{

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		SessionFactory sf=HibernateUtil.getSessionFactory();
		String un=request.getParameter("t1");
		String ps=request.getParameter("t2");
		System.out.println(un);
		System.out.println(ps);
		if(un.equals("admin") && ps.equals("admin")) {
			Session session = sf.openSession();
			Query<Student> query=session.createQuery("from Student");
			List<Student> slist=query.getResultList();
			
			request.setAttribute("data", slist);
			
			RequestDispatcher rd=request.getRequestDispatcher("success.jsp");
			rd.forward(request, response);
		}
		else {
			Session session = sf.openSession();
			Query<Student> query=session.createQuery("from Student where suname=:uname AND spass=:pass");
			query.setParameter("uname", un);
			query.setParameter("pass", ps);
			
			List<Student> list=query.getResultList();
            request.setAttribute("data", list);
			
			RequestDispatcher rd=request.getRequestDispatcher("success.jsp");
			rd.forward(request, response);
		}
	}
	
}

