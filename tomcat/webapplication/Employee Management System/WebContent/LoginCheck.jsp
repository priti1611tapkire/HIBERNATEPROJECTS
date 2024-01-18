<%@page import="com.utility.copy.HibernateUtil"%>
<%@page import="org.hibernate.SessionFactory"%>
<%@page import="java.util.*"%>
<%@page import="org.hibernate.query.Query"%>
<%@page import="org.hibernate.Session"%>
<%@page import="com.model.Employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>loginpg</title>
</head>
<body background="C:\Users\Admin\Desktop\webimages\pc.jpg" background-size="cover">
	<% 
String username1=request.getParameter("usname");
String password1=request.getParameter("passw");
 SessionFactory sf=HibernateUtil.getSessionFactory();
 
    Session ses1 = sf.openSession();
	Query<Employee> query1=ses1.createQuery("from Employee where username=:usname AND password=:passw");
	query1.setParameter("usname", username1);
	query1.setParameter("passw", password1);

	List<Employee> list1=query1.getResultList();
	

	if(username1.equals("admin") && password1.equals("admin"))
	{
		Session ses= sf.openSession();
		Query<Employee> query=ses.createQuery("from Employee");
		List<Employee> elist=query.getResultList();
		
		request.setAttribute("data", elist);
		RequestDispatcher rd=request.getRequestDispatcher("home.jsp");
		rd.forward(request, response);
		
	}
	else if(list1.isEmpty()){
		 response.sendRedirect("Error.html");
	}
	
	else	
	{
		request.setAttribute("data", list1);
		RequestDispatcher rd=request.getRequestDispatcher("home.jsp");
		rd.forward(request, response);
	}
%>
</body>
</html>