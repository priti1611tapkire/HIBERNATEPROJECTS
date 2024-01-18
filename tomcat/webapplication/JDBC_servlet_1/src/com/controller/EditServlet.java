package com.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.config.JdbcConnection;
import com.model.Customer;

@WebServlet("/edit")
public class EditServlet  extends HttpServlet{

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int id=Integer.parseInt(request.getParameter("rd"));
		Customer c=new Customer();
		Connection con=JdbcConnection.getConnection();
		String sql="select * from customer where id="+id;
		try {
			PreparedStatement ps=con.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				c.setId(rs.getInt(1));
				c.setName(rs.getString(2));
				c.setAddress(rs.getString(3));
				c.setUname(rs.getString(4));
				c.setPass(rs.getString(5));
			}
			System.out.println(c);
			request.setAttribute("customer",c);
			RequestDispatcher rd=request.getRequestDispatcher("edit.jsp");
			rd.forward(request, response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
