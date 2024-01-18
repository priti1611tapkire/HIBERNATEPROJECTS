<%@page import="com.model.Employee"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee section details display</title>
<link rel="stylesheet" href="style1.css">
</head>
<body background="C:\Users\Admin\Desktop\webimages\pc.jpg"; background-size="cover" >
<% List<Employee> l=(List)request.getAttribute("data"); %>
</body>
	<form action="/home"></form>
	<ul>
		<li><a href="logout.html">Logout</a></li>
		<li><a href=" #contact">Contact</a></li>
		<li><a href=" #about">About</a></li>
		<li><a href=" #home" class="active">Home</a></li>
	</ul>
	<div class="menubox">
		<h1>Welcome!!!</h1>
		<h1>You have been Successfully logged in</h1>

		<h2>All Employee Details</h2>

		<div style="text-align: center; margin-left: 120px">
			<table border="5">
				<thead>
					<tr style="color: black">
						<th>Employee ID</th>
						<th>Employee Name</th>
						<th>Employee Address</th>
						<th>Employee Pan No</th>
						<th>Employee Adhar No</th>
						<th>Employee DOB</th>
						<th>Employee Age</th>
						<th>Employee Email address</th>
						<th>Employee Mobile No</th>
						<th>Employee UserName</th>
						<th>Employee Password</th>
					</tr>
				</thead>
				<tbody>
					<% for(Employee e:l){ %>
					<tr>
						<td><%=e.getId()%></td>
						<td><%=e.getName()%></td>
						<td><%=e.getAddress()%></td>
						<td><%=e.getPanno()%></td>
						<td><%=e.getAdharno()%></td>
						<td><%=e.getEdob()%></td>
						<td><%=e.getEage()%></td>
						<td><%=e.getEmail()%></td>
						<td><%=e.getEmob()%></td>
						<td><%=e.getUsername()%></td>
						<td><%=e.getPassword() %></td>
					</tr>
					<%} %>
				</tbody>
			</table>
		</div>

</div>

</html>