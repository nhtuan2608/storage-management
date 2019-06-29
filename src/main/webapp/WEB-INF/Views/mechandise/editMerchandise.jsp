<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@page import = "java.util.logging.Logger" %>
  <% Logger logger = Logger.getLogger(this.getClass().getName());%>
<c:url value="/showMerchandise" var="urlShowMerchandise" />  
<div style="margin-left: 20px">

  <a href="${urlShowMerchandise}"> <span class="fas fa-angle-double-left"> <u> List Merchandise </u> </span> </a>
  <br />
<!--   <h2 style="margin-left: 20px;">Edit Merchandise</h2> -->
  <c:url value="/saveMerchandise" var="updateMerchandise" />
  <div class="panel-body">
  <form:form name="editForm" action="${updateMerchandise}" method="POST" modelAttribute="merchandise" id="formDemo">
			<div class="container">
				  <div class="row">
				    <div class="col-sm">
				    	<div><h2>Edit Merchandise</h2><hr style="border: 1px solid red;"></div>				    	
				    	<div class="row">
				    		<div class="col">
				    			<label>Merchandise's ID:</label>
				    		</div>
				    		<div class="col-6">
				    			<input name="id" id="id" style="font-size: 15px; width: 100%;" value="${merchandise.id}" readonly="readonly"/>
				    		</div>
				    	</div>
				    	<div class="row">
				    		<div class="col">
				    			<label>Merchandise's Name:</label>
				    		</div>
				    		<div class="col-6">
				    			<input type="text" name="userName" style="font-size: 15px; width: 100%;" value="${merchandise.name}"/>
				    		</div>
				    	</div>
				    	<div class="row">
				    		<div class="col">
				    			<label>Supplier:</label>
				    		</div>
				    		<div class="col-6">
				    			<%-- <input type="text" name="supplier_id" style="font-size: 15px; width: 100%;" value="${merchandise.supplier_id}"/> --%>
				    			<form:select id="dropBox" path="supplier_id">
									<form:option id="optionNone" value="${merchandise.supplier_id}" label="--- Select ---" />
									<form:options items="${supplierList}" />
								</form:select>
				    		</div>
				    	</div>
				    	<div class="row">
				    		<div class="col">
				    			<label>Type of merchandise:</label>
				    		</div>
				    		<div class="col-6">
				    			<%-- <input type="text" name="merchandise_type_id" style="font-size: 15px; width: 100%;" value="${merchandise.merchandise_type_id}"/> --%>
				    			<form:select id="dropBox" path="merchandise_type_id">
									<form:option id="optionNone" value="${merchandise.merchandise_type_id}" label="--- Select ---" />
									<form:options items="${typeList}" />
								</form:select>
				    		</div>
				    	</div>
				    	<div class="row">
				    		<div class="col">
				    			<label>Amount:</label>
				    		</div>
				    		<div class="col-6">
				    			<input type="text" name="amount" style="font-size: 15px; width: 100%;" value="${merchandise.amount}"/>
				    		</div>
				    	</div>
				    	<div class="row">
				    		<div class="col">
				    			<label>Unit:</label>
				    		</div>
				    		<div class="col-6">
				    			<input type="text" name="unit" style="font-size: 15px; width: 100%;" value="${merchandise.unit}"/>
				    		</div>
				    	</div>
				    	<div class="row">
				    		<div class="col">
				    		</div>
				    		<div class="col-6">
				    			<input type="submit" class="btn btn-primary" value="Update" name="btnSubmit"/>
				    		</div>
				    	</div>
				    	
				    </div>
				    <div class="col-sm">
				  </div>
				 </div>
  </form:form>
</div>
 <% String message = "TypeList = " + pageContext.findAttribute("typeList") +"Queuing to Update Merchandises = "
        + pageContext.findAttribute("merchandise");
        logger.info(message); 
%>
</div>