package com.servlet.org;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.org.EmployeeDao;
import com.daoimpl.org.EmployeeDaoImpl;
import com.pojo.org.Employee;

/**
 * Servlet implementation class RegisterEmployee
 */
@WebServlet("/RegisterEmployee")
public class RegisterEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Employee employee=new Employee();
		
		employee.setFirstname(request.getParameter("firstname"));
		employee.setLastname(request.getParameter("lastname"));
		employee.setEmail(request.getParameter("email"));
		employee.setPassword(request.getParameter("password"));
		employee.setAdress(request.getParameter("adress"));
		employee.setContact(request.getParameter("contact"));
		employee.setGender(request.getParameter("gender"));
		employee.setDepartment(Integer.parseInt(request.getParameter("department")));
		EmployeeDao employeeDao=new EmployeeDaoImpl();
		if(employeeDao.registerEmployee(employee))
		{
			response.sendRedirect("admin.jsp");
		}
		else
		{
			response.sendRedirect("404.html");
		}
		
	}

}
