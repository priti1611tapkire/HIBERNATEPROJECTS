<%@page import="java.util.List"%>
<%@page import="com.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<%	User u=(User)request.getAttribute("u1"); %>
<body>
<form action="/up">
<pre>
<input type="hidden" name="uid" value="<%=u.getId()%>"><br><br>
Name:-<input type="text" name="name" value="<%=u.getName() %>"><br><br>
Address:-<input type="text" name="addr" value="<%=u.getAddr() %>"><br><br>
Username:<input type="text" name="uname" value="<%=u.getUname() %>"><br><br>
Password:<input type="password" name="pass" value="<%=u.getPass() %>"><br><br>
<input type="submit" value="update">
</pre>
</form>

</body>
</html>