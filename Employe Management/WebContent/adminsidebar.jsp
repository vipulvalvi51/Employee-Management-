<div id="wrapper">

      <!-- Sidebar -->
      <ul class="sidebar navbar-nav">
        <li class="nav-item active">
          <a class="nav-link" href="index.jsp">
            <i class="fas fa-fw fa-tachometer-alt"></i>
            <span>Dashboard</span>
          </a>
        </li>
        <li class="nav-item dropdown">
          <a class="nav-link dropdown-toggle" href="#" id="pagesDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
            <i class="fa fa-user fa-fw"></i>
            <span>Employee</span>
          </a>
          <div class="dropdown-menu" aria-labelledby="pagesDropdown">
          
            <h6 class="dropdown-header">Employee Menu</h6>
            <a class="dropdown-item" href="GetEmployeeAttendance">Employee Attendance</a>
             <a class="dropdown-item" href="#">Salary Sleep</a>
             <a class="dropdown-item" href="AddDepartment">Add Department</a>
            <a class="dropdown-item" href="GetDepartment">Register Employee</a>
            
          </div>
        </li>
        <li class="nav-item dropdown">
          <a class="nav-link dropdown-toggle" href="#" id="pagesDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
            <i class="fa fa-user fa-fw"></i>
            <span>Student</span>
          </a>
          <div class="dropdown-menu" aria-labelledby="pagesDropdown">
            <h6 class="dropdown-header">Student Menu</h6>
            <a class="dropdown-item" href="GetListOfUser?listType=attendanceList">Student Attendance</a>            
            <a class="dropdown-item" href="GetListOfUser?listType=studentList">Student List</a>
            
          </div>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="charts.html">
            <i class="fas fa-fw fa-chart-area"></i>
            <span>Charts</span></a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="#">
            <i class="fas fa-fw fa-table"></i>
            <span>Employee List</span></a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="GetListOfUser">
            <i class="fas fa-fw fa-table"></i>
            <span>Student List</span></a>
        </li>
      </ul>