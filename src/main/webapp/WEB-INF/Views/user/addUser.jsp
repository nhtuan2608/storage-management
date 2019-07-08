<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page import="java.util.logging.Logger"%>
<%
	Logger logger = Logger.getLogger(this.getClass().getName());
%>
<c:url value="/showUser" var="urlShowUser" />

<div style="margin-left: 20px">
	<a href="${urlShowUser}"> <span class="fas fa-angle-double-left"> <u> List User </u> </span> </a>
	<br />
	<!-- <h2 style="margin-left: 20px;">User</h2> -->
	<form autocomplete="off" name="userForm" action="saveUser"
		method="POST" modelAttribute="user" id="formAddMerchandise" >
		<div class="container">
				  <div class="row">
				    <div class="col-sm">
				    	<div><h3>User</h3><hr style="border: 1px solid red;"></div>				    	
				    	<div class="row">
				    		<div class="col">
				    			<label>User's ID:</label>
				    		</div>
				    		<div class="col-6">
				    			<input id="id" name="id" style="font-size: 15px; width: 100%;" type="text" value="${user.id}" readonly="true" />
				    			<label for="id" style="font-size: 13px; color: red;"></label>
				    		</div>
				    	</div>
				    	<div class="row">
				    		<div class="col">
				    			<label>User's name:</label>
				    		</div>
				    		<div class="col-6">
				    			<input id="userName" type="text" name="userName" style="font-size: 15px;width: 100%;" autofocus="true" placeholder="Username"/>
				    			<label for="userName" class="error" style="font-size: 13px; color: red;"></label>
				    		</div>
				    	</div>
				    	<div class="row">
				    		<div class="col-sm">
				    			<label>Password:</label>
				    		</div>
				    		<div class="col-6">
				    			<input autocomplete="on" type="password" name="password" placeholder="Password" style="font-size: 15px;width: 100%;" id="password"/>
				    			<label for="password" class="error" style="font-size: 13px; color: red;"></label>
				    		</div>
				    	</div>
				    	<div class="row">
				    		<div class="col-sm">
				    			<label>User's role:</label>
				    		</div>
				    		<div class="col-6">
				    			<!-- <select name="role" id="role" >
									<option id="optionNone" value="" label="--- Select ---"></option>
									<option value="User">User</option>
									<option value="Admin">Admin</option>
									<option value="SuperAdmin">Super Admin</option>
								</select>
								<label for="role" class="error" style="font-size: 13px; color: red;"></label> -->
								 <form:select id="dropBox" path="user.role.name" name="name">
										<%-- <form:option id="optionNone" value="" label="--- Select ---" /> --%>
										<form:options items="${roles}"  />
								 </form:select>
								<label id="errorDropBox" style="font-size: 13px; color: red;"></label>
				    		</div>
				    	</div>
				    	<div class="row">
				    		<div class="col"></div>
				    		<div class="col-6"><input type="submit" class="btn btn-primary" value="Add User" name="btnSubmit" /></div>
				    	</div> 
				    </div>
				     <div class="col-sm"></div>
				  </div>
		</div>
	</form>
</div>
<%-- <%
	String message = "Users = " + pageContext.findAttribute("user") + "Roles = " + pageContext.findAttribute("role");
	logger.info(message);
%> --%>