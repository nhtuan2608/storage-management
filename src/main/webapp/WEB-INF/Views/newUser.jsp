<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User Page</title>
<style>  
.error{color:red}  
</style>
</head>
<body>
<h2>Create new User</h2>
<form name="userForm" action="saveUser" method="POST" modelAttribute="user">
<table>
	<tr>
		<td>User #: </td>
		<td><input type="text" name="id"/></td>
		<td></td>
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

<%--  <form:form action="saveUser" method="POST" modelAttribute="user">
ID: <form:input path="id"/> <br><br>
<form:errors path="id" cssClass="error"/><br><br>   
Username: <form:input path="userName"/> <br><br>
<form:errors path="password" cssClass="error"/><br><br>  
Password(*): <form:password path="password"/>    
<form:errors path="password" cssClass="error"/><br><br>
Role: <form:input path="role"/> <br><br>
<input type="submit" value="submit">  
</form:form> --%>
</body>
</html>