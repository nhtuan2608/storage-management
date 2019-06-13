<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User Page</title>
</head>
<body>
<h2>Create new User</h2>
<form name="userForm" action="saveUser" method="POST" modelAttribute="user">
<table>
	<tr>
		<td>User #: </td>
		<td><input type="text" name="id"/></td>
	</tr>
	<tr>
		<td>User Name: </td>
		<td><input type="text" name="userName"/></td>
	</tr>
	<tr>
		<td>Password: </td>
		<td><input type="text" name="password"/></td>
	</tr>
	<tr>
		<td>User's role: </td>
		<td><input type="text" name="role"/></td>
	</tr>
	<tr>
		<td colspan="1" align="center">
		<input type="submit" value="Create User" name="btnSubmit"/></td>
	</tr>
</table>
</form>
</body>
</html>