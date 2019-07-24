<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="java.util.logging.Logger"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<%
	Logger logger = Logger.getLogger(this.getClass().getName());
%>

<c:url value="/deleteUser/" var="urlDelete" />
<c:url value="/editUser" var="urlUpdate" />

<%-- <img alt="bunny hop image"  src="<c:url value="img/logo.jpg" />" /> --%>


<!-- Begin Page Content -->
<div class="container-fluid">

	<!-- Page Heading -->
<!--	<h1 class="h3 mb-2 text-gray-800">List User ${message}</h1>
 	<p class="mb-4">
		DataTables is a third party plugin that is used to generate the demo
		table below. For more information about DataTables, please visit the <a
			target="_blank" href="https://datatables.net">official DataTables
			documentation</a>.
	</p> -->

	<!-- DataTales Example -->
	<div class="card shadow mb-4">
		<div class="card-header py-3">
			<h3 class="m-0 font-weight-bold text-primary">List User</h3>
		</div>
		<div class="card-body">
			<div class="table-responsive">
				<table class="table table-bordered" id="dataTable" width="100%"
					cellspacing="0">
					<thead>
						<tr class="titleTable">
							<td class="td_Id">ID</td>
							<td>Username</td>
							<td>Password</td>
							<td>Role</td>
							<td colspan="3">Action</td>
						</tr>
					</thead>
					<tfoot class="titleTable">
						<tr>
							<td class="td_Id">ID</td>
							<td>Username</td>
							<td>Password</td>
							<td>Role</td>
							<td colspan="3">Action</td>
						</tr>
					</tfoot>
					<tbody>
						<c:if test="${not empty listUsers}">
							<c:forEach var="user" items="${listUsers}">
								<tr style="border: 1px black solid">
									<td class="td_Id">${user.id}</td>
									<td>${user.userName}</td>
									<td>${user.password}</td>
									<td>${user.role}</td>
									<td class="actionCol"><a href="${urlView}/${user.id}"><img src="${path}/img/icon/Search.png" height="20" width="20" />View</a></td>
									<td class="actionCol"><a href="${urlUpdate}/${user.id}"><img src="${path}/img/icon/Edit.png" height="20" width="20" />Edit</a></td>
									<td class="actionCol"><a href="${urlDelete}/${user.id}"><img src="${path}/img/icon/Remove.png" height="20" width="20"/>Delete</a></td>
								</tr>
							</c:forEach>
						</c:if>
					</tbody>
				</table>
			</div>
		</div>
	</div>

</div>
<!-- /.container-fluid -->
<%
	String message = "Users = " + pageContext.findAttribute("listUsers");
	logger.info(message);
%>
