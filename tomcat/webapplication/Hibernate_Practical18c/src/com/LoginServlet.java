package com;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/log")
public class LoginServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("hello--");
		
		String uname=request.getParameter("t1");
		String pass=request.getParameter("t2");
		System.out.println(uname);
		System.out.println(pass);
		
		RequestDispatcher rd=request.getRequestDispatcher("success1.jsp");
		rd.forward(request, response);
		
	}
}
