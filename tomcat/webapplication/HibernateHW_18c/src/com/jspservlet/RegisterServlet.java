package com.jspservlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.dbconfig.HibernateUtil;
import com.model.Student;

@WebServlet(urlPatterns="/reg")
public class RegisterServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("HELLO");
		
		SessionFactory sf=HibernateUtil.getSessionFactory();
		Session session=sf.openSession();
		
		int id=Integer.parseInt(request.getParameter("id1"));
		
		String stname=request.getParameter("t4");
		String saddr=request.getParameter("t5");
		String genderr=request.getParameter("gender");
		String usernm=request.getParameter("t6");
		String passwd=request.getParameter("t7");
		
		System.out.println("all details:"+id+" "+stname+" "+saddr+" "+genderr+" "+usernm+" "+passwd);
		
		Student s=new Student();
		s.setSid(id);
		s.setSname(stname);
		s.setSaddress(saddr);
		s.setGender(genderr);
		s.setSuname(usernm);
		s.setSpass(passwd);
		session.save(s);
		session.beginTransaction().commit();
		System.out.println("successfully");
		
		RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
		rd.forward(request, response);
		
	}
}
