package com.servlet.org;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.org.EmployeeDao;
import com.daoimpl.org.EmployeeDaoImpl;
import com.pojo.org.Employee;


@WebServlet("/GetEmployeeAttendance")
public class GetEmployeeAttendance extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		EmployeeDao employeeDao=new EmployeeDaoImpl();
		List<Employee> list=employeeDao.getEmployee();
		request.setAttribute("list", list);
		RequestDispatcher rd=request.getRequestDispatcher("employeeattendance.jsp");
		rd.forward(request, response);
		
	}

}
