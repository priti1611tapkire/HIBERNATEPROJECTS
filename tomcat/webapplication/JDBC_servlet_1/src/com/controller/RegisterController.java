package com.controller;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.config.JdbcConnection;


@WebServlet(urlPatterns = "/reg")
public class RegisterController extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	     int id1=Integer.parseInt(request.getParameter("id"));
		
	     String name=request.getParameter("name");
	     String address=request.getParameter("address");
	     String uname=request.getParameter("uname");
	     String pass=request.getParameter("pass");
	     Connection con=JdbcConnection.getConnection();
 	     String sql1="insert into customer values(?,?,?,?,?)";
	   
	     try {
	    	
			PreparedStatement ps=con.prepareStatement(sql1);
			ps.setInt(1, id1);
			ps.setString(2, name);
			ps.setString(3, address);
			ps.setString(4, uname);
			ps.setString(5, pass);
			ps.execute();
			System.out.println("Data inserted");
			
			RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
			rd.forward(request, response);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}


}
