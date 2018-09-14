<%@page import="java.util.*"%>
<%@page import= "com.pojo.org.*" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">


    <!-- Bootstrap core CSS-->
    <link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom fonts for this template-->
    <link href="vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">

    <!-- Page level plugin CSS-->
    <link href="vendor/datatables/dataTables.bootstrap4.css" rel="stylesheet">

    <!-- Custom styles for this template-->
    <link href="css/sb-admin.css" rel="stylesheet">

  </head>

  <body id="page-top">

  <%@include file="adminheader.jsp" %>
  <%@include file="adminsidebar.jsp" %>

	<%
		List<Department> list=(ArrayList<Department>)request.getAttribute("list");
	%>
	<div class="container">
    <div class="card card-register mx-auto mt-5">
      <div class="card-header"><h4>Department</h4></div>
      <div class="card-body">
        
          <form action="EditDepartmentRegister" method="get">
            <div class="form-group">
              <div class="form-label-group">
              <h4>
              <%for(Department department:list){%> 
            	  <div class="card card-register mx-auto mt-1">
            	 <div class="card-body">
            	
              <%out.println(department.getDepartment());%>&nbsp;
               <a href="DeleteDepartment?id=<%=department.getId()%>">
               <p style="float:right" class="fa fa-times"></p>
               </a>
              </div>
              </div>
              	<%
              	}%>
              </h4>
             	 <br>
              	Add Department:
               <input type="text" id="inputdepartment" name="department">
              </div>
            </div>
            <button class="btn btn-primary btn-block">Save</button>
            </form>
             
          </div>
       
		   </div>
 <!-- Bootstrap core JavaScript-->
    <script src="vendor/jquery/jquery.min.js"></script>
    <script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

    <!-- Core plugin JavaScript-->
    <script src="vendor/jquery-easing/jquery.easing.min.js"></script>

    <!-- Custom scripts for all pages-->
    <script src="js/sb-admin.min.js"></script>

</body>
</html>