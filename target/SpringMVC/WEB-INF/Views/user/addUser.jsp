<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
 <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:url value="/showUser" var="urlShowUser" />  
<div style="margin-left: 20px">
	<a href="${urlShowUser}"> <span class="fas fa-angle-double-left"> <u> List User </u> </span> </a>
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
			<td colspan="2" align="center">
			<input type="submit" value="Create User" name="btnSubmit"/></td>
		</tr>
	</table>
	</form>

</div>
