<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript">
function hide1()
{
	document.getElementById("Single").style.display = "none";
	document.getElementById("Multiple").style.display = "block";
}
function hide2()
{
	document.getElementById("Single").style.display = "block";
	document.getElementById("Multiple").style.display = "none";
}
</script>
</head>
<body>
	<center>
		<h2>See The Desired Table</h2>
		<br>
		<button  onclick = "hide2()" name="singleTable">Show Single Table</button> <button  onclick="hide1()"  name="multipleTables">Show Multiple Tables</button>
		<div id="Single">
		<form action="ShowTables.jsp">		
			<table>
				<tr>
					<td>Enter Table Number:</td>
					<td><input type="text" name="number" required="required" pattern="^[1-9][0-9]{0,9}$"></td>
					<td>From 1 To</td><td><input type="text" name="to"  required="required" pattern="^[1-9][0-9]{0,2}$" value="10"></td>
				</tr>
				<tr>
					<td colspan="4" align="center"><input type="submit" value="Show Table"></td>
				</tr>
			</table>
		</form>
		</div>
		<div id="Multiple" style="display:none">
		<form action="ShowTables.jsp">		
			<table>
				<tr>
					<td>Enter First Table:</td>
					<td><input type="text" name="firstNumber" required="required" pattern="^[1-9][0-9]{0,9}$"></td>
					<td>Enter Second Table:</td>
					<td><input type="text" name="lastNumber" required="required" pattern="^[1-9][0-9]{0,9}$"></td>
					<td>From 1 To</td><td><input type="text" name="to"  required="required" pattern="^[1-9][0-9]{0,2}$" value="10"></td>
				</tr>
				<tr>
					<td colspan="5" align="center"><input type="submit" value="Show Table"></td>
				</tr>
			</table>
		</form>
		</div>
		<%
		if (request.getParameter("number") != null) {
			int to = Integer.parseInt(request.getParameter("to"));
			int num = Integer.parseInt(request.getParameter("number"));
			for (int i = 1; i <= to; i++) {
				out.print("<font color='purple' size='5'>"+ num + " X " + i + " = " + num * i + "</font><br>");
			}
		}
		if (request.getParameter("firstNumber") != null) {
			int to = Integer.parseInt(request.getParameter("to"));
			int firstNumber = Integer.parseInt(request.getParameter("firstNumber"));
			int lastNumber = Integer.parseInt(request.getParameter("lastNumber"));
			for(;firstNumber<= lastNumber;firstNumber++)
				{
				out.print("<br><br><h3>This is "+firstNumber+"<sup>th</sup> Table</h3><br>");
				for (int i = 1; i <= to; i++) {
				
				out.print("<font color='purple' size='5'>"+firstNumber+ " X " + i + " = " + firstNumber * i + "</font><br>");
				}
				
			}
		}
		%>
	</center>
</body>
</html>