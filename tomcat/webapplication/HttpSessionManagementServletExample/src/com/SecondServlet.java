package com;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/second")
public class SecondServlet extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String second=request.getParameter("t2");
		HttpSession session=request.getSession(false);
		
		session.setAttribute("second", second);
		
		RequestDispatcher rd=request.getRequestDispatcher("third.jsp");
		rd.forward(request, response);
		
	}

}
