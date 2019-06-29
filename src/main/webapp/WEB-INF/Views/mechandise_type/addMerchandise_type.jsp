<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:url value="/showMerchandise_type" var="urlshowMerchandise_type" />

<div style="margin-left: 20px">
	<a href="${urlshowMerchandise_type}"> <span class="fas fa-angle-double-left">
			<u> List Type of merchandise </u>
	</span>
	</a>
	<h2 style="margin-left: 20px">Add Type</h2>

	
 	<div class="panel-body">
     <form autocomplete="off" action="saveMerchandise_type"
      method="POST" modelAttribute="merchandise_type" id="form_merchandise_type">
		
		<div class="container">
				  <div class="row">
				    <div class="col-sm">
				    	<div><!-- <h3>Add Type</h3> --><hr style="border: 1px solid red;"></div>				    	
				    	<div class="row">
				    		<div class="col">
				    			<label>Type's ID:</label>
				    		</div>
				    		<div class="col-6">
				    			<input id="id" name="id" style="font-size: 15px; width: 100%;" type="text" value="${merchandise_type.id}" readonly="true" />
				    		</div>
				    	</div>
				    	<div class="row">
				    		<div class="col">
				    			<label>Type's name:</label>
				    		</div>
				    		<div class="col-6">
				    			<input id="name" type="text" name="name" style="font-size: 15px;width: 100%;" autofocus="true" placeholder="Name"/>
				    		</div>
				    	</div>
				    	<div class="row">
				    		<div class="col">
				    		</div>
				    		<div class="col-6">
				    			<input type="submit" class="btn btn-primary" value="Create Type" name="btnSubmit" />
				    		</div>
				    	</div>
				    </div>
				    <div class="col-sm"></div>
				  </div>
		</div>
     </form>
    </div>
</div>
