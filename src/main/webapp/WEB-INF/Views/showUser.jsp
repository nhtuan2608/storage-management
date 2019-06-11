<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import = "java.util.logging.Logger" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>INFO</title>
</head>
<body>
<% Logger logger = Logger.getLogger(this.getClass().getName());%>
<!--  <h2>Detail INFO USER</h2>
<p><b>User #:</b> ${param.userNo}</p>
<p><b>Username:</b> ${param.userName}</p>
<p><b>User's role:</b> ${param.userRole}</p>
-->

<p><b>User #:</b> ${user.userNo}</p>
<p><b>Username:</b> ${user.userName}</p>
<p><b>User's role:</b> ${user.userRole}</p>
<% String message = "User = "
        + pageContext.findAttribute("user");
        logger.info(message); 
%>

</body>
</html>