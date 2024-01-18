<%@page import="com.model.Student"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<%Student stu=(Student)request.getAttribute("s"); %>
<body background="C:\Users\Admin\Desktop\webimages\pic3.jpeg"; background-size="cover">
<form action="up">
<pre>
    <input type="hidden" name="sid" value="<%=stu.getSid()%>"><br><br>
  <label> Name     : - </label><input type="text" name="sname" value="<%=stu.getSname()%>"><br><br>
  <label> Address  : - </label> <input type="text" name="saddress" value="<%=stu.getSaddress()%>"><br><br>
 <label>  Salary   : - </label> <input type="text" name="salary" value="<%=stu.getSalary()%>"><br><br>
 
 <%if(stu.getGender().equalsIgnoreCase("Male")){ %>
 
 <label>  Gender   : - </label><input type="radio" name="gender" value="male" checked="checked"><label>Male</label>
                   <input type="radio" name="gender" value="female" ><label>Female</label>
  
  <%
 }else{
  %>
   <label>  Gender   : - </label><input type="radio" name="gender" value="male"><label>Male</label>
                   <input type="radio" name="gender" value="female" checked="checked"><label>Female</label>
  
  <%} %>
  <label> Username(<span style="color: red">*</span>) : -</label> <input type="text" name="suname" value="<%=stu.getSuname()%>"><br><br>
  <label> Password(<span style="color: red">*</span>) : - </label><input type="password" name="spass" value="<%=stu.getSpass()%>"><br><br>
  <input type="submit" value="Update">
  </pre>
</form>`
</body>
</html>