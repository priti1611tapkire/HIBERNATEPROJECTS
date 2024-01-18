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

@WebServlet("/del")
public class DeleteServlet extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		SessionFactory sf=HibernateUtil.getSessionFactory();
		
		Session session=sf.openSession();
		session.beginTransaction();
		
		int deleteid=Integer.parseInt(request.getParameter("id"));
		
		Student s=session.get(Student.class, deleteid);
	    session.delete(s);
	    session.getTransaction().commit();
	    
	    Session session2=sf.openSession();
	    List<Student> slist= session2.createQuery("from Student").getResultList();
	    request.setAttribute("data", slist);
	    
	    RequestDispatcher rd=request.getRequestDispatcher("success.jsp");
	    rd.forward(request, response);
	}
}

