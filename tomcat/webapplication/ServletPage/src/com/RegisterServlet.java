package com;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;

@WebServlet("/reg")
public class RegisterServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		Session session=HibernateUtil.getSessionFactory().openSession();
		
		//String uid=request.getParameter("id");
		int id1=Integer.parseInt(request.getParameter("id"));
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
		session.save(u);
		session.beginTransaction().commit();
		System.out.println("done");
		
		RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
		rd.forward(request, response);
		
	}
}
