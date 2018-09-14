package com.servlet.org;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.org.DepartmentDao;
import com.daoimpl.org.DepartmentDaoImpl;

/**
 * Servlet implementation class EditDepartmentRegister
 */
@WebServlet("/EditDepartmentRegister")
public class EditDepartmentRegister extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		DepartmentDao departmentDao=new DepartmentDaoImpl();
		String department=request.getParameter("department");
		
		if(!department.equals(""))
		{
			char ch=department.charAt(0);
			if(ch==' ')
			{
				response.sendRedirect("AddDepartment");
			}
			else
			{
				if(departmentDao.setDepartment(department))
				{
					response.sendRedirect("AddDepartment");
				}
				else
				{
					response.sendRedirect("404.html");
				}
			}
			
		}else
		{
			response.sendRedirect("AddDepartment");
		}
	}

}
