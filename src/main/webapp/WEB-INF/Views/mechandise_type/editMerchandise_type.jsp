<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@page import = "java.util.logging.Logger" %>
<c:url value="/showMerchandise" var="urlShowMerchandise" />  
<div class="container-fluid">
  <% Logger logger = Logger.getLogger(this.getClass().getName());%>
  <a href="${urlShowMerchandise}"> <span class="fas fa-angle-double-left"> <u> List Merchandise </u> </span> </a>
  <br />
  <h1>Edit Customer:</h1>
  <c:url value="/saveMerchandise" var="updateMerchandise" />
  <form name="editForm" action="${updateMerchandise}" method="POST" modelAttribute="merchandise">
  <div style="width: 300px;">
  	<div class="row">
	  	<div class="col-4"><label>ID:</label></div>
	  	<div class="col-8"><input type="text" name="id" value="${merchandise.id}"></div>
  	</div>
  	<div class="row">
  		<div class="col-4"><label>Name:</label></div>
  		<div class="col-8"><input type="text" name="userName" value="${merchandise.name}"/></div>
  	</div>
  	<div class="row">
  		<div class="col-4"><label>Supplier:</label></div>
  		<div class="col-8" ><input type="text" name="supplier" value="${user.supplier_id}"/></div>
  		
  	</div>
  	<div class="row">
  		<div class="col-4"><label>Type of merchandise: </label></div>
  		<div class="col-8" ><input type="text" name="type" value="${user.merchandise_type_id}"/></div>
  	</div>
  	<div class="row">
  		<div class="col-4" ></div>
  		<div class="col-8" ><input type="submit" value="Update" name="btnSubmit"/></div>
  	</div>
  	</div>
  </form>
<% String message = "Queuing to Update Merchandises = "
        + pageContext.findAttribute("merchandise");
        logger.info(message); 
%>
</div>