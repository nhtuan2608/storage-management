<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page import="java.util.logging.Logger"%>
<c:url value="/showSupplier" var="urlShowSupplier" />
<%
	Logger logger = Logger.getLogger(this.getClass().getName());
%>
<div style="margin-left: 20px">
	<a href="${urlShowSupplier}"> <span class="fas fa-angle-double-left">
			<u> List Supplier </u>
	</span>
	</a>
	<br/>

	<form autocomplete="on" name="userForm" action="saveSupplier"
		method="POST" modelAttribute="supplier,address" id="formAddSupplier">
		
		<div class="container">
			<div class="row">
				<div class="col-sm">
					<div><hr style="border: 1px solid red;"><h3>Supplier</h3></div>
					<div class="row">
						<div class="col">
							<label>Supplier's ID:</label>
						</div>
						<div class="col-6">
							<input id="id" name="id" style="font-size: 15px; width: 100%;"
								type="text" value="${supplier.id}" readonly="true" />
							<label for="id" style="font-size: 13px; color: red;"></label>
						</div>
					</div>
					<div class="row">
						<div class="col">
							<label>Supplier's name:</label>
						</div>
						<div class="col-6">
							<input id="name" type="text" name="name"
								style="font-size: 15px;width: 100%;" autofocus="true"
								placeholder="Supplier's name" />
							<label for="name" class="error" style="font-size: 13px; color: red;"></label>
						</div>
					</div>
					<div class="row">
						<div class="col">
							<label>Phone number:</label>
						</div>
						<div class="col-6">
							<input type="number" name="phoneNumber"
								placeholder="Phone number" style="font-size: 15px;width: 100%;"
								id="phoneNumber" />
							<label for="phoneNumber" class="error" style="font-size: 13px; color: red;"></label>
						</div>
					</div>
					<div class="row">
						<div class="col">
							<label>Email:</label>
						</div>
						<div class="col-6">
							<input type="email" name="email" placeholder="Email"
								style="font-size: 15px;width: 100%;" id="email" />
							<label for="email" class="error" style="font-size: 13px; color: red;"></label>
						</div>
					</div>
				</div>	
				<div class="col-sm">
					<div><hr style="border: 1px solid red;"><h3>Address</h3></div>
					<div class="row">
						<div class="col">
							<label>Street:</label>
						</div>
						<div class="col-6">
							<input type="text" name="street" placeholder="Street"
								style="font-size: 15px;width: 100%;" id="street" />
							<label for="street" style="font-size: 13px; color: red;"></label>
						</div>
					</div>
					<div class="row">
						<div class="col">
							<label>Ward:</label>
						</div>
						<div class="col-6">
							<input type="text" name="ward" placeholder="Ward"
								style="font-size: 15px;width: 100%;" id="ward" />
							<label for="ward" style="font-size: 13px; color: red;"></label>
						</div>
					</div>
					<div class="row">
						<div class="col">
							<label>District:</label>
						</div>
						<div class="col-6">
							<input type="text" name="dicstrict" placeholder="District"
								style="font-size: 15px;width: 100%;" id="district" />
							<label for="district" style="font-size: 13px; color: red;"></label>
						</div>
					</div>
					<div class="row">
						<div class="col">
							<label>City:</label>
						</div>
						<div class="col-6">
							<input type="text" name="city" placeholder="City"
								style="font-size: 15px;width: 100%;" id="city" />
							<label for="city" style="font-size: 13px; color: red;"></label>
						</div>
					</div>
					<div class="row">
						<div class="col">
							<label>Country:</label>
						</div>
						<div class="col-6">
							<input type="text" name="country" placeholder="Country"
								style="font-size: 15px;width: 100%;" id="country" />
							<label for="country" style="font-size: 13px; color: red;"></label>
						</div>
					</div>
					<div class="row">
						<div class="col">
							<label>Postal Code:</label>
						</div>
						<div class="col-6">
							<input type="number" id="postalCode" name="postalCode" placeholder="Postal Code"
								style="font-size: 15px;width: 100%;" />
							<label for="postalCode" style="font-size: 13px; color: red;"></label>
						</div>
					</div>
					<div class="row">
						<div class="col-sm"></div>
						<div class="col-sm"><input type="submit" value="Add Supplier" name="btnSubmit" /></div>
					</div>
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