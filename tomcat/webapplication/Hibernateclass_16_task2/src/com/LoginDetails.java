package com;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/log")
public class LoginDetails extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		System.out.println("hello");

		String uname=request.getParameter("t1");
		System.out.println("Username:"+uname);
		String pass=request.getParameter("t2");
		System.out.println("password:"+pass);

		Student s=new Student();
		s.setRollno(1);
		s.setName("PRITI");
		s.setAddress("ABAD");
		request.setAttribute("msg", s);

		RequestDispatcher rd=request.getRequestDispatcher("success.jsp");
		rd.forward(request, response);

	}
}
