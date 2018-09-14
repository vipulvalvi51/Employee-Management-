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


@WebServlet("/EditProfileAdmin")
public class EditProfileAdmin extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		HttpSession session=request.getSession();
		String email=(String)session.getAttribute("email");
		AdminDao adminDao =new AdminDaoImpl();
		Admin admin1=adminDao.getAdmin(email);
		if(admin1!=null)
		{
			request.setAttribute("admin", admin1);
			RequestDispatcher rd=request.getRequestDispatcher("editprofileadmin.jsp");
			rd.forward(request, response);
		}
		else
		{
			response.sendRedirect("editprofileadmin.jsp");
		}
	}

}
