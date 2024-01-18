package com;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/log")
public class LoginServlet extends HttpServlet{

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String u=request.getParameter("uname");
		String p=request.getParameter("pass");
		
		HttpSession session= request.getSession();
		if(!session.isNew())
		{
			session.invalidate();
			session=request.getSession();
			session.setAttribute("un", u);
			session.setAttribute("ps", p);
			RequestDispatcher rd=request.getRequestDispatcher("success.jsp");
			rd.forward(request, response);
		}
		else {
			RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
			rd.forward(request, response);
		}	
	}
}
