<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page import = "java.util.logging.Logger" %>
  <% Logger logger = Logger.getLogger(this.getClass().getName());%>
<c:url value="/showMerchandise" var="urlShowMerchandise" />

<div id="email-error-dialog"></div>
<div style="margin-left: 20px">
	<a href="${urlShowMerchandise}"> <span
		class="fas fa-angle-double-left"> <u> List Merchandise </u>
	</span>
	</a>
	<br/>
	<!-- <h2 style="margin-left: 20px;">Add Merchandise</h2> -->

	<div class="panel-body">
		<form:form action="saveMerchandise" method="post"
			modelAttribute="merchandise" id="formAddMerchandise">
			<div class="container">
				  <div class="row">
				    <div class="col-sm">
				    	<div><h2>Add Merchandise</h2><hr style="border: 1px solid red;"></div>				    	
				    	<div class="row">
				    		<div class="col">
				    			<label>ID:</label>
				    		</div>
				    		<div class="col-6">
				    			<input name="id" id="id" style="font-size: 15px; width: 100%;" value="${merchandise.id}" />
				    			<label for="id" style="font-size: 13px; color: red;"></label>
				    		</div>
				    		<!-- <div class="col"></div> -->
				    	</div>			    	
				    	<div class="row">
				    		<div class="col">
				    			<label>Name:</label>
				    		</div>
				    		<div class="col-6">
				    			<input type="text" name="name" id="name" style="font-size: 15px; width: 100%;" />
				    			<label for="name" class="error" style="font-size: 13px; color: red;"></label>
				    		</div>
				    		<!-- <div class="col"></div> -->
				    	</div>
				    	<div class="row">
				    		<div class="col">
				    			<label>Supplier:</label>
				    		</div>
				    		<div class="col-6">
									<form:select id="dropBox" path="supplier_id">
										<form:option id="optionNone" value="" label="--- Select ---" />
										<form:options items="${supplierList}" />
									</form:select>
									<label id="errorDropBox" style="font-size: 13px; color: red;"></label>
				    		</div>
				    		<!-- <div class="col"></div> -->
				    	</div>
				    	<div class="row">
				    		<div class="col">
				    			<label>Type:</label>
				    		</div>
				    		<div class="col-6">
					    			<form:select id="dropBox1" path="merchandise_type_id" >
										<form:option id="optionNone" value="" label="--- Select ---" />
										<form:options items="${typeList}" />
									</form:select>
									<label id="errorDropBox1" style="font-size: 13px; color: red;"></label>
				    		</div>
				    	</div>
				    	<div class="row">
				    		<div class="col">
				    		</div>
				    		<div class="col-6"><!--  onclick="return submitDropBox_addMerchandise() -->
				    			<input type="submit" class="btn btn-primary" name="submit" value="Submit" onclick="return submitDropBox()">
				    		</div>
				    		<!-- <div class="col">
				    		</div> -->
				    	</div>
				   	</div>
				   	<div class="col-sm"></div>
				  </div>
			</div>
		</form:form>
	</div>
</div>
 <% String message = "TypeList = " + pageContext.findAttribute("typeList") +"supplierList[0] = "
        + pageContext.findAttribute("tets[0]");
        logger.info(message); 
%>