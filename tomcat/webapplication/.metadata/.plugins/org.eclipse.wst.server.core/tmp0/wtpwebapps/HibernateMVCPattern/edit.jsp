<%@page import="com.model.Client"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>

<%Client c=(Client)request.getAttribute("client"); %>
<body>
<form action="up">
  ID :- <input type="text" name="cid" value="<%=c.getCid()%>"><br><br> 
  NAME : - <input type="text" name="cname" value="<%=c.getCname()%>"><br><br>
  ADDRESS : - <input type="text" name="caddress" value="<%=c.getCaddress()%>"><br><br>
  SALARY : - <input type="text" name="csalary" value="<%=c.getCsalary()%>"><br><br>
  USERNAME : - <input type="text" name="cuname" value="<%=c.getCuname()%>"><br><br>
  PASSWORD : - <input type="text" name="cpass" value="<%=c.getCpass()%>"><br><br>
  <input type="submit" value="update">

</form>
</body>
</html>