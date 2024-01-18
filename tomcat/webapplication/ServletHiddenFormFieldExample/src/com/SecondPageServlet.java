package com;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/secondpage")
public class SecondPageServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String indexpage=request.getParameter("indexpagefield");
		String secondData=request.getParameter("secondData");
		System.out.println("Data from Second page :  "+secondData);
		
		request.setAttribute("t1", indexpage);
		request.setAttribute("t2", secondData);
		RequestDispatcher rd=request.getRequestDispatcher("third.jsp");
		rd.forward(request, response);
		
	}
}
