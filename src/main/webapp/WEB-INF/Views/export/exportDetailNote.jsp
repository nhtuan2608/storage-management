<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page import="java.util.logging.Logger"%>
<%
	Logger logger = Logger.getLogger(this.getClass().getName());
%>
<c:url value="/showAllExportNote" var="urlShowExportNote" />
<c:url value="/deleteNote" var="urlDeleteNote" />
<div style="margin-left: 20px">
	<a href="${urlShowExportNote}"> <span
		class="fas fa-angle-double-left"> <u> List Export Note </u>
	</span>
	</a> <br />
	<form autocomplete="on" name="noteForm" action="saveNote" method="POST"
		modelAttribute="note" id="formAddNote">

		<div class="container">
			<div class="row">
				<div class="col-sm">
					<div>
						<hr style="border: 1px solid red;">
						<div class="row">
							<div class="col-sm">
								<h3>Export Note</h3>
							</div>
							<div class="col-sm"></div>
						</div>
					</div>
					<div class="row">
						<div class="col">
							<label>Export note's ID:</label>
						</div>
						<div class="col-6">
							<spring:bind path="note">
								<label>${note.id}</label>
							</spring:bind>

							<%-- <input id="id" name="id" style="font-size: 15px; width: 100%;"
								type="text" value="${note.id}" readonly="true" />
							<label for="id" style="font-size: 13px; color: red;"></label> --%>
						</div>
					</div>
					<div class="row">
						<div class="col">
							<label>User:</label>
						</div>
						<div class="col-6">
							<label>${note.user_id}</label>
							<!-- <input id="name" type="text" name="name"
								style="font-size: 15px;width: 100%;" autofocus="true"
								placeholder="Supplier's name" />
							<label for="name" class="error" style="font-size: 13px; color: red;"></label> -->
						</div>
					</div>
					<div class="row">
						<div class="col">
							<label>Date:</label>
						</div>
						<div class="col-6">
							<label>${note.date}</label>

						</div>
					</div>
				</div>
				<div class="col-sm">
					<div>
						<hr style="border: 1px solid red;">
						<div class="row">
							<div class="col-sm"></div>
							<div class="col-sm"></div>
						</div>
					</div>
					<div></div>
					
					<div class="row">
						<div class="col">
							<label></label>
						</div>
						<div class="col-6">
							</label>
						</div>
					</div>
					<div class="row">
						<div class="col">
							<label></label>
						</div>
						<div class="col-6">
							</label>
						</div>
					</div>
					<div class="row">
						<div class="col">
							<label></label>
						</div>
						<div class="col-6">
							</label>
						</div>
					</div>
					<div class="row">
						<div class="col">
							<label></label>
						</div>
						<div class="col-6">
							</label>
						</div>
					</div>
					<div class="row">
						<div class="col">
							<label></label>
						</div>
						<div class="col-6">
							</label>
						</div>
					</div>
				</div>
			</div>
		</div>
	</form>

	<!-- Begin Page Content -->
	<div class="container-fluid">

		<!-- DataTales Example -->
		<div class="card shadow mb-4">
			<div class="card-header py-3">
				<div class="row">
					<div class="col-sm">
						<h3 class="m-0 font-weight-bold text-primary">List Detail</h3>
					</div>
					<div class="col-sm"></div>
					<div class="col-sm" style="text-align: right;">
						<button type="button" class="btn btn-info" data-toggle="modal"
							data-target="#myModal">Add Export Detail</button>
					</div>
				</div>
			</div>
			<div class="card-body">
				<div class="table-responsive">
					<table class="table table-bordered" id="table_id" width="100%"
						cellspacing="0">
						<thead>
							<tr class="titleTable">
								<th class="td_Id">ID</th>
								<th>Merchandise</th>
								<th>Quantity</th>
								<th>Price</th>
								<th>Total</th>
								<th>Note</th>
								<th>Customer</th>
								<th>Address</th>
								<!-- <td style="border-right: none;"></td> -->
								<td style="border-right: none; border-left: none; width: 42px">View</td>
								<td style="border-right: none; border-left: none; width: 42px">Edit</td>
								<td style="border-left: none; width: 42px">Delete</td>
							</tr>
						</thead>

						<tbody>
							<c:if test="${not empty listDetail}">
								<c:forEach var="detail" items="${listDetail}">
									<tr style="border: 1px black solid">
										<td class="td_id">${detail.id}</td>
										<td class="td_Id">${detail.merchandise_id}</td>
										<td>${detail.quantity}</td>
										<td>${detail.price}</td>
										<td>${detail.total}</td>
										<td>${detail.note}</td>
										<td>${detail.customer}</td>
										<td>${detail.address}</td>
										<td class="actionCol"><a href="${urlView}/${detail.id}"><img
												src="${path}/img/icon/Search.png" height="20" width="20" />View</a></td>
										<td class="actionCol"><a href="${urlUpdate}/${detail.id}"><span
												class="fas fa-pencil-alt"></span></a></td>
										<td class="actionCol"><a href="${urlDelete}/${detail.id}"><span
												class="fas fa-trash-alt"></span></a></td>
									</tr>
								</c:forEach>
							</c:if>
						</tbody>
					</table>
				</div>
			</div>
		</div>
	</div>
