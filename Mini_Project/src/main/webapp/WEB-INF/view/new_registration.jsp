<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>registration</title>
</head>
<body>
	<h2>create new registration</h2>
	<form action="saveReg" method="post">
		<pre>
			Name<input type="text" name="name">
			city<input type="text" name="city">
			Email<input type="text" name="email">
			mobile<input type="text" name="mobile">
			<input type="submit" value="save">
		</pre>
	</form>
	<br>
	<%
	 if(request.getAttribute("msg")!=null){
	    	out.println(request.getAttribute("msg"));
	    }
	%>

</body>
</html>