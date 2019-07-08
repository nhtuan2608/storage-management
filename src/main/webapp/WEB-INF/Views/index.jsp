<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<%@page session="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<%-- <link href="<spring:url value="css/main.css" />" rel="stylesheet"> --%>
<%-- <link href="<spring:url value="css/bootstrap.css" />" rel="stylesheet"> --%>
<script type="text/javascript" src="<spring:url value="js/jquery-1.11.1.min.js" />"></script>
<script type="text/javascript" src="<spring:url value="js/bootstrap.js" />"></script>
<link href="<spring:url value="css/sb-admin-2.min.css" />" rel="stylesheet">
<link href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i" rel="stylesheet">	
<link href="<spring:url value="vendor/fontawesome-free/css/all.min.css" />" rel="stylesheet" type="text/css">
<title>Home Page</title>
</head>
<body >
<h1>Welcome Page</h1>
<a href="new">Create new User</a>
<div align="center">
        <h1>Spring Security Basic Demo (Java Config)</h1>
        <a href="/admin">Go to Administrator Page</a>
</div>

</body>
</html>