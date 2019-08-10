<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page import="java.util.logging.Logger"%>
<%
	Logger logger = Logger.getLogger(this.getClass().getName());
%>
<c:url value="/index" var="urlIndex" />

<div style="margin-left: 20px">
	<a href="${urlIndex}"> <span class="fas fa-angle-double-left">
			<u> Back </u>
	</span>
	</a> <br />
	<!-- <h2 style="margin-left: 20px;">User</h2> -->
	<form autocomplete="off" name="userForm" action="saveUser"
		method="POST" modelAttribute="profileUser" id="formAddMerchandise">
		<div class="container">
			<div class="row">
				<div class="col-sm">
					<div>
						<h3>User</h3>
						<hr style="border: 1px solid red;">
					</div>
					<div class="row">
						<div class="col">
							<label>User's ID:</label>
						</div>
						<div class="col-6">
							<label>${profileUser.id}</label>
						</div>
					</div>
					<div class="row">
						<div class="col">
							<label>User's name:</label>
						</div>
						<div class="col-6">
							<label>${profileUser.userName}</label>
						</div>
					</div>
					<div class="row">
						<div class="col-sm">
							<label>Password:</label>
						</div>
						<div class="col-6">
							<label><a href="#" id="btn-export" onclick="clearErr()">Change
									password</a></label>
						</div>
					</div>
					<div class="row">
						<div class="col-sm">
							<label>User's role:</label>
						</div>
						<div class="col-6">
							<label>${profileUser.role.name }</label>

						</div>
					</div>
					<div class="row">
						<div class="col"></div>
						<div class="col-6">
							<input type="submit" class="btn btn-primary" value="Add User"
								name="btnSubmit" />
						</div>
					</div>
				</div>
				<div class="col-sm"></div>
			</div>
		</div>
	</form>
</div>

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
						<h1 style="text-align: center;">Change your password</h1>
					</div>
					<div class="row">
						<h5 style="color: red;" id="err"></h5>
					</div>
					<div class="popup-footer">
						<form autocomplete="off" name="userForm" action="saveUser"
							method="POST" modelAttribute="profileUser" id="formProfile">
							<div class="row">
								<div class="col">
									<div class="row">
										<label>Current password: </label>
									</div>
									<div class="row">
										<label></label>
									</div>
									<div class="row">
										<label>New password: </label>
									</div>
									<div class="row">
										<label></label>
									</div>
									<div class="row">
										<label>Confirm password: </label>
									</div>
									<div class="row">
										<label></label>
									</div>
								</div>
								<div class="col">
									<div class="row">
										<input id="password" name="password"
											style="font-size: 15px; width: 100%;" type="password"
											placeholder="Current password" required="required" />
									</div>
									<div class="row">
										<label for="password" style="font-size: 13px; color: red;"></label>
									</div>
									<div class="row">
										<input id="newPwd" name="newPwd"
											style="font-size: 15px; width: 100%;" type="password"
											placeholder="New password" required="required"/>
									</div>
									<div class="row">
										<label for="newPwd" style="font-size: 13px; color: red;"></label>
									</div>
									<div class="row">
										<input id="confirmPwd" name="confirmPwd"
											style="font-size: 15px; width: 100%;" type="password"
											placeholder="Confirm password" required="required" />
									</div>
									<div class="row">
										<label id="errConfirmPwd" style="font-size: 13px; color: red;"></label>
									</div>
									<div class="row">
										<button class="btn btn-primary"
											onclick="return checkPassword();">Save</button>
									</div>
								</div>
							</div>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>
<script>
	function clearErr() {
		if (document.getElementById("err").value !== "") {
			document.getElementById("err").innerHTML = "";
		}
		console.log(document.getElementById("err").value)
	}

/* 	function checkPassword() {
		if (newPwd === confirmPwd) {
			return true;
		} else {
			document.getElementById("err").innerHTML = "New password and confirm password not match."
		}
	} */
</script>
<%-- <%
	String message = "Users = " + pageContext.findAttribute("user") + "Roles = " + pageContext.findAttribute("role");
	logger.info(message);
%> --%>