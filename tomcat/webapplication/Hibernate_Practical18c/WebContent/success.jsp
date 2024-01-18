<%@page import="com.Student"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>successpage</title>
</head>
<body bgcolor="cyan">
success page
<% Student stu=(Student)request.getAttribute("msg"); %><br><br>
id: <%= stu.getId() %>
Name: <%= stu.getUname() %><br><br>
Address: <%= stu.getAddress() %><br><br>
Gender: <%= stu.getGender() %><br><br>
Username: <%= stu.getUname() %><br><br>
Password: <%= stu.getPassword() %>
</body>
</html>