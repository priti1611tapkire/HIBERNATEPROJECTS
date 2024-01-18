
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="w"%>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Hello</h1>
<jsp:useBean id="data" class="com.Student" scope="request"/>
<!--Student id:-<jsp:getProperty property="id" name="data"/><br>  -->
 <!--Student Name: <jsp:getProperty property="name"  name="data"/><br> -->
 <!-- Student Address: <jsp:getProperty property="address"  name="data"/><br> -->
 
 Student id  : - ${data.id}" <br>
Student Name : - ${data.name} <br>
Student Address  : - ${data.address} <br> 

<hr>
<%-- <h1>One Way</h1>
<w:forEach items="${list}" var="stu">
Student id:- ${stu.id}<br>
Student Name:- ${stu.name}<br>
Student Address:-${stu.address}<br>
</w:forEach> --%>

<h1>Second Way</h1>
<w:forEach items="${list}" var="stu">
Student id: -<w:out value="${stu.id}"></w:out><br>
Student Name: -<w:out value="${stu.name}"></w:out><br>
Student Address:-<w.out value="${stu.address}"></w.out><br>
</w:forEach>

</body>
</html>
