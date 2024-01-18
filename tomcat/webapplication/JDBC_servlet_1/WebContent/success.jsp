<%@page import="com.model.Customer"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>data page</title>
</head>
<script type="text/javascript">

	function editData() {
		alert("Hi");
		document.mypage.action ="edit";
		document.mypage.submit();
	}

	function deleteData() {
		alert("Hi");
		document.mypage.action ="del";
		document.mypage.submit();
	}
</script>
<body>
	<%List<Customer> l=(List)request.getAttribute("data"); %>

<body>
<form name="mypage">
	<h2 style="text-align: center; color: blue"><i>Customer All Info</i></h2>
	<div style="text-align: center; margin-left: 120px">
		<table border="5">
			<thead>
				<tr style="color: brown">
					<th>SELECT</th>
					<th>ID</th>
					<th>NAME</th>
					<th>ADDRESS</th>
					<th>USERNAME</th>
					<th>PASSWORD</th>
					<th>EDIT</th>
					<th>DELETE</th>
				</tr>
			</thead>
			<tbody>

				<% for(Customer s:l){ %>
				<tr>
					<td><input type="radio" value="<%=s.getId() %>" name="rd"></td>
					<td><%=s.getId() %></td>
					<td><%=s.getName() %></td>
					<td><%=s.getAddress() %></td>
					<td><%=s.getUname() %></td>
					<td><%=s.getPass() %></td>
					<td><input type="button" onclick="editData()" value="EDIT"></td>
					<td><input type="button" onclick="deleteData()" value="Delete"></td>


				</tr>
				<% } %>
			</tbody>
			<a href="register.jsp">Add Customer</a>
		</table>
	</div>
</body>
</html>