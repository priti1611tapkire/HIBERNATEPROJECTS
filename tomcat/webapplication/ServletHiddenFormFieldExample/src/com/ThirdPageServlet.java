package com;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/thirdpage")
public class ThirdPageServlet extends HttpServlet{

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String first=request.getParameter("first");
		String second=request.getParameter("second");
		
		
		String thirddata=request.getParameter("thirdpagedata");
		System.out.println("Thed Page Data : "+ thirddata);
		
		request.setAttribute("t1", first);
		request.setAttribute("t2", second);
		request.setAttribute("t3", thirddata);
		RequestDispatcher rd=request.getRequestDispatcher("success.jsp");
		rd.forward(request, response);
		
	}
	
}

