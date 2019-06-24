<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page import="java.util.logging.Logger"%>
<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html"; charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">
<tiles:importAttribute name="title" />
<title><spring:message code="${title}"></spring:message></title>
<title>Spring MVC 5</title>


<c:set value="/SpringMVC" var="path" scope="session"></c:set>
<%-- <script src="${path}/css/all.css"></script> --%>
<link href="${path}/css/sb-admin-2.min.css" rel="stylesheet">
<link
	href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i"
	rel="stylesheet">
<link href="${path}/vendor/fontawesome-free/css/all.min.css"
	rel="stylesheet" type="text/css">
<link
	href="//cdnjs.cloudflare.com/ajax/libs/jquery-form-validator/2.3.26/theme-default.min.css"
	rel="stylesheet" type="text/css" />
<link href="${path}/vendor/datatables/dataTables.bootstrap4.min.css"
	rel="stylesheet">
<link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/1.10.19/css/jquery.dataTables.css">


<style>
.titleTable {
	font-weight: bold;
	background-color: #c3d0e5;
	color: #181919;
	text-align: center;
}

.actionCol {
	max-width: 42px;
}

td .td_Id {
	max-width: 30px;
}

#btnAddUser {
	margin-left: 225px;
	position: relative;
	flex: auto;
}
.error{
	font-size: 15px;
	color: red;
}
</style>

</head>
<%
	Logger logger = Logger.getLogger(this.getClass().getName());
%>
<body id="page-top">
	<div id="wrapper">

		<tiles:insertAttribute name="header" />
		<tiles:insertAttribute name="body" />
		<tiles:insertAttribute name="footer" />
	</div>
	<a class="scroll-to-top rounded" href="#page-top"> <i
		class="fas fa-angle-up"></i>
	</a>

	<script type="text/javascript"
		src="${path}/vendor/jquery/jquery.min.js"></script>
	<script type="text/javascript" charset="utf8"
		src="https://cdn.datatables.net/1.10.19/js/jquery.dataTables.js"></script>
	<script src="${path}/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

	<!-- Core plugin JavaScript-->
	<script src="${path}/vendor/jquery-easing/jquery.easing.min.js"></script>

	<!-- Custom scripts for all pages-->
	<script src="${path}/js/sb-admin-2.min.js"></script>
 	<script>
		$(document).ready(function() {
			$('#table_id').DataTable();
		});
	</script> 
	<script>
	function submitDropBox()
	{
		var x = document.getElementById("dropBox").value;
		console.log(x)
		if(x === "")
		{
			document.getElementById("errorDropBox").innerHTML = "Choose another";
			return false;
		}
		return true;
	}
	</script>
	<script src="http://ajax.aspnetcdn.com/ajax/jquery.validate/1.11.1/jquery.validate.min.js"></script>
	<script type="text/javascript">
 
    $(document).ready(function() {
 
        //Khi bàn phím được nhấn và thả ra thì sẽ chạy phương thức này
        $("#formDemo").validate({
            rules: {
                id: "required",
                userName: "required",
                password: "required",
                role: "required",
            },
            messages: {
            	id: "Vui lòng nhập họ",
            	userName: "Vui lòng nhập tên"
            }
        });
    });
    </script>
</body>
<%-- <%
	String message = "path = " + pageContext.findAttribute("path");
	logger.info(message);
%> --%>


</html>