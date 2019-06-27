<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page import="java.util.logging.Logger"%>
<c:url value="/showSupplier" var="urlShowSupplier" />
<%
	Logger logger = Logger.getLogger(this.getClass().getName());
%>
<div style="margin-left: 20px">
	<a href="${urlShowSupplier}"> <span
		class="fas fa-angle-double-left"> <u> List Supplier </u>
	</span>
	</a>
	<div>
	<h2 style="text-shadow: 0 0 0.2em #87F, 0 0 0.2em #87F,0 0 0.2em #82F;">Supplier ${supplier.name}</h2>

	<form modelAttribute="supplier,address" id="formDemo">
		<div class="container"
			style="text-indent: 0px; letter-spacing: 1px; line-height: 200%;">
			<!-- 			<div class="row">
				<div class="col-sm" > -->
			<table>
				<tr>
					<td><h3>
							<strong>Supplier</strong>
						</h3></td>
					<td><hr style="border: 1px solid red;"></td>


					<tr><tr><td>Supplier
				's ID:</td>
					<td id="strongDetailSupplier"><strong>${supplier.id}</strong></td>
				</tr>
				
				<tr>
							<td>Supplier's name:</td>
							<td id="strongDetailSupplier"><strong>${supplier.name}</strong></td>
						</tr>
						<tr>
							<td>Phone number:</td>
							<td id="strongDetailSupplier"><strong>${supplier.phoneNumber}</strong></td>
						</tr>
						<tr>
							<td>Email:</td>
							<td id="strongDetailSupplier"><strong>${supplier.email}</strong></td>
						</tr>
						<tr>
					<td><br /></td>
				</tr>
						<tr>
					<td><br /></td>
				</tr>
						
					</table>
					<table>
						<tr>
							<td><h3>
							<strong></>Address</strong>
						</h3></td>
							<td><hr style="border: 1px solid red;"></td>
						</tr>
						<tr>
							<td>Street:</td>
							<td id="strongDetailSupplier"><strong>${address.street}</strong></td>
						</tr>
						<tr>
							<td>Ward:</td>
							<td id="strongDetailSupplier"><strong>${address.ward}</strong></td>
						</tr>
						<tr>
							<td>District:</td>
							<td id="strongDetailSupplier"><strong>${address.district}</strong></td>
						</tr>
						<tr>
							<td>City:</td>
							<td id="strongDetailSupplier"><strong>${address.city}</strong></td>
						</tr>
						<tr>
							<td>Country:</td>
							<td id="strongDetailSupplier"><strong>${address.country}</strong></td>
						</tr>
						<tr>
							<td>Postal Code:</td>
							<td id="strongDetailSupplier"><strong>${address.postalCode}</strong></td>
						</tr>
					</table>
				 </div>
			</div>
</div>



		
	</form>
	<c:if test="${not empty userExisted}">
		<c:out value="${userExisted}"></c:out>
		<script type="text/javascript">
			document.getElementById("email-error-dialog").innerHTML = "Error";
			document.getElementById("email-error-dialog").style.color = "red";
		</script>
	</c:if>
</div>
<%
	String message = "Supplier = " + pageContext.findAttribute("supplier") + ", Address = "
			+ pageContext.findAttribute("address");
	logger.info(message);
%>