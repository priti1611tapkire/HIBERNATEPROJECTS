package com;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns="/abc")
public class Account extends HttpServlet{

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String un=request.getParameter("t1");
		String pass=request.getParameter("t2");
		System.out.println(un);
		System.out.println(pass);
		System.out.println("Welcome------");
		
		RequestDispatcher rd=request.getRequestDispatcher("success.html");
		rd.forward(request, response);
		
		
		
	}
}
