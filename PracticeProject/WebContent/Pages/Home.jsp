<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
	table{
		background:gray;
	}
	td{
		font-size:18px;
		color:purple;
	}	
	#authorized{
	color:green;
	}
	#unauthorized{
	color:red;
	}
	
	h2{
	color:Blue;
	}
	</style>
</head>
<body>
<form action="../ValidateLoginController" method="get">
	<center><br><br><br><br><h2>Login Here</h2><br><table>
		<tr><td>Enter User Name:</td><td><input type="text" name="UserName"></td></tr>
		<tr><td>Enter Password:</td><td><input type="password" name="Password"></td></tr>
		<tr><td colspan="2" align="center"><input type="submit" value="Login">
		</td></tr></table></form>
	<%
	if(request.getParameter("status") != null)
	{
		if(request.getParameter("status").equalsIgnoreCase("yes") == true)
		{
			 out.print("<h3 id='authorized'>You are an authorized user</h3>");
		}
		else
		{
			out.print("<h3 id='unauthorized'>You are an Unauthorized user</h3>");			
		}
}
	%>
	</center>
</body>
</html>