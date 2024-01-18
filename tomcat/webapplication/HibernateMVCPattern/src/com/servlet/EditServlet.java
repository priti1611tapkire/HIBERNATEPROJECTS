package com.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.Client;
import com.service.ServiceI;
import com.service.ServiceImpl;
@WebServlet(urlPatterns="/edit")
public class EditServlet extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		ServiceI s=new ServiceImpl();
		String selectid=request.getParameter("id");
		System.out.println("Id from success page:"+selectid);
		Client c=s.getSingleClient(selectid);
		System.out.println(c);
		
		request.setAttribute("client", c);
		RequestDispatcher rd=request.getRequestDispatcher("edit.jsp");
		rd.forward(request, response);
	}

}
