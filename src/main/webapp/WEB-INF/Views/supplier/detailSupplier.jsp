<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page import="java.util.logging.Logger"%>
<c:url value="/showSupplier" var="urlShowSupplier" />
<%
	Logger logger = Logger.getLogger(this.getClass().getName());
%>
<div class="container">
	<a href="${urlShowSupplier}"> <span
		class="fas fa-angle-double-left"> <u> List Supplier </u>
	</span>
	</a>
	<div>
	<%-- <h2 style="text-shadow: 0 0 0.2em #87F, 0 0 0.2em #87F,0 0 0.2em #82F;">Supplier ${supplier.name}</h2> --%>

	<form modelAttribute="supplier,address" id="formDemo">
		<div class="container">
				  <div class="row">
				    <div class="col-sm">
				    	<div><h3>Supplier</h3><hr style="border: 1px solid red;"></div>				    	
				    	<div class="row">
				    		<div class="col">
				    			<label>ID:</label>
				    		</div>
				    		<div class="col-6">
				    			<label ><strong>${supplier.id}</strong></label>
				    		</div>
				    	</div>
				    	<div class="row">
				    		<div class="col">
				    			<label>Name:</label>
				    		</div>
				    		<div class="col-6">
				    			<label ><strong>${supplier.name}</strong></label>
				    		</div>
				    	</div>
				    	<div class="row">
				    		<div class="col">
				    			<label>Phone:</label>
				    		</div>
				    		<div class="col-6">
				    			<label ><strong>${supplier.phoneNumber}</strong></label>
				    		</div>
				    	</div>
				    	<div class="row">
				    		<div class="col">
				    			<label>Email:</label>
				    		</div>
				    		<div class="col-6">
				    			<label ><strong>${supplier.email}</strong></label>
				    		</div>
				    	</div>
					</div>
					<div class="col-sm">
				    	<div><h3>Address</h3><hr style="border: 1px solid red;"></div>				    	
				    	<div class="row">
				    		<div class="col">
				    			<label>Street:</label>
				    		</div>
				    		<div class="col-6">
				    			<label ><strong>${address.street}</strong></label>
				    		</div>
				    	</div>
				    	<div class="row">
				    		<div class="col">
				    			<label>Ward:</label>
				    		</div>
				    		<div class="col-6">
				    			<label ><strong>${address.ward}</strong></label>
				    		</div>
				    	</div>
				    	<div class="row">
				    		<div class="col">
				    			<label>District:</label>
				    		</div>
				    		<div class="col-6">
				    			<label ><strong>${address.district}</strong></label>
				    		</div>
				    	</div>
				    	<div class="row">
				    		<div class="col">
				    			<label>City:</label>
				    		</div>
				    		<div class="col-6">
				    			<label ><strong>${address.city}</strong></label>
				    		</div>
				    	</div>
				    	<div class="row">
				    		<div class="col">
				    			<label>Country:</label>
				    		</div>
				    		<div class="col-6">
				    			<label ><strong>${address.country}</strong></label>
				    		</div>
				    	</div>
				    	<div class="row">
				    		<div class="col">
				    			<label>Postal Code:</label>
				    		</div>
				    		<div class="col-6">
				    			<label ><strong>${address.postalCode}</strong></label>
				    		</div>
				    	</div>
				    </div>
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