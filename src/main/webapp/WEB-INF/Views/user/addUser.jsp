<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page import="java.util.logging.Logger"%>
<c:url value="/showUser" var="urlShowUser" />
<%
	Logger logger = Logger.getLogger(this.getClass().getName());
%>
<div style="margin-left: 20px">
	<a href="${urlShowUser}"> <span class="fas fa-angle-double-left"> <u> List User </u> </span> </a>
	<h2>Create new User</h2>
	<form autocomplete="off" name="userForm" action="saveUser"
		method="POST" modelAttribute="user" id="formDemo" >
<%-- 		<div><c:out value="${user.id}"></c:out></div> --%>
		<table>
			<tr>
			
				<td>User's ID:</td>
				<td><input id="id" name="id" style="font-size: 15px;" type="text" value="${user.id}" readonly="true" /></td>
			</tr>
			<tr>
				<td>User's name:</td>
				<td><input id="userName" type="text" name="userName" style="font-size: 15px;" autofocus="true" placeholder="Username"/></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><input autocomplete="on" type="password" name="password" placeholder="Password" style="font-size: 15px;" id="password"/></td>
			</tr>
			<tr>
				<td>User's role:</td>
				<td><select name="role" id="role" >
					<option id="optionNone" value="" label="--- Select ---"></option>
					<option value="User">User</option>
					<option value="Admin">Admin</option>
					<option value="SuperAdmin">Super Admin</option>
				</select></td>
			</tr>
			<tr>
				<td></td>
				<td colspan="1"><input type="submit" value="Create User" name="btnSubmit" /></td>
			</tr>
		</table>
	</form>
	<c:if test="${not empty userExisted}">
		<%-- <c:out value="${userExisted}"></c:out> --%>
		<script type="text/javascript">
			document.getElementById("email-error-dialog").innerHTML = "Error";
			document.getElementById("email-error-dialog").style.color = "red";
		</script>
	</c:if>
</div>
<%
	String message = "Users = " + pageContext.findAttribute("user");
	logger.info(message);
%>