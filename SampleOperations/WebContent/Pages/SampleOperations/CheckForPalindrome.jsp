<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<center>
	<h2>Check Your Desired String For Palindrome</h2>
	<br><form action="#"> //by using"#" this response has been redirected to the current page  
		<table>
			<tr>
				<td>Enter Your Desired String</td>
				<td><input type="text" name="palindrome" required="required"></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit"
					value="Check String"></td>
		</table>
		</form>
		<%
		if(request.getParameter("palindrome")!=null)
					{
		char []arr = request.getParameter("palindrome").toCharArray();
		int i,j;
		for(i=0,j=arr.length - 1; i <= j ; i++ ,j--)
		{
			if(arr[i]!=arr[j])
			{
				break;
			}
		}
			if(i<j)
			{
				out.print("The given string <font color='Green' size='5'>"+request.getParameter("palindrome")+" </font>is not a Palindrome");
			}
			else
			{
				out.print("The given string <font color='Green' size='5'>"+request.getParameter("palindrome")+" </font>is a Palindrome");
			}
		}
		%>
	</center>
</body>
</html>