package com;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/reg")
public class Registerservelet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String uname=request.getParameter("t4");
		System.out.println("uname: "+uname);
		String address=request.getParameter("t5");
		System.out.println("useraddress: "+address);
		String unm=request.getParameter("t6");
		System.out.println("username: "+unm);
		String pass=request.getParameter("t7");
		System.out.println("password: "+pass);
		
		
		System.out.println("welcome to our website");
		
	}
}
