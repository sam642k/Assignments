<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="/Spring-MVC-Rest/balanceSubmit" method="post">
		<table>
			<tr>
				<td><label for="accid">Account: </label></td>
				<td><input type="text" name="accid" id="accid" placeholder="Enter Acc Id"></td>
			</tr>
			<tr><td><input type="submit"></td></tr>
		</table>
	</form>
</body>
</html>