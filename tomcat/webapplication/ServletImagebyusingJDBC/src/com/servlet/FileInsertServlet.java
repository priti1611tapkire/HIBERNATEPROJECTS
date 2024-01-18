package com.servlet;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.User;
@WebServlet(urlPatterns="/log")
public class FileInsertServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String name=request.getParameter("name");
		String address=request.getParameter("address");
		String fname=request.getParameter("fname");
		
		File f=new File(fname);
		// Extra Method for cross check file is here...
				System.out.println(f.getName());
				System.out.println(f.length());
				
				
		FileInputStream fout=new FileInputStream(f);
		User u=new User();
		u.setName(name);
		u.setAddress(address);
		u.setFname(fout);
		u.setFtype(f.getName());
		
		try{
			Class.forName("com.mysql.jdbc.Driver");

			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcimagestore", "root", "root");
			
			String sql="insert into user values(?,?,?,?,?)";
			
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(1, u.getId());
			ps.setString(2, u.getName());
			ps.setString(3, u.getAddress());
			ps.setBlob(4, u.getFname());
			ps.setString(5, u.getFtype());
			
			ps.execute();
			System.out.println("successfully");
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
	}
}
