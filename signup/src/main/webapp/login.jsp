<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login please</title>
</head>
<body>
	<div align=center>
		<h1>User Login</h1>
		<form action="loginServlet" method="post">
			<table>
				<tr>
					<td>Email</td>
					<td><input type="email" name="email" />
				</tr>
				<tr>
					<td>Password</td>
					<td><input type="password" name="password" />
				</tr>
				
				<td><input type="submit" value="login"></td><br>
				
			</table>
		</form>
		<div>
			<a href="new_registration.jsp">Create
					an account</a></div>
	</div>

</body>
</html>