<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:url value="/showMerchandise" var="urlShowMerchandise" />

<div id="email-error-dialog"></div>
<div style="margin-left: 20px">
	<a href="${urlShowMerchandise}"> <span
		class="fas fa-angle-double-left"> <u> List Merchandise </u>
	</span>
	</a>
	<h2>Create new Merchandise</h2>
	<%-- <form name="merchandiseAddForm" action="saveMerchandise" method="POST"
		modelAttribute="merchandise">
		<div></div>
		<table>

			<tr>
				<td>Merchandise ID:</td>
				<td><input name="id" data-validation="required"
					data-validation-error-msg="You did not enter a valid e-mail"
					data-validation-error-msg-container="#email-error-dialog"
					style="font-size: 15px;" /></td>
			</tr>
			<tr>
				<td>Name:</td>
				<td><input type="text" name="name" style="font-size: 15px;" /></td>
			</tr>
			<tr>
				<td>Type of Merchandise:</td>
				<td><form:select path="typeList">
						<form:option value="NONE" label="--- Select ---" />
						<form:options items="${typeList}" />
					</form:select>
					<select>
						<optgroup label=""  ></optgroup>
					</select>
				</td>
			</tr>
			<tr>
				<td>Amount:</td>
				<td><input type="text" name="amount" /></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit"
					value="Create User" name="btnSubmit" /></td>
			</tr>
		</table>
	</form> --%>

	<div class="panel-body">
		<form:form action="saveMerchandise" method="post"
			modelAttribute="merchandise">
			<table>
				<tr>
					<td>Merchandise's ID:</td>
					<td><input name="id" id="id" style="font-size: 15px;" value="${merchandise.id}" /></td>
				</tr>
				<tr>
					<td>Merchandise's name:</td>
					<td><input type="text" name="name" style="font-size: 15px;" /></td>
				</tr>
				<tr>
					<td>Merchandise's supplier:</td>
					<td><input type="text" name="name" style="font-size: 15px;" /></td>
				</tr>
				<tr>
					<td>Merchandise's type:</td>
					<td><form:select id="dropBox" path="merchandise_type_id">
							<form:option id="optionNone" value="" label="--- Select ---" />
							<form:options items="${typeList}" />
						</form:select></td>
					<td id="errorDropBox" style="color: red; font-size: 13px; padding-left: 30px;"></td>
				</tr>
				<tr>
					<td></td>
					<td><input type="submit" name="submit" value="Submit"
						onclick="return submitDropBox()"></td>
				</tr>
			</table>
		</form:form>
	</div>
</div>
