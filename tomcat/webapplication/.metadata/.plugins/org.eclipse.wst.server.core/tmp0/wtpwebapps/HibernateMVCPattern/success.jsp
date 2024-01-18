<%@page import="com.model.Client"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Alldatapage</title>
</head>
<script type="text/javascript">
function editData() {
	alert("HI");
	document.myform.action="edit";
	document.myform.submit();
}
function deleteData() {
	alert("HI");
	document.myform.action="del";
	document.myform.submit();
}
function printData() {
	window.print();
}
</script>
<body>
<%List<Client> l=(List)request.getAttribute("data"); %>
<body>
<form name="myform">
<h2 style="text-align: center; color: Green;"><i>All Client Details</i></h2>
<div style="text-align: center; margin-left:120px"></div>
<table border="5"  style="color: buttonhighlight;">
<thead>
<tr style="color: blue">
<th>SELECT</th>
<th>ID</th>
<th>NAME</th>
<th>ADDRESS</th>
<th>SALARY</th>
<th>USERNAME</th>
<th>PASSWORD</th>
<th>EDIT</th>
<th>DELETE</th>
<th>PRINT</th>
</tr>
</thead>
<tbody>
<% for(Client c:l){ %>
<tr style="color: black">
<td><input type="radio" name="id" value="<%=c.getCid()%>"></td>
<td><%=c.getCid() %></td>
<td><%=c.getCname() %></td>
<td><%=c.getCaddress() %></td>
<td><%=c.getCsalary() %></td>
<td><%=c.getCuname() %></td>
<td><%=c.getCpass() %></td>
 <td><input type="button" onclick="editData()" value="Edit"></td>   
 <td><input type="button" onclick="deleteData()" value="Delete"></td>   
 <td><input type="button" onclick="printData()" value="Print"></td>  
</tr>
<%} %>

</tbody><br>
<a href="register.jsp">Add New Clients here</a>

</table>
</body>
</html>
