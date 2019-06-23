<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@page import = "java.util.logging.Logger" %>
<c:url value="/showUser" var="urlShowUser" />  
<div class="container-fluid">
  <% Logger logger = Logger.getLogger(this.getClass().getName());%>
  <a href="${urlShowUser}"> <span class="fas fa-angle-double-left"> <u> List User </u> </span> </a>
  <br />
  <h1>Edit Customer:</h1>
  <c:url value="/saveUser" var="updateUser" />
  <form name="editForm" action="${updateUser}" method="POST" modelAttribute="user">
  <div style="width: 300px;">
  	<div class="row">
	  	<div class="col-4"><label>ID:</label></div>
	  	<div class="col-8"><input type="text" name="id" value="${user.id}"></div>
  	</div>
  	<div class="row">
  		<div class="col-4"><label>Username:</label></div>
  		<div class="col-8"><input type="text" name="userName" value="${user.userName}"/></div>
  	</div>
  	<div class="row">
  		<div class="col-4"><label>Password:</label></div>
  		<div class="col-8" ><input type="text" name="password" value="${user.password}"/></div>
  		
  	</div>
  	<div class="row">
  		<div class="col-4"><label>Role: </label></div>
  		<div class="col-8" ><input type="text" name="role" value="${user.role}"/></div>
  	</div>
  	<div class="row">
  		<div class="col-4" ></div>
  		<div class="col-8" ><input type="submit" value="Update" name="btnSubmit"/></div>
  	</div>
  	</div>
  </form>
<% String message = "Queuing to Update Users = "
        + pageContext.findAttribute("user");
        logger.info(message); 
%>
</div>