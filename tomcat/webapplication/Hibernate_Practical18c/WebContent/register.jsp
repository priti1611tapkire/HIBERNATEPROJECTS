<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register page</title>
</head>
<body bgcolor="magenta">
<h1 style="color: yellow; text-align: center" >Welcome to Register page</h1>
<form action="reg">

id      : <input type="text" name="t3"><br><br>

Name    : <input type="text" name="t4"><br><br>


Gender : <input type="radio" id="male" name="gender" value="male">
         <label for="male">Male</label><br><br>
         <input type="radio" id="female" name="gender" value="female">
         <label for="female">female</label><br><br>
         <input type="radio" id="Transgenderr" name="gender" value="Transgender">
		 <label for="Transgender">Transgender</label><br><br>

Address : <input type="text" name="t5"><br><br>

Username: <input type="text" name="t6"><br><br>

Password: <input type="password" name="t7"><br><br>



<input type="submit" button="register">
</form>

</body>
</html>