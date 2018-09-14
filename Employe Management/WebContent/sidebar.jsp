 
 <%
 String loginType=(String)session.getAttribute("loginType");
 %>
  <!-- Sidebar -->
      <ul class="sidebar navbar-nav">
        <li class="nav-item">
          <a class="nav-link" href="index.html">
            <i class="fas fa-fw fa-tachometer-alt"></i>
            <span>Dashboard</span>
          </a>
        </li>
        <li class="nav-item dropdown">
          <a class="nav-link dropdown-toggle" href="#" id="pagesDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
            <i class="fas fa-fw fa-folder"></i>
            <span>Pages</span>
          </a>
          <div class="dropdown-menu" aria-labelledby="pagesDropdown">
            <h6 class="dropdown-header">Login Screens:</h6>
            <a class="dropdown-item" href="login.html">Login</a>
            <a class="dropdown-item" href="register.html">Register</a>
            <a class="dropdown-item" href="forgot-password.html">Forgot Password</a>
            <div class="dropdown-divider"></div>
            <h6 class="dropdown-header">Other Pages:</h6>
            <a class="dropdown-item" href="404.html">404 Page</a>
            <a class="dropdown-item" href="blank.html">Blank Page</a>
          </div>
        </li>
        <li class="nav-item active">
          <a class="nav-link" href="SkillsEdit">
            <i class="fa fa-user"></i>
            <span>Skills</span>
            </a>
        </li>
        <%        
        if(loginType.equals("student"))
        {%>
    
         <li class="nav-item dropdown">
          <a class="nav-link dropdown-toggle" href="#" id="pagesDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
            <i class="fa fa-user"></i>
            <span>Examination</span>
            </a>
             <div class="dropdown-menu" aria-labelledby="pagesDropdown">
            <h6 class="dropdown-header">Exam Form</h6>
            <a class="dropdown-item" href="#">Fill Exam Form</a>
            <a class="dropdown-item" href="#">Forgot Password</a>
            <div class="dropdown-divider"></div>
            <h6 class="dropdown-header">Results</h6>
            <a class="dropdown-item" href="#">Results</a>
            <a class="dropdown-item" href="blank.html">Blank Page</a>
          </div>
        </li>
        <%}else
        {%> 
         <li class="nav-item dropdown">
          <a class="nav-link dropdown-toggle" href="#" id="pagesDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
            <i class="fa fa-user"></i>
            <span>Student Attendance</span>
            </a>
             <div class="dropdown-menu" aria-labelledby="pagesDropdown">
            <h6 class="dropdown-header">Examination</h6>
            <a class="dropdown-item" href="#">Add question paper</a>           
            <a class="dropdown-item" href="#">Fill Exam Form</a>
            <a class="dropdown-item" href="#">Forgot Password</a>
            <div class="dropdown-divider"></div>
            <h6 class="dropdown-header">Results</h6>
            <a class="dropdown-item" href="#">Results</a>
            <a class="dropdown-item" href="blank.html">Blank Page</a>
          </div>
        </li>         
         <li class="nav-item dropdown">
          <a class="nav-link dropdown-toggle" href="#" id="pagesDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
            <i class="fa fa-user"></i>
            <span>Examination</span>
            </a>
             <div class="dropdown-menu" aria-labelledby="pagesDropdown">
            <h6 class="dropdown-header">Examination</h6>
            <a class="dropdown-item" href="#">Add quation paper</a>           
            <a class="dropdown-item" href="#">Fill Exam Form</a>
            <a class="dropdown-item" href="#">Forgot Password</a>
            <div class="dropdown-divider"></div>
            <h6 class="dropdown-header">Results</h6>
            <a class="dropdown-item" href="#">Results</a>
            <a class="dropdown-item" href="blank.html">Blank Page</a>
          </div>
        </li>       		
      <%}%> 
        	       
      </ul>

      