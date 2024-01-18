package com;

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
@WebServlet("/up")
public class UpdateServlet extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
	SessionFactory sf=HibernateUtil.getSessionFactory();
	
	//String uid=request.getParameter("id");
	int id1=Integer.parseInt(request.getParameter("uid"));
	System.out.println(id1);
	
	String uname=request.getParameter("name");
	String address=request.getParameter("addr");
	String username=request.getParameter("uname");
	String password=request.getParameter("pass");
	System.out.println(uname+" "+address+" "+username+" "+password);
	
	User u=new User();
	u.setId(id1);
	u.setName(uname);
	u.setAddr(address);
	u.setUname(username);
	u.setPass(password);
	System.out.println(id1+" "+uname+" "+address+" "+username+" "+password);
	Session session=sf.openSession();
	session.beginTransaction();
	session.update(u);
	session.getTransaction().commit();
	
	List<User> u1=session.createQuery("from User").getResultList();
	request.setAttribute("data", u1);
	
	System.out.println("done");
	  RequestDispatcher rd=request.getRequestDispatcher("success.jsp");
	    rd.forward(request, response);
	
	
	}

}
