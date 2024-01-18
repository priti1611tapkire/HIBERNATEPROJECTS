<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="secondpage">

   Data Of Index Page : - <%=request.getAttribute("t1") %>
   <input type="hidden" name="indexpagefield" value="<%=request.getAttribute("t1")%>">
   Second Page Data : - <input type="text" name="secondData"><br><br>
  <input type="submit" value="Ok">
</form>

</body>
</html>