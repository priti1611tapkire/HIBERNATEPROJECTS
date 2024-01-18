package com.servlets;

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

import com.model.Employee;

import com.utility.copy.HibernateUtil;

@WebServlet(urlPatterns="/regk")
public class RegisterServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		SessionFactory sf=HibernateUtil.getSessionFactory();
		System.out.println(request.getParameter("id"));
		int id1=Integer.parseInt(request.getParameter("id"));

		String ename=request.getParameter("name");

		String addr=request.getParameter("address");

		String pannum=request.getParameter("panno");

		String adhno=request.getParameter("adharno");

		String dob=request.getParameter("date");

		System.out.println(request.getParameter("eage"));
		int age =Integer.parseInt(request.getParameter("eage"));

		String mailid=request.getParameter("email");
		
		System.out.println(request.getParameter("emob"));
		long mobno=Long.parseLong(request.getParameter("emob"));

		String uname=request.getParameter("usname");

		String pass=request.getParameter("passw");

		Employee e=new Employee();
		e.setId(id1);
		e.setName(ename);
		e.setAddress(addr);
		e.setPanno(pannum);
		e.setAdharno(adhno);
		e.setEdob(dob);
		e.setEage(age);
		e.setEmail(mailid);
		e.setEmob(mobno);
		e.setUsername(uname);
		e.setPassword(pass);
		System.out.println(e);

		Session session=sf.openSession();
		session.save(e);
		session.beginTransaction().commit();
		System.out.println("Successfully");

		RequestDispatcher rd=request.getRequestDispatcher("index.html");
		rd.forward(request, response);	
	}

}
