<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page import="java.util.logging.Logger"%>
<%
	Logger logger = Logger.getLogger(this.getClass().getName());
%>
<c:url value="/showAllExportNote" var="urlShowExportNote" />
<c:url value="/EditExportDetail" var="urlEditExport" />
<c:url value="/deleteNote" var="urlDeleteNote" />
<c:url value="/updateExportDetail" var="updateExport" />
<spring:url value="/report/?type=pdf" var="pdfURL" />
<div style="margin-left: 20px">
	<a href="${urlShowExportNote}"> <span
		class="fas fa-angle-double-left"> <u> List Export Note </u>
	</span>
	</a> <br />
	<div class="bg-modal">
						<div class="container">
							<div class="row">
								<div class="col-md-12">
									<div class="popup">
										<div class="popup-header">
											<div class="close">
												<a href="#" id="close"> <i class="fa fa-close"></i>
												</a>
											</div>
										</div>
										<div class="popup-body">
											<p>Choose your file</p>
										</div>
										<div class="popup-footer">
											<div class="row">
												<div class="col">
													<button type="button" class="btn btn-primary" onclick="location.href='${pdfURL}'" title="Download PDF">Download PDF</button>
												</div>
						
											<!-- <ul>
												<li></li>
												<li></li>
											</ul> -->
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
	
	<!-- Begin Page Content -->
	<form action="${updateExport}" method="POST"
		modelAttribute="exportDetail" class="form-horizontal" id="formExportNote">
		<div class="form-group">
			<label class="control-label col-sm-2" for="id">Id:</label>
			<div class="col-sm-10">
				<input type="text" value="${exportDetail.id}" name="id"
					class="form-control" id="id" />
			</div>
		</div>
		<div class="form-group">
			<label class="control-label col-sm-2" for="export_Note_id">Export
				Id:</label>
			<div class="col-sm-10">
				<input type="text" value="${exportDetail.export_Note_id}" name="export_Note_id"
					class="form-control" id="export_Note_id" />
			</div>
		</div>
		<div class="form-group">
			<label class="control-label col-sm-2" for="merchandise">Merchandise:</label>
			<div class="col-sm-10">
				<input type="text" value="${exportDetail.merchandise_id}" name="merchandise_id"
					class="form-control" id="merchandise_id" />
			</div>
		</div>
		<div class="form-group">
			<label class="control-label col-sm-2" for="quantity">Quantity:</label>
			<div class="col-sm-10">
				<input type="number" value="${exportDetail.quantity}" name="quantity" class="form-control"
					id="quantity" placeholder="Enter quantity">
			</div>
		</div>
		<div class="form-group">
			<label class="control-label col-sm-2" for="price">Price:</label>
			<div class="col-sm-10">
				<input type="number" name="price" value="${exportDetail.price}" class="form-control" id="price"
					placeholder="Enter price">
			</div>
		</div>
		<div class="form-group">
			<label class="control-label col-sm-2" for="total">Total:</label>
			<div class="col-sm-10">
				<input type="number" name="total" value="${exportDetail.total}" class="form-control" id="total"
					placeholder="Enter total">
			</div>
		</div>
		<div class="form-group">
			<label class="control-label col-sm-2" for="total">Customer:</label>
			<div class="col-sm-10">
				<input type="text" name="customer" value="${exportDetail.customer}" class="form-control"
					id="customer" placeholder="Enter customer">
			</div>
		</div>
		<div class="form-group">
			<label class="control-label col-sm-2" for="address">Address:</label>
			<div class="col-sm-10">
				<input type="text" name="address" value="${exportDetail.address}" class="form-control" id="address"
					placeholder="Enter address">
			</div>
		</div>
		<div class="form-group">
			<label class="control-label col-sm-2" for="note">Note:</label>
			<div class="col-sm-10">
				<input type="text" name="note" value="${exportDetail.note}" class="form-control" id="note"
					placeholder="Enter note">
			</div>
		</div>
		<div class="form-group">
			<div class="col-sm-offset-2 col-sm-10">
				<input type="submit" value="Update" name="btnSubmit" />
			</div>
		</div>
	</form>
</div>