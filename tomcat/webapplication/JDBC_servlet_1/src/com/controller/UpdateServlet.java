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
@WebServlet("/up")
public class UpdateServlet extends HttpServlet{

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Customer> clist=new ArrayList<Customer>();
		 int id=Integer.parseInt(request.getParameter("id"));
			
	     String name=request.getParameter("name");
	     String address=request.getParameter("address");
	     String uname=request.getParameter("uname");
	     String pass=request.getParameter("pass");
	     
	     Connection con=JdbcConnection.getConnection();
	     String sql="update customer set name=?,address=?,uname=?,pass=? where id=?";
	     
	     try {
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, name);
			ps.setString(2, address);
			ps.setString(3, uname);
			ps.setString(4, pass);
			ps.setInt(5, id);
			ps.executeUpdate();
			
			
			String sql1="select * from customer";
			
			PreparedStatement ps1=con.prepareStatement(sql1);
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
}

