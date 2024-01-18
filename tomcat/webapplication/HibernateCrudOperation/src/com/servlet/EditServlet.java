package com.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.dbconfig.HibernateUtil;
import com.model.Student;

@WebServlet("/edit")
public class EditServlet extends HttpServlet{


	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id=Integer.parseInt(request.getParameter("id"));

		SessionFactory sf=HibernateUtil.getSessionFactory();

		Session session=sf.openSession();

		Student stu=session.get(Student.class, id);

		request.setAttribute("s", stu);

		RequestDispatcher rd=request.getRequestDispatcher("edit.jsp");
		rd.forward(request, response);
	}

}

