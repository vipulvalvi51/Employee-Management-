package com.servlet.org;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.org.DepartmentDao;
import com.daoimpl.org.DepartmentDaoImpl;


@WebServlet("/DeleteDepartment")
public class DeleteDepartment extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int id=Integer.parseInt(request.getParameter("id"));
		
		DepartmentDao departmentDao=new DepartmentDaoImpl();
		if(departmentDao.deleteDepartment(id))
		{
			response.sendRedirect("AddDepartment");
		}else
		{
			response.sendRedirect("404.html");
		}
	
	}

}
