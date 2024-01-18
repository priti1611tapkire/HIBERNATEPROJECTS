<%@page import="com.model.Student"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Success page</title>
</head>
<body>
<% List<Student> l=(List)request.getAttribute("data"); %>
<h2>All Student Details</h2>
<div style="text-align: center; margin-left: 120px">
<table border="5">
<thead>
<tr style="magenta">
<th>ID</th>
<th>NAME</th>
<th>ADDRESS</th>
<th>GENDER</th>
<th>USERNAME</th>
<th>PASSWORD</th>
</tr>
</thead>
<tbody>
<% for(Student stu:l){ %>
<tr>
<td><%=stu.getSid() %></td>
<td><%=stu.getSname() %></td>
<td><%=stu.getSaddress() %></td>
<td><%=stu.getGender() %></td>
<td><%=stu.getSuname() %></td>
<td><%=stu.getSpass() %></td>
</tr>
<%} %>
</tbody>
<a href="register.jsp">Add New Student</a>
</table>
</div>
</body>

</html>