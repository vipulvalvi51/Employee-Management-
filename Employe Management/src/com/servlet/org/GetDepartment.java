package com.servlet.org;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.org.DepartmentDao;
import com.daoimpl.org.DepartmentDaoImpl;
import com.pojo.org.Department;

/**
 * Servlet implementation class EmployeeRegister
 */
@WebServlet("/GetDepartment")
public class GetDepartment extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		DepartmentDao departmentDao=new DepartmentDaoImpl();
		
		List<Department> list=departmentDao.getDepartment();
		if(list!=null)
		{
			request.setAttribute("list", list);
			RequestDispatcher rd=request.getRequestDispatcher("employeeregister.jsp");
			rd.forward(request, response);
		}else
		{
			response.sendRedirect("admin.jsp");
		}
		
	}

}
