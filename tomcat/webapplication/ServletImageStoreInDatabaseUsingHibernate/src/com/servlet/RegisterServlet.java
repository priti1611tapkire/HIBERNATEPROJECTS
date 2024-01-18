package com.servlet;

import java.io.ByteArrayOutputStream;

import java.io.IOException;
import java.io.InputStream;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import com.service.ServiceI;
import com.service.ServiceImpl;
import com.model.Student;
@WebServlet("/reg")
@MultipartConfig
public class RegisterServlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		ServiceI s=new ServiceImpl();
		
		
		int id=Integer.parseInt(request.getParameter("id"));
		String name=request.getParameter("name");
		String uname=request.getParameter("uname");
		String pass=request.getParameter("pass");
		System.out.println(uname);
	    Part parts=request.getPart("filename");
	    InputStream in=parts.getInputStream();
        String fname=parts.getSubmittedFileName();
	    ByteArrayOutputStream bout=new ByteArrayOutputStream();
	    byte[] buffer=new byte[4096];
	    int byteread=-1;
	    while((byteread=in.read(buffer)) != -1) {
	    	bout.write(buffer, 0, byteread);
	    }
	    byte[] imageByte=bout.toByteArray();
	 
	   Student s1=new Student();
	   s1.setId(id);
	   s1.setName(name);
	   s1.setUname(uname);
	   s1.setPass(pass);
	   s1.setFilename(imageByte);
	   s1.setFname(fname);
	   System.out.println(s1);
	   
	   s.addStudentData(s1);
	   
	   RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
	   rd.forward(request, response);
	   
	}

}

