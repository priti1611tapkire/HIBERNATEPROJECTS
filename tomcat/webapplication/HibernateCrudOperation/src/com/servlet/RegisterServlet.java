package com.servlet;

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

@WebServlet(urlPatterns = "/reg")
public class RegisterServlet extends HttpServlet{

	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Register Servlet Called");
		
		SessionFactory sf=HibernateUtil.getSessionFactory();
		System.out.println(request.getParameter("sid"));
		int id1=Integer.parseInt(request.getParameter("sid"));
		
		
		String name=request.getParameter("sname");
		
		String address=request.getParameter("saddress");
		
		String salary=request.getParameter("salary");
		double salary1=Double.parseDouble(salary);
		
		String gender=request.getParameter("gender");
		
		String uname=request.getParameter("suname");
		
		String pass=request.getParameter("spass");
		
		Student s=new Student();
		s.setSid(id1);
		s.setSname(name);
		s.setSaddress(address);
		s.setSalary(salary1);
		s.setGender(gender);
		s.setSuname(uname);
		s.setSpass(pass);
		System.out.println(" Data of Student :  " + s);
		
	    Session session=sf.openSession();
	    session.save(s);
	    session.beginTransaction().commit();
		
		 
		RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
		rd.forward(request, response);
		
	}
}
