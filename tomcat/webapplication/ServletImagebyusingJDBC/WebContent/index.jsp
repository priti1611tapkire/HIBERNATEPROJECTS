<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="log" enctype="multipart/form-data">

 NAME    : -  <input type="text" name="name"><br><br>
 ADDRESS : -  <input type="text" name="address"><br><br>
 File    : -  <input type="file" name="fname"><br><br>
 <input type="submit" value="Register">
 <a href="getfile">Get Files</a>
</form>

</body>
</html>