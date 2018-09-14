<%@page import="com.pojo.org.*" %>
<%@page import="com.servlet.*" %>
<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <meta name="description" content="">
  <meta name="author" content="">
  <title>Student Profile</title>
  <!-- Bootstrap core CSS-->
  <link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
  <!-- Custom fonts for this template-->
  <link href="vendor/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
  <!-- Custom styles for this template-->
  <link href="css/sb-admin.css" rel="stylesheet">
</head>

<body class="bg-dark">
<%@include file="header.jsp" %>
	<%
			
			User user=(User)request.getAttribute("user");
			String gender =user.getGender();
		  	String male="";
		  	String female="";
			if(gender.equals("Male"))
			{
				male="checked";
			
			}else
			{
				female="checked";
			} 
		
	%>
  <div class="container">
    <div class="card card-register mx-auto mt-5">
      <div class="card-header">Edit Your Profile</div>
      <div class="card-body">
        <form action="EditProfileRegister" method="post">
          <div class="form-group">
            <div class="form-row">
              <div class="col-md-6">
                <label for="exampleInputName">First name</label>
                <input class="form-control" id="exampleInputName" type="text" value="<%out.println(user.getFirstname());%>" name="firstname" aria-describedby="nameHelp" placeholder="Enter first name">
              </div>
              <div class="col-md-6">
                <label for="exampleInputLastName">Last name</label>
                <input class="form-control" id="exampleInputLastName" type="text" value="<%out.println(user.getLastname());%>" name="lastname" aria-describedby="nameHelp" placeholder="Enter last name">
              </div>
             
  				<div class="col-md-6">
            <label for="exampleInputEmail1">Email address</label>
            <input class="form-control" id="exampleInputEmail1" type="email" name="email"  value="<%out.println(user.getEmail());%>" aria-describedby="emailHelp" placeholder="Enter email">
          </div>
          <div class="col-md-6">
            <label for="exampleInputEmail1">Address</label>
            <input class="form-control" id="exampleInputEmail1" type="text" name="adress"  value="<%out.println(user.getAddress());%>" placeholder="Enter Adress">
          </div>
                 <div class="col-md-6">
                <label for="exampleInputLastName">Contact No</label>
                <input class="form-control" id="exampleInputLastName" type="text"  value="<%out.println(user.getContactno());%>" name="contactno" aria-describedby="nameHelp" placeholder="Enter Contact No">
              </div>
               <div class="col-md-6">
                <label for="exampleInputLastName">Gender</label>
                <br>
               <input type="radio" name="gender" value="Male" <%=male%>>Male 
                <input type="radio" name="gender" value="Female" <%=female%>>Female
            	<br>
              </div>
        
          </div>
          </div>
          <div class="form-group">
            <div class="form-row">
              <div class="col-md-6">
                <label for="exampleInputPassword1">Password</label>
                <input class="form-control" id="exampleInputPassword1" type="password" value="<%out.println(user.getPassword());%>" placeholder="Password">
              </div>
              <div class="col-md-6">
                <label for="exampleConfirmPassword">Confirm password</label>
                <input class="form-control" id="exampleConfirmPassword" type="password" name="password" value="<%out.println(user.getPassword());%>" placeholder="Confirm password">
              </div>
            </div>
          </div>
		   <button type="submit" class="btn btn-primary btn-block">Save</button>
		   </form>
		   <br>
		   <a href="index.jsp">
		   <button class="btn btn-primary btn-block">Cancel </button>
		  	</a>
		   </div>
		   </div>
		   </div>
		     </div>
		   
		   <!-- Bootstrap core JavaScript-->
		   <script src="vendor/jquery/jquery.min.js"></script>
		   <script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
		    <!-- Core plugin JavaScript-->
		  <script src="vendor/jquery-easing/jquery.easing.min.js"></script>
		  	</body>
		  </html>
