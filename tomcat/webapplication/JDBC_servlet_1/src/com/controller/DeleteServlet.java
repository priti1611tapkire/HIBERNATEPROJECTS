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

@WebServlet("/del")
public class DeleteServlet extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<Customer> clist=new ArrayList<Customer>();
		int id=Integer.parseInt(request.getParameter("rd"));
		System.out.println("Id From Success page : "+ id);
		
		Connection con=JdbcConnection.getConnection();
		try {
			PreparedStatement ps=con.prepareStatement("delete from customer where id="+id);
			ps.execute();
			
			String sql="select * from customer";
	
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

}

