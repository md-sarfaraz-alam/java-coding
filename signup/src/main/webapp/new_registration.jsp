<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>registration</title>
</head>
<div align="center">
	<body>
		<h1>Sign Up</h1>
		<form action="registrationServlet" method="post">
			<table>
				<tr>
					<th>Name</th>
					<td><input type="text" name="name"></td>
				</tr>
				<tr>
					<th>Password</th>
					<td><input type="password" name="password"></td>
				</tr>
				<tr>
					<th>Email</th>
					<td><input type="email" name="email"></td>
				</tr>
				<tr>
					<th>Mobile</th>
					<td><input type="text" name="mobile"></td>
				</tr>

				<td><input type="submit" value="register"></td>

			</table>
		</form>
		<a href="login.jsp">Already have an account</a>
</div>


</body>
</html>