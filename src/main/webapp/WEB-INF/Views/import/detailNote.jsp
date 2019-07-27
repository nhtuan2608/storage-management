<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page import="java.util.logging.Logger"%>
<%
	Logger logger = Logger.getLogger(this.getClass().getName());
%>
<c:url value="/showAllImportNote" var="urlShowImportNote" />
<c:url value="/deleteNote" var="urlDeleteNote" />
<div style="margin-left: 20px">
	<a href="${urlShowImportNote}"> <span
		class="fas fa-angle-double-left"> <u> List Import Note </u>
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
								<h3>Import Note</h3>
							</div>
							<div class="col-sm"></div>
						</div>
					</div>
					<div class="row">
						<div class="col">
							<label>Import note's ID:</label>
						</div>
						<div class="col-6">
							<spring:bind path="note">
								<label>${note.id}</label>
							</spring:bind>
						</div>
					</div>
					<div class="row">
						<div class="col">
							<label>User:</label>
						</div>
						<div class="col-6">
							<label>${note.user_id}</label>
						</div>
					</div>
					<div class="row">
						<div class="col">
							<label>Date:</label>
						</div>
						<div class="col-6">
							<label>${note_date}</label>
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
							<div class="row">
								<div class="col">
									<a href="${showAllImportNote}" class="btn btn-info fas fa-save"
										style="color: black; width: 100%;" data-toggle="tooltip"
										title="Save and close this note!">Save</a>
								</div>
								<div class="col">
									<a href="${urlDeleteNote}/${note.id}" class="btn btn-info fas fa-trash"
										style="color: black; width: 100%" data-toggle="tooltip"
										title="Delete this note!">Delete</a>
								</div>
							</div>
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
							<a <%-- href="${urlAdd}" --%> href="#" onclick="openForm()"
								style="border: 2px solid blue; border-radius: 5px; background-color: #3333ff; color: #ffffff;">Add
								new Item</a>
						</div>
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
									<th>Username</th>
									<th>Password</th>
									<th>Role</th>
									<!-- <td style="border-right: none;"></td> -->
									<td style="border-right: none; border-left: none; width: 42px">Edit</td>
									<td style="border-left: none; width: 42px">Delete</td>
								</tr>
							</thead>
							<tfoot class="titleTable">
								<tr>
									<td class="td_Id">No.</td>
									<td class="td_Id">ID</td>
									<td>Username</td>
									<td>Password</td>
									<td>Role</td>
									<!-- <td style="border-right: none;"></td> -->
									<td style="border-right: none; border-left: none; width: 42px">Edit</td>
									<td style="border-left: none; width: 42px">Delete</td>
								</tr>
							</tfoot>
							<tbody>
								<c:if test="${not empty listDetail}">
									<c:forEach var="detail" items="${listDetail}">
										<tr style="border: 1px black solid">
											<td class="td_id">${detail.id}</td>
											<td class="td_Id">${detail.merchandise_id}</td>
											<td>${detail.amount}</td>
											<td>${detail.price}</td>
											<td>${detail.note}</td>
											<td class="actionCol"><a href="${urlView}/${detail.id}"><img
													src="${path}/img/icon/Search.png" height="20" width="20" />View</a></td>
											<td class="actionCol"><a
												href="${urlUpdate}/${detail.id}"><span
													class="fas fa-pencil-alt"></span></a></td>
											<td class="actionCol"><a
												href="${urlDelete}/${detail.id}"><span
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
		<div class="form-popup" id="myForm">
			<form action="saveDetailNote" method="POST" modelAttribute="detail"
				class="form-container" id="formImportNote">
				<div>
					<h1>Add new item ${detail.id}</h1>
				</div>
				<div>
					<div>
						<label for="id"><b>Amount</b></label>
					</div>
					<div>
						${detail.id} ${note.id} <input value="${detail.id}" type="text"
							name="id" id="id" readonly="readonly">
					</div>
				</div>
				<div>
					<label for="merchandise"><b>Merchandise</b></label>
				</div>
				<div>
					<form:select id="dropBox" path="detail.merchandise_id">
						<form:option id="optionNone" value="" label="--- Select ---" />
						<form:options items="${listMerchandise}" itemLabel="name"
							itemValue="id" />
					</form:select>
				</div>
				<div>

					<label id="errorDropBox" style="font-size: 13px; color: red;"></label>
				</div>

				<div>
					<div>
						<label for="amount"><b>Amount</b></label>
					</div>
					<div>
						<input type="number" placeholder="Enter Amount" name="amount">
					</div>
				</div>
				<div>
					<label for="price"><b>Price</b></label>
				</div>
				<div>
					<input type="number" placeholder="Enter Price" name="price">
				</div>
				<div>
					<label for="note"><b>Note</b></label>
				</div>
				<div>
					<input type="text" placeholder="Enter Note" name="note">
				</div>

				<input type="submit" class="btn"
					onclick="return submitDropBox_addItemInImportNote()" value="Add"
					id="formBtn">
				<button type="button" class="btn cancel" onclick="closeForm()">Close</button>
			</form>
		</div>

<%
	String message = "note = " + pageContext.findAttribute("note") + "mer = "
			+ pageContext.findAttribute("listMerchandise") + "detail = " + pageContext.findAttribute("detail");
	logger.info(message);
%>
<script>
	function openForm() {
		document.getElementById("myForm").style.display = "block";
	}

	function closeForm() {
		document.getElementById("myForm").style.display = "none";
	}
</script>