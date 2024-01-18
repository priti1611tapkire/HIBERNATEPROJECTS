<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>NewEmployeeReg</title>
</head>
<body background="C:\Users\Admin\Desktop\webimages\pic.jpg"; style="background-size: cover">
<h1>Welcome to Registration Page</h1>
<h2>New Employee Please Create Your Employee Account Here</h2>
<form action="regk" method="post">

<pre>
<h4>Enter Your Offer Letter ID         :     <input type="number" name="id"; placeholder="Enter OfferletterId" required="requred"></h4>
<h4>Enter Your Name                    :     <input type="text" name="name"; placeholder="Enter Your Name" required="requred"></h4>
<h4>Enter Your Address                 :     <input type="text" name="address"; placeholder="Enter Your Address" required="requred"></h4>
<h4>Enter Your Pan No                  :     <input type="text" name="panno"; placeholder="Enter Your panno" required="requred"></h4>
<h4>Enter Your Aadhar No               :     <input type="text" name="adharno"; placeholder="Enter Your AdharNo"required="requred"></h4>
<h4>Enter Your DOB                     :     <input type="date" id="start" name="trip-start" placeholder="dd-mm-yyyy" value="2018-07-22" min="1950-01-01" max="2030-12-31"></h4>                    
<h4>Enter Your Age                     :     <input type="number" name="eage"required="requred"></h4>		   
<h4>Enter Your E-Mail                  :     <input type="text" name="email"required="requred"></h4>			  
<h4>Enter Your Mobile No               :     <input type="text" name="emob"required="requred"></h4>
<h4>Enter Your Username                :     <input type="text" name="username" placeholder="Enter Your username"required="requred"></h4>	
<h4>Enter Your Paasword                :     <input type="pass" name="password" placeholder="*********" required="requred"></h4>	
<input type="submit" value="register">

</pre>
</form>
</body>
