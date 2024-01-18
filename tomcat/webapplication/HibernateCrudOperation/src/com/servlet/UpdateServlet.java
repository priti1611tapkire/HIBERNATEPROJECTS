package com.servlet;

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

import com.dbconfig.HibernateUtil;
import com.model.Student;

@WebServlet("/up")
public class UpdateServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
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
		session.beginTransaction();
	    session.update(s);
	    session.getTransaction().commit();
	    
	    Session session2=sf.openSession();
	    List<Student> slist=session.createQuery("from Student").getResultList();
	    request.setAttribute("data", slist);
	    
	    RequestDispatcher rd=request.getRequestDispatcher("success.jsp");
	    rd.forward(request, response);
	}
	

}
