package com;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;


@WebServlet("/delete")
public class DeleteServlet {
protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		SessionFactory sf=HibernateUtil.getSessionFactory();
		
		Session session=sf.openSession();
		session.beginTransaction();
		
		int deleteid=Integer.parseInt(request.getParameter("uid"));
		
		User s=session.get(User.class, deleteid);
	    session.delete(s);
	    session.getTransaction().commit();
	    
	    Session session2=sf.openSession();
	    List<User> ulist= session2.createQuery("from User").getResultList();
	    request.setAttribute("data", ulist);
	    
	    RequestDispatcher rd=request.getRequestDispatcher("success.jsp");
	    rd.forward(request, response);
	}
}
