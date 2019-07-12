 <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="java.util.logging.Logger"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<%
	Logger logger = Logger.getLogger(this.getClass().getName());
%>
<c:url value="/addUser" var="urlAdd" />  
<c:url value="/deleteNote" var="urlDelete" />
<c:url value="/editUser" var="urlUpdate" />


<!-- Begin Page Content -->
<div class="container-fluid">  
	
	<!-- DataTales Example -->
	<div class="card shadow mb-4">
		<div class="card-header py-3">
			<div class="row">
			 <div class="col-sm"><h3 class="m-0 font-weight-bold text-primary">List Import Note</h3></div>
			 <div class="col-sm"></div>
    		 <div class="col-sm" style="text-align:right;"><a href="${urlAdd}" style="border: 2px solid blue; border-radius: 5px; background-color: #3333ff; color: #ffffff; ">Add new Note</a></div>
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
							<th>Creator</th>
							<th>Status</th>
							<th>Create Date</th>
							<td style="border-right: none;border-left: none; width: 42px">View</td>
							<td style="border-right: none;border-left: none;width: 42px">Edit</td>
							<td style="border-left: none;width: 42px">Delete</td>
						</tr>
					</thead>
					<tfoot class="titleTable">
						<tr>
							<td class="td_Id">No.</td>
							<td class="td_Id">ID</td>
							<th>Creator</th>
							<th>Status</th>
							<th>Create Date</th>
							<td style="border-right: none;border-left: none; width: 42px">View</td>
							<td style="border-right: none;border-left: none; width: 42px">Edit</td>
							<td style="border-left: none;width: 42px">Delete</td>
						</tr>
					</tfoot>
					<tbody>
						<c:if test="${not empty listNote}">
							<c:forEach var="note" items="${listNote}">
								<tr style="border: 1px black solid">
									<td class="td_id">${note.numberOfObject}</td>
									<td class="td_Id">${note.id}</td>
									<td>${note.user_id}</td>
									<td>${note.status}</td>
									<td>${note.date}</td>
									<%-- <td class="actionCol"><a href="${urlView}/${note.id}"><img
											src="${path}/img/icon/Search.png" height="20" width="20" />View</a></td> --%>
									<td class="actionCol"><a href="${urlView}/${note.id}"><span class="fas fa-eye"></span></a></td>		
									<td class="actionCol"><a href="${urlUpdate}/${note.id}"><span class="fas fa-pencil-alt"></span></a></td>
									<td class="actionCol"><a href="${urlDelete}/${note.id}"><span class="fas fa-trash-alt"></span></a></td>
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
	String message = "Notes = " + pageContext.findAttribute("listNote");
	logger.info(message);
%>
