<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page import="java.util.logging.Logger"%>
<%
	Logger logger = Logger.getLogger(this.getClass().getName());
%>
<c:url value="/showAllImportNote" var="urlShowNote" />

<div style="margin-left: 20px">
	<a href="${urlShowNote}"> <span class="fas fa-angle-double-left"> <u> List Import Note </u> </span> </a>
	<br />
		<form autocomplete="on" name="noteForm" action="saveImportNote"
		method="POST" modelAttribute="detail,note" id="formAddNote">
		
		<div class="container">
			<div class="row">
				<div class="col-sm">
					<div><hr style="border: 1px solid red;">
					<div class="row">
						<div class="col-sm"><h3>Create Import Note</h3></div>
						<div class="col-sm"><input style="float: right" type="submit" value="Create Import Note" name="btnSubmit" /></div>
					</div>
					</div>
					<div class="row">
						<div class="col">
							<label>Import note's ID:</label>
						</div>
						<div class="col-6">
							<input id="id" name="id" style="font-size: 15px; width: 100%;"
								type="text" value="${note.id}" readonly="true" />
							<label for="id" style="font-size: 13px; color: red;"></label>
						</div>
					</div>
					<div class="row">
						<div class="col">
							<label>User:</label>
						</div>
						<div class="col-6">
							<input id="name" type="text" name="name"
								style="font-size: 15px;width: 100%;" autofocus="true"
								placeholder="Supplier's name" />
							<label for="name" class="error" style="font-size: 13px; color: red;"></label>
						</div>
					</div>
					<div class="row">
						<div class="col">
							<label>Date:</label>
						</div>
						<div class="col-6">
							<input type="text" name="date"
								style="font-size: 15px;width: 100%;"
								id="date" />
							<label for="date" class="error" style="font-size: 13px; color: red;"></label>
						</div>
					</div>
				</div>	
				<div class="col-sm">
					<div></div>
					<div class="row">
						<div class="col">
							<label></label>
						</div>
						<div class="col-6"></label>
						</div>
					</div>
					<div class="row">
						<div class="col">
							<label></label>
						</div>
						<div class="col-6"></label>
						</div>
					</div>
					<div class="row">
						<div class="col">
							<label></label>
						</div>
						<div class="col-6"></label>
						</div>
					</div>
					<div class="row">
						<div class="col">
							<label></label>
						</div>
						<div class="col-6"></label>
						</div>
					</div>
					<div class="row">
						<div class="col">
							<label></label>
						</div>
						<div class="col-6"></label>
						</div>
					</div>
					<div class="row">
						<div class="col">
							<label></label>
						</div>
						<div class="col-6"></label>
						</div>
					</div>
				</div>
			</div>
		</div>
	</form>
</div>
<%
	String message = "Users = " + pageContext.findAttribute("note") + "Roles = " + pageContext.findAttribute("detail");
	logger.info(message);
%>