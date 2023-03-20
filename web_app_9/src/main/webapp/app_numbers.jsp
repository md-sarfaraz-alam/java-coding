<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add</title>
</head>
<body>
  <h2>Enter the numbers</h2>
  
  <form action="addcontroller" method="post">
   Number1<input type="text" name="number1"/>
   Number2<input type="text" name="number2"/>
   <input type="submit" value="add"/>
   </form>
   
   <%
   if(request.getAttribute("result")!=null)
      out.println(request.getAttribute("result"));
   %>
   
</body>
</html>