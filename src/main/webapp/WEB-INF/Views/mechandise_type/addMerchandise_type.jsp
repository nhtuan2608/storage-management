<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:url value="/showMerchandise_type" var="urlshowMerchandise_type" />

<div style="margin-left: 20px">
	<a href="${urlshowMerchandise_type}"> <span class="fas fa-angle-double-left">
			<u> List Type of merchandise </u>
	</span>
	</a>
	<h2>Create new Type</h2>

	
 	<div class="panel-body">
     <form autocomplete="off" action="saveMerchandise_type"
      method="POST" modelAttribute="merchandise_type" id="form_merchandise_type">

<%--       <!-- need to associate this data with customer id -->
      <form:hidden path="id" /> --%>
      <table>
			<tr>
				<td>Type ID:</td>
				<td><input id="id" name="id" style="font-size: 15px;" type="text" value="${merchandise_type.id}" readonly="true" /></td>
			</tr>
			<tr>
				<td>Type's name:</td>
				<td><input id="name" type="text" name="name" style="font-size: 15px;" autofocus="true" placeholder="Name"/></td>
			</tr>
			<tr>
				<td></td>
				<td colspan="1"><input type="submit" value="Create Type" name="btnSubmit" /></td>
			</tr>
	</table>
     </form>
    </div>
</div>
