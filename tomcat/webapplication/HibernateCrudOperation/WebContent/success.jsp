<%@page import="java.util.List"%>
<%@page import="com.model.Student"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
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

<%List<Student> l=(List)request.getAttribute("data"); %>
<body style="background-color: black">
<form name="myform">
 <h2 style="text-align: center; color: Yellow"><i>Student All Info</i></h2>
 <div style="text-align: center; margin-left: 120px">
<table border="5" style="color: buttonhighlight;">
  <thead>
    <tr style="color: red">
     <th>SELECT</th>
       <th>ID</th>
        <th>NAME</th>
         <th>ADDRESS</th>
          <th>SALARY</th>
           <th>GENDER</th>
            <th>USERNAME</th>
            <th>PASSWORD</th>
             <th>EDIT</th>
              <th>DELETE</th>
              <th>PRINT</th>
    </tr>
  </thead>
  <tbody>
     <tr>
  <% for(Student s:l){ %>
     <td><input type="radio" name="id" value="<%=s.getSid()%>"></td>
     <td><%=s.getSid() %></td>
      <td><%=s.getSname() %></td>
       <td><%=s.getSaddress() %></td>
        <td><%=s.getSalary() %></td>
         <td><%=s.getGender() %></td>
          <td><%=s.getSuname() %></td>
           <td><%=s.getSpass() %></td>
       <td><input type="button" onclick="editData()" value="Edit"></td>   
      <td><input type="button" onclick="deleteData()"  value="Delete"></td>   
        <td><input type="button" onclick="printData()"  value="Print"></td>  
      </tr>
  <% } %>
  </tbody>

</table>
</div>
</form>
</body>
</html>