package com;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;

@WebServlet("/edit")
public class EditServlet  extends HttpServlet{

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Session session=HibernateUtil.getSessionFactory().openSession();
		
		int id1=Integer.parseInt(request.getParameter("uid"));
		System.out.println(id1);
		
		User u=session.get(User.class, id1);
		
		request.setAttribute("data", u);
		
		RequestDispatcher rd=request.getRequestDispatcher("edit.jsp");
		rd.forward(request, response);
		
	}
}
