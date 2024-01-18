
<%@page import="com.Student"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body><form action="">
<% Student student=(Student)request.getAttribute("msg"); %>

name:<%=student.getName() %><br>
Rollno:<%=student.getRollno() %><br>
Address:<%=student.getAddress() %><br>
</form>

</body>
</html>