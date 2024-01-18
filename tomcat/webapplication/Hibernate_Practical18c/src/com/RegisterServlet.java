package com;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/reg")
public class RegisterServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Registration");

		String id1=request.getParameter("t3");
		int id=Integer.parseInt(id1);
		System.out.println(id);
		String name=request.getParameter("t4");
		System.out.println(name);
		String addr=request.getParameter("t5");
		System.out.println(addr);
		String urname=request.getParameter("t6");
		System.out.println(urname);
		String pass=request.getParameter("t7");
		System.out.println(pass);
		String gender=request.getParameter("gender");
		Student s=new Student();
		
		s.setId(id);
		s.setUname(name);
		s.setAddress(addr);
		s.setUsername(urname);
		s.setPassword(pass);
		s.setGender(gender);
		System.out.println(s);
		
		request.setAttribute("msg",s);

		RequestDispatcher rd=request.getRequestDispatcher("success.jsp");
		rd.forward(request, response);

	}
}
