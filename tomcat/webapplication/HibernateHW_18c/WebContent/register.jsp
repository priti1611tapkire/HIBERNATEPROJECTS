<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Reg page</title>
</head>
<body bgcolor="peach">
<form action="reg" method="post">
Student Id:<input type="number" name="id1"><br><br>
Student Name: <input type="text" name="t4"><br><br>
Student Address: <input type="text" name="t5"><br><br>
Student Gender: <input type="radio" id="male" name="gender" value="male">
         <label for="male">Male</label><br><br>
         <input type="radio" id="female" name="gender" value="female">
         <label for="female">female</label><br><br>
         <input type="radio" id="Transgenderr" name="gender" value="Transgender">
		 <label for="Transgender">Transgender</label><br><br>
Username: <input type="text" name="t6"><br><br>
Password: <input type="pass" name="t7"><br><br>
<input type="submit" value="register">
</form>


</body>
</html>