</div>
<div class="modal fade" id="myModal" role="dialog">
	<div class="modal-dialog modal-lg">
		<div class="modal-content">
			<div class="modal-header">
				<h1>Add new item ${note.id}</h1>
			</div>
			<div class="modal-body">
				<form action="saveExportDetailNote" method="POST"
					modelAttribute="detail" class="form-horizontal" id="formExportNote">
					<div class="form-group">
						<label class="control-label col-sm-2" for="id">Id:</label>
						<div class="col-sm-10">
							<input type="text" value="${detail.id}" name="id" readonly="true"
								class="form-control" id="id" />
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-sm-2" for="export_Note_id">Export Id:</label>
						<div class="col-sm-10">
							<input type="text" value="${note.id}" name="export_Note_id" readonly="true"
								class="form-control" id="export_Note_id" />
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-sm-2" for="merchandise">Merchandise:</label>
						<div class="col-sm-10">
							<form:select id="dropBox" path="detail.merchandise_id">
								<form:option id="optionNone" value="" label="--- Select ---" />
								<form:options items="${listMerchandise}" itemLabel="name"
									itemValue="id" />
							</form:select>
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-sm-2" for="quantity">Quantity:</label>
						<div class="col-sm-10">
							<input type="number" name="quantity" class="form-control"
								id="quantity" placeholder="Enter quantity">
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-sm-2" for="price">Price:</label>
						<div class="col-sm-10">
							<input type="number" name="price" class="form-control" id="price"
								placeholder="Enter price">
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-sm-2" for="total">Total:</label>
						<div class="col-sm-10">
							<input type="number" name="total" class="form-control" id="total"
								placeholder="Enter total">
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-sm-2" for="total">Customer:</label>
						<div class="col-sm-10">
							<input type="text" name="customer" class="form-control"
								id="customer" placeholder="Enter customer">
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-sm-2" for="address">Address:</label>
						<div class="col-sm-10">
							<input type="text" name="address" class="form-control"
								id="address" placeholder="Enter address">
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-sm-2" for="note">Note:</label>
						<div class="col-sm-10">
							<input type="text" name="note" class="form-control" id="note"
								placeholder="Enter note">
						</div>
					</div>
					<div class="form-group">
						<div class="col-sm-offset-2 col-sm-10">
							<button type="submit" class="btn btn-info">Submit</button>
						</div>
					</div>
				</form>
			</div>
			<div class="modal-footer">
				<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
			</div>
		</div>
	</div>
</div>