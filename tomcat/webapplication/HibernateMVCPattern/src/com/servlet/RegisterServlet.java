package com.servlet;

import java.io.IOException;

import java.util.Random;

import javax.persistence.SequenceGenerator;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.Client;
import com.service.ServiceI;
import com.service.ServiceImpl;

@WebServlet(urlPatterns="/reg")
public class RegisterServlet extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ServiceI s=new ServiceImpl();
		
		Random ran=new Random();
		int id=ran.nextInt(1000);
		String cid="CLIENT"+id;
		
		
		String cname=request.getParameter("cname");
		  String caddress=request.getParameter("caddress");
		  float csalary=Float.parseFloat(request.getParameter("csalary"));
		  String cuname=request.getParameter("cuname");
		  String cpass=request.getParameter("cpass");
		  
		  Client c=new Client();
		  c.setCid(cid);
		  c.setCname(cname);
		  c.setCaddress(caddress);
		  c.setCsalary(csalary);
		  c.setCuname(cuname);
		  c.setCpass(cpass);
		  System.out.println("Data From Register page : " + c);
		  s.insertData(c);
		  
		  
		  RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
		  rd.forward(request, response);
		  
		
		
	}

}
