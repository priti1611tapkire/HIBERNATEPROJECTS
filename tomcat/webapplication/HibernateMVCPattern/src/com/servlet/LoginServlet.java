package com.servlet;

import java.io.IOException;
import java.util.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.Client;
import com.service.ServiceI;
import com.service.ServiceImpl;

@WebServlet(urlPatterns="/log")
public class LoginServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		ServiceI s=new ServiceImpl();

		String un=request.getParameter("cuname");
		String ps=request.getParameter("cpass");

		List<Client> clist=s.getAlldata(un,ps);

		request.setAttribute("data", clist);

		RequestDispatcher rd=request.getRequestDispatcher("success.jsp");
		rd.forward(request, response);
	}
}
