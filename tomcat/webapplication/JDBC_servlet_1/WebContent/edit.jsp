<%@page import="com.model.Customer"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%Customer cust=(Customer)request.getAttribute("customer"); %>
<form action="up">

   <input type="hidden" name="id" value="<%=cust.getId()%>"><br><br>
   Name : - <input type="text" name="name" value="<%=cust.getName()%>"><br><br>
   Address : - <input type="text" name="address" value="<%=cust.getAddress()%>"><br><br>
   Username : - <input type="text" name="uname" value="<%=cust.getUname()%>"><br><br>
   Password : - <input type="text" name="pass" value="<%=cust.getPass()%>"><br><br>
 <input type="submit" value="Update">
</form>

</body>
</html>