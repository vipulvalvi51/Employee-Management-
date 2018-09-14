
<% String email1=(String)session.getAttribute("email");	
	if(email1!=null)
	{
		RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
		rd.forward(request, response);
	}
	else
	{%>
<!DOCTYPE html>
<html lang="en">

  <head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Login</title>

    <!-- Bootstrap core CSS-->
    <link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom fonts for this template-->
    <link href="vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">

    <!-- Custom styles for this template-->
    <link href="css/sb-admin.css" rel="stylesheet">

  </head>

  <body class="bg-dark">
	<%@include file="loginheader.jsp" %>
    <div class="container">
      <div class="card card-login mx-auto mt-5">
      <div class="card-header"><h6> Login</h6></div>
        <div class="card-body">
          <form action="Login" method="post">
          <p>Email</p>
            <div class="form-group">
              <div class="form-label-group">
                <input type="email" name="email" id="inputEmail" class="form-control"  required="required" autofocus="autofocus">
                <label for="inputEmail">Email address</label>
              </div>
            </div>
            <p>Password</p>
            <div class="form-group">
              <div class="form-label-group">
                <input type="password" name="password" id="inputPassword" class="form-control" required="required">
                <label for="inputPassword">Password</label>
              </div>
            </div>
         
          
            <button  type="submit" class="btn btn-primary btn-block">Login</button>
          </form>
          <div class="text-center">
            <a class="d-block small" href="forgot-password.html">Forgot Password?</a>
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
<%}%>