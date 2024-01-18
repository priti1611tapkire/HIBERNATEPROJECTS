<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration</title>
</head>
<style>
  label{
    color: blue;
    font-family: monospace;
    font-weight: bold;
    
  }
</style>
<body style="background:C:\Users\Admin\Desktop\webimages\pic3.jpeg; background-size: cover ">
<h1 style="color: blue; text-align: center;">Register Here</h1>
   Todays Date : <%=new Date().toLocaleString() %>
<hr>
<form action="reg">
<pre>
 <label> Id        : - </label> <input type="text" name="sid"><br><br>
  <label> Name     : - </label><input type="text" name="sname"><br><br>
  <label> Address  : - </label> <input type="text" name="saddress"><br><br>
 <label>  Salary   : - </label> <input type="text" name="salary"><br><br>
 <label>  Gender   : - </label><input type="radio" name="gender" value="male"><label>Male</label>
                   <input type="radio" name="gender" value="female"><label>FeMale</label>
  <label> Username(<span style="color: red">*</span>) : -</label> <input type="text" name="suname"><br><br>
  <label> Password(<span style="color: red">*</span>) : - </label><input type="password" name="spass"><br><br>
  <input type="submit" value="Register">
  </pre>
</form>`
</body>
</html>
