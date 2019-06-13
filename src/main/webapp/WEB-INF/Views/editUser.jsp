<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<title>Helo Spring MVC + JDBC</title>
</head>
<body>
  <a href="<c:url value="/showUser" />">List User</a>
  <br />
  <h1>Edit Customer:</h1>
  <c:url value="/saveUser" var="updateUser" />
  <form name="editForm" action="${updateUser}" method="POST" modelAttribute="user">
  	<label>ID:</label>
  	<input type="text" name="id" value="${user.id}">
  	<label></label>
  	<label>Username:</label>
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