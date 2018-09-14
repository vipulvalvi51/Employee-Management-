package com.servlet.org;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.org.AdminDao;
import com.daoimpl.org.AdminDaoImpl;
import com.pojo.org.Admin;

@WebServlet("/EditProfileAdminRegister")
public class EditProfileAdminRegister extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		HttpSession session=request.getSession();
		String email=(String)session.getAttribute("email");
		Admin admin= new Admin();
		admin.setFirstname(request.getParameter("firstname"));
		admin.setLastname(request.getParameter("lastname"));
		admin.setAdress(request.getParameter("address"));
		admin.setGender(request.getParameter("gender"));
		admin.setContactno(Long.parseLong(request.getParameter("contactno")));
		admin.setAge(Integer.parseInt(request.getParameter("age")));
		admin.setPassword(request.getParameter("password"));
		admin.setEmail(request.getParameter("email"));
		
		AdminDao adminDao=new  AdminDaoImpl();
		
		if(adminDao.editAdmin(admin,email))
		{
			request.setAttribute("admin", admin);
			RequestDispatcher rd=request.getRequestDispatcher("editprofileadmin.jsp");
			rd.forward(request, response);
		}
		else
		{
			response.sendRedirect("editprofileadmin.jsp");
		}
		
	}

}
