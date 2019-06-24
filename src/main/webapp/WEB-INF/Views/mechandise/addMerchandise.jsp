<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:url value="/showUser" var="urlShowUser" />

<div id="email-error-dialog"></div>
<div style="margin-left: 20px">
	<a href="${urlShowUser}"> <span class="fas fa-angle-double-left">
			<u> List User </u>
	</span>
	</a>
	<h2>Create new User</h2>
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
     <form:form action="saveMerchandise"
      method="post" modelAttribute="merchandise">

<%--       <!-- need to associate this data with customer id -->
      <form:hidden path="id" /> --%>

      <div class="form-group">
       <label for="id" class="col-md-3 control-label">ID:</label>
       <div class="col-md-9">
        <form:input path="id" />
       </div>
      </div>
      <div class="form-group">
       <label for="name" class="col-md-3 control-label">Name:</label>
       <div class="col-md-9">
        <form:input path="name" />
       </div>
      </div>

      <div class="form-group">
       <label for="merchandise_type_id" class="col-md-3 control-label">Type of Merchandise:</label>
       <div class="col-md-9">
				<form:select id="dropBox" path="merchandise_type_id">
						<form:option id="optionNone" value="" label="--- Select ---" />
						<form:options items="${typeList}" />
					</form:select>
				<%-- <form:errors path="merchandise_type_id" cssStyle="color: red;" /> --%>
				<div id="errorDropBox" style="color: red;"></div>
				</div>
      </div>

      <div class="form-group">
       <!-- Button -->
       <div class="col-md-offset-3 col-md-9">
        <%-- <form:button>Submit</form:button> --%>
        <input type="submit" name="submit" value="Submit" onclick="return submitDropBox()">
       </div>
      </div>

     </form:form>
    </div>
</div>
