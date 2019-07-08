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
	text-align: center;
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
	font-size: 13px;
	color: red;
}
label.error{
	margin-left: 16px;
}

select#role {
	width: 100%;
	height: 28.4px;
	text-align: center;
}
select#dropBox {
	width: 100%;
	height: 28.4px;
	text-align: center;
}
select#dropBox1 {
	width: 100%;
	height: 28.4px;
	text-align: center;
}
#strongDetailSupplier{
	padding-left: 10px;
}
.open-button {
  background-color: #555;
  color: white;
  padding: 16px 20px;
  border: none;
  cursor: pointer;
  opacity: 0.8;
  position: fixed;
  bottom: 23px;
  right: 28px;
  width: 280px;
}

/* The popup form - hidden by default */
.form-popup {
  display: none;
  position: fixed;
  bottom: 0;
  right: 15px;
  border: 3px solid #f1f1f1;
  z-index: 9;
}

/* Add styles to the form container */
.form-container {
  max-width: 300px;
  padding: 10px;
  background-color: white;
}

/* Full-width input fields */
.form-container input[type=text], .form-container input[type=password], .form-container input[type=number] {
  width: 100%;
  padding: 15px;
  margin: 5px 0 22px 0;
  border: none;
  background: #f1f1f1;
}

/* When the inputs get focus, do something */
.form-container input[type=text]:focus, .form-container input[type=password]:focus {
  background-color: #ddd;
  outline: none;
}

/* Set a style for the submit/login button */
.form-container .btn {
  background-color: #4CAF50;
  color: white;
  padding: 16px 20px;
  border: none;
  cursor: pointer;
  width: 100%;
  margin-bottom:10px;
  opacity: 0.8;
}

/* Add a red background color to the cancel button */
.form-container .cancel {
  background-color: red;
}

/* Add some hover effects to buttons */
.form-container .btn:hover, .open-button:hover {
  opacity: 1;
}

/*Toggle button in detailNote.jsp*/

.switch {
  position: relative;
  display: inline-block;
  width: 60px;
  height: 34px;
}

.switch input { 
  opacity: 0;
  width: 0;
  height: 0;
}

.slider {
  position: absolute;
  cursor: pointer;
  top: 0;
  left: 0;
  right: 0;
  bottom: 0;
  background-color: #ccc;
  -webkit-transition: .4s;
  transition: .4s;
}

.slider:before {
  position: absolute;
  content: "";
  height: 26px;
  width: 26px;
  left: 4px;
  bottom: 4px;
  background-color: white;
  -webkit-transition: .4s;
  transition: .4s;
}

input:checked + .slider {
  background-color: #2196F3;
}

input:focus + .slider {
  box-shadow: 0 0 1px #2196F3;
}

input:checked + .slider:before {
  -webkit-transform: translateX(26px);
  -ms-transform: translateX(26px);
  transform: translateX(26px);
}

/* Rounded sliders */
.slider.round {
  border-radius: 34px;
}

.slider.round:before {
  border-radius: 50%;
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
/* 	function submitDropBox()
	{
		var x = document.getElementById("dropBox").value;
		var y = document.getElementById("dropBox1").value;
		if(x === "")
		{
			document.getElementById("errorDropBox").innerHTML = "This field is required.";
			
			if(y === "")
			{
				document.getElementById("errorDropBox1").innerHTML = "This field is required.";
				return false;
			}
			
		}
		else if(x !== "" && y !== "")
		{
			document.getElementById("errorDropBox").innerHTML = "";
			document.getElementById("errorDropBox1").innerHTML = "";
			return true;
		}
		else if(x !== "" && y === "")
		{
			document.getElementById("errorDropBox").innerHTML = "";
			document.getElementById("errorDropBox1").innerHTML = "This field is required.";
			return false
		}
		
	} */
	
	/* function submitDropBox_addMerchandise()
	{
		var x = document.getElementById("dropBox").value;
		var y = document.getElementById("dropBox1").value;
		console.log(x + ", " + y)
		if(x === "" && y === "" || x !== "" && y === "" || x === "" && y !== "")
		{
			document.getElementById("errorDropBox").innerHTML = "This field is required.";
			return false;
		}
		return true;
	} */
	function submitDropBox_addItemInImportNote(){
		var x = document.getElementById("dropBox").value;
		if(x === ""){
			document.getElementById("errorDropBox").innerHTML = "This field is required.";
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
                userName: {
                	required: true,
                	minlength: 4,
                	maxlength: 20
                },
                id: "required",
                password: "required",
                role: "required",
            },
            messages: {
/*              	userName: {
            		required: "Please enter username",
                	minlength: "Ký tự tối thiểu là 4",
                	maxlength: "Ký tự tối đa là 20"
            	}, */
            	/*id: "Vui lòng nhập tên" */
            }
        });
        
        $("#formAddSupplier").validate({
            rules: {
                name: {
                	required: true,
                	minlength: 4,
                	maxlength: 20
                },
                id: "required",
                phoneNumber: "required",
                email: "required"
            },
            messages: {
            }
        });
        $("#form_merchandise_type").validate({
            rules: {
                name: {
                	required: true,
                	minlength: 4,
                	maxlength: 20
                },
                id: "required"
            },
            messages: {
            }
        });
        
        $("#formAddMerchandise").validate({
            rules: {
                name: {
                	required: true,
                	minlength: 4,
                	maxlength: 20,
                	
                },
                id: "required",
                password: "required",
                dropBox: "required",
                dropBox1: "required"
            },
            messages: {
            }
        });
        $(document).ready(function(){
      	  $('[data-toggle="tooltip"]').tooltip(); 
      	});
        /* $("a").click(function(){
            $("footer").addClass("sticky-footer bg-white fixed-bottom");
          }); */
    });
    $( "#formImportNote" ).validate({
        rules: {
            dropBox: { required: true }
        }
    });
    </script>
</body>
<%-- <%
	String message = "path = " + pageContext.findAttribute("path");
	logger.info(message);
%> --%>


</html>