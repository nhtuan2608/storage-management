<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="java.util.logging.Logger"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<%
	Logger logger = Logger.getLogger(this.getClass().getName());
%>
<c:url value="/addMerchandise" var="urlAdd" />  
<c:url value="/deleteMerchandise" var="urlDelete" />
<c:url value="/editMerchandise" var="urlUpdate" />

<%-- <img alt="bunny hop image"  src="<c:url value="img/logo.jpg" />" /> --%>


<!-- Begin Page Content -->
<div class="container-fluid">

<%--  	<!-- Page Heading -->
	<h1 class="h3 mb-2 text-gray-800">List Merchandise ${listLength}</h1>
 	<p class="mb-4">
		DataTables is a third party plugin that is used to generate the demo
		table below. For more information about DataTables, please visit the <a
			target="_blank" href="https://datatables.net">official DataTables
			documentation</a>.
	</p>   --%>

	
	<!-- DataTales Example -->
	<div class="card shadow mb-4">
		<div class="card-header py-3">
			<div class="row">
			 <div class="col-sm"><h3 class="m-0 font-weight-bold text-primary">List Merchandise</h3></div>
			 <div class="col-sm"></div>
    		 <div class="col-sm" style="text-align:right;"><a href="${urlAdd}" style="border: 2px solid blue; border-radius: 5px; background-color: #3333ff; color: #ffffff; ">Add new Merchandise</a></div>
			</div>
		</div>
		<div class="card-body">
			<div class="table-responsive">
				<table class="table table-bordered" id="table_id" width="100%"
					cellspacing="0">
					<thead>
						<tr class="titleTable">
							<th class="td_Id">No.</th>
							<th class="td_Id">ID</th>
							<th>Merchandise Name</th>
							<td>Supplier</td>
							<td>Type</td>
							<td>Amount</td>
							<td>Unit</td>
							<!-- <td style="border-right: none;"></td> -->
							<td style="border-right: none;border-left: none; width: 42px">Edit</td>
							<td style="border-left: none;width: 42px">Delete</td>
						</tr>
					</thead>
					<tfoot class="titleTable">
						<tr>
							<td class="td_Id">No.</td>
							<td class="td_Id">ID</td>
							<td>Merchandise Name</td>
							<td>Supplier</td>
							<td>Type</td>
							<td>Amount</td>
							<td>Unit</td>
							<!-- <td style="border-right: none;"></td> -->
							<td style="border-right: none;border-left: none; width: 42px">Edit</td>
							<td style="border-left: none;width: 42px">Delete</td>
						</tr>
					</tfoot>
					<tbody>
						<c:if test="${not empty listMerchandises}">
							<c:forEach var="Merchandise" items="${listMerchandises}">
								<tr style="border: 1px black solid">
									<td class="td_id">${Merchandise.numberOfObject}</td>
									<td class="td_Id">${Merchandise.id}</td>
									<td>${Merchandise.name}</td>
									<td>${Merchandise.supplier_id}</td>
									<td>${Merchandise.merchandise_type_id}</td>
									<td>${Merchandise.amount}</td>
									<td>${Merchandise.unit}</td>
									<%-- <td class="actionCol"><a href="${urlView}/${Merchandise.id}"><img
											src="${path}/img/icon/Search.png" height="20" width="20" />View</a></td> --%>
									<td class="actionCol"><a href="${urlUpdate}/${Merchandise.id}"><span class="fas fa-pencil-alt"></span></a></td>
									<td class="actionCol"><a href="${urlDelete}/${Merchandise.id}"><span class="fas fa-trash-alt"></span></a></td>
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
	String message = "Merchandises = " + pageContext.findAttribute("listMerchandises");
	logger.info(message);
%>
