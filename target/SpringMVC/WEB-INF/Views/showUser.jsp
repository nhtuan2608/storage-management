<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import = "java.util.logging.Logger" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>INFO</title>
<link href="<spring:url value="css/bootstrap.css" />" rel="stylesheet">
<script type="text/javascript" src="<spring:url value="js/jquery-1.11.1.min.js" />"></script>
<script type="text/javascript" src="<spring:url value="js/bootstrap.js" />"></script>
<link rel="icon" type="image/gif/png/jpg" href="img/logo.jpg">
<style>
table, th, td {
  border: 1px solid black;
}
td {
  padding-right: 30px;
}
</style>
</head>
<body>
<% Logger logger = Logger.getLogger(this.getClass().getName());%>
<!--  <h2>Detail INFO USER</h2>
<p><b>User #:</b> ${param.userNo}</p>
<p><b>Username:</b> ${param.userName}</p>
<p><b>User's role:</b> ${param.userRole}</p>
-->

<c:url value="/deleteUser/" var="urlDelete"/>
<c:url value="/editUser" var="urlUpdate"/>
<h1>List User ${message}</h1>
<table>
    <tr>
      <td>No.</td>
		<td>Username</td>
		<td>Password</td>
		<td>Role</td>
      <td colspan="3">View</td>
    </tr>
    <c:if test="${not empty listUsers}">
      <c:forEach var="user" items="${listUsers}">
        <tr style="border: 1px black solid">
          <td>${user.id}</td>
        <td>${user.userName}</td>
        <td>${user.password}</td>
        <td>${user.role}</td>
          <td> <a href="${urlView}/${user.id}">View</a></td>
          <td> <a href="${urlUpdate}/${user.id}">Edit</a></td>
          <td> <a href="${urlDelete}/${user.id}">Delete</a></td>
        </tr>
      </c:forEach>
    </c:if>
  </table>

<img alt="bunny hop image"  src="<c:url value="img/logo.jpg" />" />

<!--  <p><b>User #:</b> ${users[1].id}</p>
<p><b>Username:</b> ${users[1].userName}</p>
<p><b>Username:</b> ${users[1].password}</p>
<p><b>User's role:</b> ${user[1].userRole}</p>
-->
<% String message = "Users = "
        + pageContext.findAttribute("listUsers");
        logger.info(message); 
%>

</body>
</html>