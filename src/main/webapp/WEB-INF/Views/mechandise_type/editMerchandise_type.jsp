<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@page import = "java.util.logging.Logger" %>
<c:url value="/showMerchandise_type" var="urlShowMerchandise_type" />  
<div style="margin-left: 20px">
  <% Logger logger = Logger.getLogger(this.getClass().getName());%>
  <a href="${urlShowMerchandise_type}"> <span class="fas fa-angle-double-left"> <u> List Merchandise Type </u> </span> </a>
  <br />
  <h2>Edit Merchandise Type</h2>
  <c:url value="/saveMerchandise" var="updateMerchandise" />
  <div class="panel-body">
  <form name="editForm" action="${urlShowMerchandise_type}" method="POST" modelAttribute="merchandise_type">
  	<div class="container">
				  <div class="row">
				    <div class="col-sm">
				    	<div><!-- <h3>User</h3> --><hr style="border: 1px solid red;"></div>				    	
				    	<div class="row">
				    		<div class="col-sm">
				    			<label>Type's ID:</label>
				    		</div>
				    		<div class="col-sm">
				    			<input type="text" name="id" value="${merchandise_type.id}">
				    		</div>
				    	</div>
				    	<div class="row">
				    		<div class="col-sm">
				    			<label>Type's Name:</label>
				    		</div>
				    		<div class="col-sm">
				    			<input type="text" name="name" value="${merchandise_type.name}"/>
				    		</div>
				    	</div>
				    	<div class="row">
				    		<div class="col-sm">
				    			<label>Media:</label>
				    		</div>
				    		<div class="col-sm">
				    			<input type="text" name="media" value="${merchandise_type.media}"/>
				    		</div>
				    	</div>
				    	<div class="row">
				    		<div class="col-sm">
				    		</div>
				    		<div class="col-sm">
				    			<input type="submit" class="btn btn-primary" value="Update" name="btnSubmit" />
				    		</div>
				    	</div>
				    </div>
  					<div class="col-sm"></div>
  					</div>
  	</div>
  </form>
  </div>
<% String message = "Queuing to Update Merchandises = "
        + pageContext.findAttribute("merchandise");
        logger.info(message); 
%>
</div>