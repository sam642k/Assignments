<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="/Spring-MVC-Rest/transferSubmit" method="post">
		<table>
			<tr>
				<td><label for="fromacc">From :</label></td>
				<td><input type="text" name="fromacc" id="fromacc" placeholder="Enter Acc Id"></td>
			</tr>
			<tr>
				<td><label for="toacc">To :</label></td>
				<td><input type="text" name="toacc" id="toacc" placeholder="Enter Acc Id"></td>
			</tr>
			<tr>
				<td><label for="amount">Amount :</label></td>
				<td><input type="text" name="amount" id="amount" placeholder="Enter Amount"></td>
			</tr>
			<tr><td><input type="submit"></td></tr>
		</table>
	</form>
</body>
</html>