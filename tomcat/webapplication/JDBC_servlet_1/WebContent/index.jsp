<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<hr>
<%String s=(String)request.getAttribute("m");%>
<%if(s!=null){%>
<%=request.getAttribute("m") %>
<%} %>
<hr>
<form action="log">

  Username : - <input type="text" name="uname"><br><br>
  Password : - <input type="pass" name="pass"><br><br>
  <input type="submit" value="Login">
  <a href="register.jsp">New User</a>
</form>
</body>
</html>