<%@ page import="com.pojo.org.*" %>
<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <meta name="description" content="">
  <meta name="author" content="">
  <title>Edit Profile</title>
  <!-- Bootstrap core CSS-->
  <link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
  <!-- Custom fonts for this template-->
  <link href="vendor/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
  <!-- Custom styles for this template-->
  <link href="css/sb-admin.css" rel="stylesheet">
</head>

<body class="bg-dark">
	<%
			Admin admin=(Admin)request.getAttribute("admin");
	%>
  <div class="container">
    <div class="card card-register mx-auto mt-5">
      <div class="card-header">Edit Your Profile</div>
      <div class="card-body">
        <form action="EditProfileAdminRegister" method="post">
          <div class="form-group">
            <div class="form-row">
              <div class="col-md-6">
                <label for="exampleInputName">First name</label>
                <input class="form-control" id="exampleInputName" type="text" value="<%out.println(admin.getFirstname());%>" name="firstname" aria-describedby="nameHelp" placeholder="Enter first name">
              </div>
              <div class="col-md-6">
                <label for="exampleInputLastName">Last name</label>
                <input class="form-control" id="exampleInputLastName" type="text" value="<%out.println(admin.getLastname());%>" name="lastname" aria-describedby="nameHelp" placeholder="Enter last name">
              </div>
             
  				<div class="col-md-6">
            <label for="exampleInputEmail1">Email address</label>
            <input class="form-control" id="exampleInputEmail1" type="email" name="email"  value="<%out.println(admin.getEmail());%>" aria-describedby="emailHelp" placeholder="Enter email">
          </div>
          <div class="col-md-6">
            <label for="exampleInputEmail1">Address</label>
            <input class="form-control" id="exampleInputEmail1" type="text" name="address"  value="<%out.println(admin.getAdress());%>" placeholder="Enter Adress">
          </div>
           <div class="col-md-6">
                <label for="exampleInputLastName">Contact No</label>
                <input class="form-control" id="exampleInputLastName" type="text"  value="<%out.println(admin.getContactno());%>" name="contactno" aria-describedby="nameHelp" placeholder="Enter Contact No">
              </div>
              <div class="col-md-6">
                <label for="exampleInputLastName">Age</label>
                <input class="form-control" id="exampleInputLastName" type="text"  value="<%out.println(admin.getAge());%>" name="age" aria-describedby="nameHelp" placeholder="Enter Contact No">
              </div>
              <div class="col-md-6">
                <label for="exampleInputLastName">Password</label>
                <input class="form-control" id="exampleInputLastName" type="password"  value="<%out.println(admin.getPassword());%>" aria-describedby="nameHelp" placeholder="Enter Password">
              </div>
              <div class="col-md-6">
                <label for="exampleInputLastName">Confirm Password</label>
                <input class="form-control" id="exampleInputLastName" type="password"  value="<%out.println(admin.getPassword());%>" name="password" aria-describedby="nameHelp" placeholder="Enter Password">
              </div>
               <div class="col-md-6">
                <label for="exampleInputLastName">Gender</label>
                <br>
               <input type="radio" name="gender" value="Male" <%
               				if(admin.getGender().equals("Male"))
               				{
               					out.print("checked");
               				}

               %>> Male 
                <input type="radio" name="gender" value="Female" <%
                			if(admin.getGender().equals("Female"))
                			{
                				out.print("checked");
                			}
                %>>Female
            	<br>
              </div>
        
          </div>
          </div>
		   <button type="submit" class="btn btn-primary btn-block">Submit </button>
		   </form>
		   <br>
		   <a href="admin.jsp">
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
		  
		  
		  
		  
		  
		  
		  
		  
		  

