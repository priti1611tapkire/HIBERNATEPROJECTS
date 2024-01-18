package com.l1;

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
		System.out.println("Hello");
		String uname=request.getParameter("t1");
		String pass=request.getParameter("t2");
		System.out.println("Uname:"+uname);
		System.out.println("Pass:"+pass);
		
		request.setAttribute("msg", "cjcPune");
		
		RequestDispatcher rd=request.getRequestDispatcher("success.jsp");
		rd.forward(request, response);
	}
}
