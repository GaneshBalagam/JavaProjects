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
	<h2>See Fibanacci Series</h2>
	<br><form action="#">
		<table>
			<tr>
				<td>Enter Your Desired Number</td>
				<td><input type="text" name="fibonacci" required="required" pattern="^[1-9][0-9]{0,7}$"></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit"
					value="Show Series"></td>
		</table>
		</form>
		<%
		if(request.getParameter("fibonacci")!=null)
					{
		int N = Integer.parseInt(request.getParameter("fibonacci"));
		int present = 1, previous = 0;
		out.print("Series is...<br>"+previous +"&nbsp&nbsp&nbsp&nbsp"+present);
		for(int i=1; i <= N - 2 ; i++)
		{
			out.print( "&nbsp&nbsp&nbsp&nbsp"+(previous+present));
			present = present + previous;
			previous = present - previous;
						
		}
			
		}
		%>
	</center>

</body>
</html>