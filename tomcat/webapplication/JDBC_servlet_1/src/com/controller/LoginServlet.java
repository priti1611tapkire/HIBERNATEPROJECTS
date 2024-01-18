package com.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.config.JdbcConnection;
import com.model.Customer;


@WebServlet("/log")
public class LoginServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		List<Customer> clist=new ArrayList<Customer>();
		
		String un=request.getParameter("uname");
		String ps=request.getParameter("pass");
		
		if(un.equals("admin") && ps.equals("admin"))
		{
			Connection con=JdbcConnection.getConnection();
			String sql="select * from customer";
			try {
				PreparedStatement ps1=con.prepareStatement(sql);
			     ResultSet rs=ps1.executeQuery();
				while(rs.next()) {
					Customer customer=new Customer();
					customer.setId(rs.getInt(1));
					customer.setName(rs.getString(2));
					customer.setAddress(rs.getString(3));
					customer.setUname(rs.getString(4));
					customer.setPass(rs.getString(5));
					clist.add(customer);
				}
				request.setAttribute("data", clist);
				RequestDispatcher rd=request.getRequestDispatcher("success.jsp");
				rd.forward(request, response);
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else {
			 if(clist.isEmpty()) {
				String msg="Pls Enter Valid Credentials";
				request.setAttribute("m", msg);
				 RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
					rd.forward(request, response);
			 }
		}
		
	}
}
