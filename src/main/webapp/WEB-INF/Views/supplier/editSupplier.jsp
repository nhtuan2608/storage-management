<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page import="java.util.logging.Logger"%>
<c:url value="/showSupplier" var="urlShowSupplier" />
<%
	Logger logger = Logger.getLogger(this.getClass().getName());
%>
<c:url value="/saveSupplier" var="updateSupplier" />
<div style="margin-left: 0px">
	<a href="${urlShowSupplier}"> <span
		class="fas fa-angle-double-left"> <u> List Supplier </u>
	</span>
	</a>
	 <%-- <h2 style="text-shadow: 0 0 0.2em #87F, 0 0 0.2em #87F,0 0 0.2em #82F;margin-left: 20px;">Edit Supplier ${supplier.name}</h2> --%>

	<form autocomplete="on" name="supplierForm" action="${updateSupplier}"
		method="POST" modelAttribute="supplier,address" id="formDemo">
				<div class="container">
				  <div class="row">
				    <div class="col-sm">
				    	<div><h3>Supplier</h3><hr style="border: 1px solid red;"></div>
				    	
				    	<div class="row">
				    		<div class="col-sm">
				    			<div><label>Supplier's ID:</label></div>
				    		</div>
				    		<div class="col-sm">
				    			<div>
				    				<input id="id" name="id" style="font-size: 15px; width: 100%" type="text" value="${supplier.id}" readonly="true" />
								</div>
				    		</div>
				    	</div>
				    	<div class="row">
				    		<div class="col-sm">
				    			<div><label>Supplier's Name:</label></div>
				    		</div>
				    		<div class="col-sm">
				    			<div>
									<input id="name" type="text" name="name" style="font-size: 15px; width: 100%" autofocus="true" placeholder="Supplier's name" value="${supplier.name}"/>
								</div>
				    			
				    		</div>
				    	</div>
				    	<div class="row">
				    		<div class="col-sm">
				    			<div><label>Telephone:</label></div>
				    		</div>
				    		<div class="col-sm">
				    			<div>
									<input type="number" name="phoneNumber" placeholder="Phone number" style="font-size: 15px; width: 100%" id="phoneNumber" value="${supplier.phoneNumber}"/>
								</div>
				    			
				    		</div>
				    	</div>
				    	<div class="row">
				    		<div class="col-sm">
				    			<div><label>Email:</label></div>
				    		</div>
				    		<div class="col-sm">
				    			<div>
									<input type="email" name="email" placeholder="Email" style="font-size: 15px; width: 100%" id="email"  value="${supplier.email}"/>
								</div>
				    		</div>
				    	</div>		
				    </div>
				    <div class="col-sm">
				     	<div><h3>Address</h3><hr style="border: 1px solid red;"></div>
						<div class="row">
				    		<div class="col-sm">
				    			<div><label>Street:</label></div>
				    		</div>
				    		<div class="col-sm">
				    			<div>
				    				<input type="text" name="street" placeholder="Street" style="font-size: 15px; width: 100%" id="street" value="${address.street}"/>
								</div>
				    		</div>
				    	</div>
				    	<div class="row">
				    		<div class="col-sm">
				    			<div><label>Ward:</label></div>
				    		</div>
				    		<div class="col-sm">
				    			<div>
				    				<input type="text" name="ward" placeholder="Ward" style="font-size: 15px;width: 100%" id="ward" value="${address.ward}" />
								</div>
				    		</div>
				    	</div>
				    	<div class="row">
				    		<div class="col-sm">
				    			<div><label>District:</label></div>
				    		</div>
				    		<div class="col-sm">
				    			<div>
				    				<input type="text" name="dicstrict" placeholder="District" style="font-size: 15px;width: 100%" id="district" value="${address.district}" />
								</div>
				    		</div>
				    	</div>
				    	<div class="row">
				    		<div class="col-sm">
				    			<div><label>City:</label></div>
				    		</div>
				    		<div class="col-sm">
				    			<div>
				    				<input type="text" name="city" placeholder="City" style="font-size: 15px;width: 100%" id="city"  value="${address.city}"/>
								</div>
				    		</div>
				    	</div>
				    	<div class="row">
				    		<div class="col-sm">
				    			<div><label>Country:</label></div>
				    		</div>
				    		<div class="col-sm">
				    			<div>
				    				<input type="text" name="country" placeholder="Country" style="font-size: 15px;width: 100%" id="country" value="${address.country}"/>
								</div>
				    		</div>
				    	</div>
				    	<div class="row">
				    		<div class="col-sm">
				    			<div><label>Postal Code:</label></div>
				    		</div>
				    		<div class="col-sm">
				    			<div>
				    				<input type="number" name="postalCode" placeholder="Postal Code" style="font-size: 15px;width: 100%" id="postalCode" value="${address.postalCode}"/>
								</div>
				    		</div>
				    	</div>
				    </div>
				  </div>
				  <div class="row">
				  		<div class="col-sm"></div>
				  		<div class="col-sm"><input type="submit" class="btn btn-primary" value="Update Supplier" name="btnSubmit"/></div>
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