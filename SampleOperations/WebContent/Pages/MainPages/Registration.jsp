<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User Registration Form</title>
<link rel="stylesheet" href="../CommonPages/CSS/Styles.css">
</head>
<body>
		<a href="Home.jsp"><<<<< Go To Home Page<<<<</a><center>
		<h2>User Registration Form</h2><br>
		<form action="../../RegistrationForm" method="get">
	<table><tr><td>User Id:</td><td><input type="text" name ="userId" required="required" pattern="^[1-9][0-9]{2,10}$"></td>
	</tr><tr><td>First Name:</td><td><input type="text" name ="firstName" required="required" pattern="^[a-zA-Z0-9]{6,10}$"></td>
	</tr>
	<tr><td>Last Name:</td><td><input type="text" name = "lastName" required="required" pattern="^[a-zA-Z0-9]{6,10}$"></td></tr>
	<tr><td>Date Of Birth:</td><td><input type="Date" required ="required" name = "dateOfBirth"></td></tr>
	<tr><td colspan="2" align = "center"><input type="submit" value="Register"></td></tr></table>
			</form>
			<%if(request.getParameter("status")!=null){ %>
			Registered Person: <h4><%= request.getParameter("status") %></h4>		
			<%
			}
			%>
		</center>
</body>
</html>