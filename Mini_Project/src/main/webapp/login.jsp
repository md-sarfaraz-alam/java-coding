<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
    <h2>Login here.....</h2>
    <form action="loginController" method="post">
            Username<input type="email" name="email"/>
            Password<input type="password" name="paasword"/>
            <input type="submit" value="login"/>  
    </form>
    <br>
    
    <%
    if(request.getAttribute("error")!=null){
    	out.println(request.getAttribute("error"));
    }
    %>
  
</body>
</html>