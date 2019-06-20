<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<<<<<<< HEAD
<html>
<head>
<title>Helo Spring MVC + JDBC</title>
</head>
<body>
=======
<%@page import = "java.util.logging.Logger" %>

<div class="container-fluid">
  <% Logger logger = Logger.getLogger(this.getClass().getName());%>
>>>>>>> Tuan
  <a href="<c:url value="/showUser" />">List User</a>
  <br />
  <h1>Edit Customer:</h1>
  <c:url value="/saveUser" var="updateUser" />
  <form name="editForm" action="${updateUser}" method="POST" modelAttribute="user">
  	<label>ID:</label>
  	<input type="text" name="id" value="${user.id}">
  	<label></label>
  	<label>Username:</label>
<<<<<<< HEAD
  	<input type="text" name="userName"/>
  	<label></label>
  	<label>Password:</label>
  	<input type="text" name="password"/>
  	<label></label>
  	<label>Role</label>
  	<input type="text" name="role"/>
  	<label></label>
  	<input type="submit" value="Update" name="btnSubmit"/></td>
  </form>
</body>
</html>
=======
  	<input type="text" name="userName" value="${user.userName}"/>
  	<label></label>
  	<label>Password:</label>
  	<input type="text" name="password" value="${user.password}"/>
  	<label></label>
  	<label>Role</label>
  	<input type="text" name="role" value="${user.role}"/>
  	<label></label>
  	<input type="submit" value="Update" name="btnSubmit"/></td>
  </form>
<% String message = "Queuing to Update Users = "
        + pageContext.findAttribute("user");
        logger.info(message); 
%>
</div>
>>>>>>> Tuan
