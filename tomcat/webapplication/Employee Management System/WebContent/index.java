<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Login page</title>
<link rel="stylesheet" href="style.css">
</head>
<body background="https://images6.alphacoders.com/511/511317.jpg" style="height: 100; width: 100; background-size: cover">
	    <div class="loginBox">
		<h2>EmployeeSection</h2>
		
		<form action="LoginCheck.jsp" method="post">
		
			 <p>Username</p>
			 <input type="text" name="usname" placeholder="Enter Usname" required="required">
			 <p>Password</p>
			 <input type="Password" name="passw" placeholder="************" required="required"> 
			 <input type="submit" value="Sign In">
			 <a href="register.jsp">New User</a>

		</form>
	  </div>
</body>
</html>