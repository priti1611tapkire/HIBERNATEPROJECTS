package com.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.config.HibernateUtil;
import com.model.Client;
import com.service.ServiceI;
import com.service.ServiceImpl;

@WebServlet(urlPatterns="/del")
public class DeleteServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ServiceI s1=new ServiceImpl();
		
		String deleteid=request.getParameter("id");
		s1.deleteData(deleteid);
		
		List<Client> slist=s1.getAlldatat();
	    request.setAttribute("data", slist);
	    
	    RequestDispatcher rd=request.getRequestDispatcher("success.jsp");
	    rd.forward(request, response);
	}
	

}
