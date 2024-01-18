<%@page import="com.User"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<script type="text/javascript">
function editData() {
	alert("EDIT OK");
	document.actions.action="edit";
	document.actions.submit();
}
function deleteData() {
	alert("DELETE OK");
	document.actions.action="delete";
	document.actions.submit();
}

function printData() {
	window.print();
}
</script>
<% List<User> l1=(List)request.getAttribute("data");%>
<body>
<form name="actions">
	<div>
		<table border="5">
			<thead>
				<tr style=""red">
				 <th>SELECT</th>
					<th>ID</th>
					<th>NAME</th>
					<th>ADDRESS</th>
					<th>USERNAME</th>
					<th>PASSWORD</th>
					<th>EDIT</th>
					<th>DELETE</th>
					<th>PRINT</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<% for (User u : l1) { %>
					 <td><input type="radio" name="uid" value="<%=u.getId()%>"></td>
					<td><%=u.getId()%></td>
					<td><%=u.getName()%></td>
					<td><%=u.getAddr()%></td>
					<td><%=u.getUname()%></td>
					<td><%=u.getPass()%></td>
					<td><input type="button" onclick="editData()" value="Edit"></td>   
      				<td><input type="button" onclick="deleteData()"  value="Delete"></td>   
     			   <td><input type="button" onclick="printData()"  value="Print"></td> 
				    </tr>
				   <% }%>
			</tbody>
			<a href="register.jsp">Add New Employee</a>
		</table>
	</div>
	</form>
</body>
</html>