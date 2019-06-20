<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="<spring:url value="css/bootstrap.css" />" rel="stylesheet">
<script type="text/javascript" src="<spring:url value="js/jquery-1.11.1.min.js" />"></script>
<script type="text/javascript" src="<spring:url value="js/bootstrap.js" />"></script>
<title>Home Page</title>
</head>
<body>

<!-- <h1>Welcome Page</h1>
<a href="new">Create new User</a> -->

<div class="container">
    <nav class="navbar navbar-expand-md navbar-light bg-light sticky-top">
        <div class="container-fluid">
            <a class="navbar-branch" href="#">
                <img src="img/logo.jpg" />
            </a>
            <button class="navbar-toggle" type="button" data-toggle="collapse" data-target="#navbarResponsive">
                        <span class="navbar-toggle-icon"></span>
                    </button>
            <div class="collapse navbar-collapse" id="navbarResponsive">
                <ul class="navbar-nav ml-auto">
                    <li class="item">
                        <a href="nav-link">Home</a>
                    </li>
                    <li class="item">
                        <a href="nav-link">Home</a>
                    </li>
                    <li class="item">
                        <a href="nav-link">Home</a>
                    </li>
                </ul>
            </div>
        </div>
    </nav>
</div>
</body>
</html>