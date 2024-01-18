package com;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/first")
public class FirstServlet extends HttpServlet{

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	 System.out.println("First get");
	 
	 String t1=request.getParameter("t1");
	 
	 HttpSession session=request.getSession();
	 if(!session.isNew()){
		 System.out.println(session.isNew());
		 session.invalidate();
		 session=request.getSession();
		 System.out.println("yes done");
	 }
	 
	 session.setAttribute("first", t1);
	 RequestDispatcher rd=request.getRequestDispatcher("second.jsp");
	 rd.forward(request, response);
	}
}
