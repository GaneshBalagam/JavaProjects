<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home Page</title>
<link rel="stylesheet" href="../CommonPages/CSS/Styles.css">
</head>
<body>
	<center>
		<h2>Welcome To Sample Operations Site</h2>
		<br>
		<br> <a href="Registration.jsp">Resiter Here</a> 
		<br><h2>Login Here</h2>	
		<form action="../../UserLogin">
			<table height="150">
				<tr>
					<td>User Name:</td>
					<td><input type="text" name="UserName" required="required" pattern="^[a-zA-Z0-9]{6,10}$"></td>
				</tr>
				<tr>
					<td>Password</td>
					<td><input type="password" name="Password" required="required"></td>
				</tr>
				<tr>
					<td colspan="2" align="center"><input type="submit" value="Login Here"></td>
				</tr>

			</table>
		</form>
		<%
		if(request.getParameter("error")!= null)
		{%>
		<h4>Sorry! you are not an authorised user</h4>
		<%}
		%>
	</center>
</body>
</html>