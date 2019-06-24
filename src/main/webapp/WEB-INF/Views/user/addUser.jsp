<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:url value="/showUser" var="urlShowUser" />

<div id="email-error-dialog"></div>
<div style="margin-left: 20px">
	<a href="${urlShowUser}"> <span class="fas fa-angle-double-left"> <u> List User </u> </span> </a>
	<h2>Create new User</h2>
	<form autocomplete="off" name="userForm" action="saveUser"
		method="POST" modelAttribute="user" id="formDemo" >
		<div></div>
		<table>

			<tr>
				<td>User ID:</td>
				<td><input name="id" style="font-size: 15px;" type="text" /></td>
				<td id="label"></td>
			</tr>
			<tr>
				<td>User Name:</td>
				<td><input type="text" name="userName" style="font-size: 15px;"   /></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><input type="text" name="password" /></td>
			</tr>
			<tr>
				<td>User's role:</td>
				<td><input type="text" name="role" /></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit"
					value="Create User" name="btnSubmit" /></td>
			</tr>
		</table>
	</form>
	<c:if test="${not empty userExisted}">
		<%-- <c:out value="${userExisted}"></c:out> --%>
		<script type="text/javascript">
			document.getElementById("label").innerHTML = "Error";
			document.getElementById("label").style.color = "red";
		/*  $(document).ready(function() {
			 
		        //Khi bàn phím được nhấn và thả ra thì sẽ chạy phương thức này
		        $("#formDemo").validate({
		            rules: {
		                id: "required"
		            },
		            messages: {
		            	id: "User đã bị trùng"
		            }
		        });
		    }); */
		</script>
	</c:if>
</div>
