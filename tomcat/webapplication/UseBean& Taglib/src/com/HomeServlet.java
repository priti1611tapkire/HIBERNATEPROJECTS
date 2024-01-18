package com;

import java.io.IOException;
import java.util.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/log")
public class HomeServlet extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Student s=new Student();
		s.setId(1);
		s.setName("MEENA");
		s.setAddress("Akola");
		
		Student s1=new Student();
		s1.setId(2);
		s1.setName("GEETA");
		s1.setAddress("VASHIM");
		
		List<Student> list=new ArrayList<>();
		list.add(s);
		list.add(s1);
		
		String msg="Data send to success page";
		
		request.setAttribute("data", s);
		request.setAttribute("list", list);
		
		RequestDispatcher rd=request.getRequestDispatcher("success.jsp");
		
		rd.forward(request, response);
		
	}
	 

}
