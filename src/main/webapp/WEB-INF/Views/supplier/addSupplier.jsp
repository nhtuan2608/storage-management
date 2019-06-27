<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page import="java.util.logging.Logger"%>
<c:url value="/showUser" var="urlShowUser" />
<%
	Logger logger = Logger.getLogger(this.getClass().getName());
%>
<div style="margin-left: 20px">
	<a href="${urlShowUser}"> <span class="fas fa-angle-double-left">
			<u> List Supplier </u>
	</span>
	</a>
	<h2>Create new User</h2>

	<form autocomplete="on" name="userForm" action="saveSupplier"
		method="POST" modelAttribute="supplier,address" id="formDemo">
		<%-- 		<div><c:out value="${user.id}"></c:out></div> --%>
		<div class="container">
			<div class="row">
				<div class="col-sm">
					<table>
						<tr>
							<td><h4>Supplier</h4></td>
							<td><hr></td>
						<tr>
						<tr>

							<td>Supplier's ID:</td>
							<td><input id="id" name="id" style="font-size: 15px;"
								type="text" value="${supplier.id}" readonly="true" /></td>
						</tr>
						<tr>
							<td>Supplier's name:</td>
							<td><input id="name" type="text" name="name"
								style="font-size: 15px;" autofocus="true"
								placeholder="Supplier's name" /></td>
						</tr>
						<tr>
							<td>Phone number:</td>
							<td><input type="number" name="phoneNumber"
								placeholder="Phone number" style="font-size: 15px;"
								id="phoneNumber" /></td>
						</tr>
						<tr>
							<td>Email:</td>
							<td><input type="email" name="email" placeholder="Email"
								style="font-size: 15px;" id="email" /></td>
						</tr>
						<tr><td><br/></td></tr>
						<tr><td><br/></td></tr>
						<!-- <tr>
				<td></td>
				<td colspan="1"><input type="submit" value="Create User" name="btnSubmit" /></td>
			</tr> -->
					</table>
					<input type="submit" value="Create User" name="btnSubmit"  />
				</div>
				<div class="col-sm">
					<table>
						<tr>
							<td><h4>Address</h4></td>
							<td><hr></td>
						</tr>
						<tr>
							<td>Street:</td>
							<td><input type="text" name="street" placeholder="Street"
								style="font-size: 15px;" id="street" /></td>
						</tr>
						<tr>
							<td>Ward:</td>
							<td><input type="text" name="ward" placeholder="Ward"
								style="font-size: 15px;" id="ward" /></td>
						</tr>
						<tr>
							<td>District:</td>
							<td><input type="text" name="dicstrict" placeholder="District"
								style="font-size: 15px;" id="district" /></td>
						</tr>
						<tr>
							<td>City:</td>
							<td><input type="text" name="city" placeholder="City"
								style="font-size: 15px;" id="city" /></td>
						</tr>
						<tr>
							<td>Country:</td>
							<td><input type="text" name="country" placeholder="Country"
								style="font-size: 15px;" id="country" /></td>
						</tr>
						<tr>
							<td>Postal Code:</td>
							<td><input type="number" name="postalCode" placeholder="Postal Code"
								style="font-size: 15px;" id="postalCode" /></td>
						</tr>
					</table>
				</div>
			</div>
		</div>



		
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
	String message = "Suppliers = " + pageContext.findAttribute("listSuppliers") + ", Address = "
			+ pageContext.findAttribute("address");
	logger.info(message);
%>