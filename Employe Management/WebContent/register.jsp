
<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <meta name="description" content="">
  <meta name="author" content="">
  <title>Register</title>
  <!-- Bootstrap core CSS-->
  <link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
  <!-- Custom fonts for this template-->
  <link href="vendor/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
  <!-- Custom styles for this template-->
  <link href="css/sb-admin.css" rel="stylesheet">
</head>

<body class="bg-dark">
<%@include file="loginheader.jsp" %>
  <div class="container">
    <div class="card card-register mx-auto mt-5">
      <div class="card-header">Register an Account</div>
      <div class="card-body">
        <form action="Register" method="post">
          <div class="form-group">
            <div class="form-row">
              <div class="col-md-6">
                <label for="exampleInputName">First name</label>
                <input class="form-control" id="exampleInputName" type="text" name="firstname" aria-describedby="nameHelp" placeholder="Enter first name">
              </div>
              <div class="col-md-6">
                <label for="exampleInputLastName">Last name</label>
                <input class="form-control" id="exampleInputLastName" type="text" name="lastname" aria-describedby="nameHelp" placeholder="Enter last name">
              </div>
             
  				<div class="col-md-6">
            <label for="exampleInputEmail1">Email address</label>
            <input class="form-control" id="exampleInputEmail1" type="email" name="email" aria-describedby="emailHelp" placeholder="Enter email">
          </div>
          <div class="col-md-6">
            <label for="exampleInputEmail1">Address</label>
            <input class="form-control" id="exampleInputEmail1" type="text" name="adress" placeholder="Enter Adress">
          </div>
           <div class="col-md-6">
                <label for="exampleInputLastName">Contact No</label>
                <input class="form-control" id="exampleInputLastName" type="text" name="contact" aria-describedby="nameHelp" placeholder="Enter Contact No">
              </div>
               <div class="col-md-6">
                <label for="exampleInputLastName">Gender</label>
                <br>
               <input type="radio" name="gender" value="Male"> Male 
                <input type="radio" name="gender" value="Female">Female
            	<br>
              </div>
          </div>
          </div>
          <div class="form-group">
            <div class="form-row">
              <div class="col-md-6">
                <label for="exampleInputPassword1">Password</label>
                <input class="form-control" id="exampleInputPassword1" type="password" placeholder="Password">
              </div>
              <div class="col-md-6">
                <label for="exampleConfirmPassword">Confirm password</label>
                <input class="form-control" id="exampleConfirmPassword" type="password" name="password" placeholder="Confirm password">
              </div>
            </div>
          </div>
          <script type="text/javascript">
          	function myFunction()
          	{
          		alert("Register Successfull!!");
          	}
          </script>
		   <button onclick="myFunction()" type="submit" class="btn btn-primary btn-block">Register </button>
		   </form>
		    <div class="text-center">
		   <a class="d-block small mt-3" href="login.jsp">Allredy Account? Login</a>
		   
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
		  
		  
		  
		  
		  
		  
		  
		  
		  

