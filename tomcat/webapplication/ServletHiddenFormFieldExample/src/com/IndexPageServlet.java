package com;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet(urlPatterns = "/indexpage")
public class IndexPageServlet extends HttpServlet{

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String indexpagedata=request.getParameter("indexpagefield");
		System.out.println("Input Field Data From Index Page: " +indexpagedata);
		
		request.setAttribute("t1", indexpagedata);
		RequestDispatcher rd=request.getRequestDispatcher("second.jsp");
		rd.forward(request, response);
	}
	
}

