package com;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/third")
public class ThirdServlet extends HttpServlet{

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String third=request.getParameter("t3");
		
		HttpSession session=request.getSession(false);
		session.setAttribute("third", third);
		
		RequestDispatcher rd=request.getRequestDispatcher("print.jsp");
		rd.forward(request, response);
		
	}
}

