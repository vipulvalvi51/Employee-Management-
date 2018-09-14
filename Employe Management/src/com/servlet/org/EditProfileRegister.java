package com.servlet.org;
import com.dao.org.UserDao;
import com.daoimpl.org.UserDaoImpl;
import com.pojo.org.User;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/EditProfileRegister")
public class EditProfileRegister extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		HttpSession session=request.getSession();
		String email=(String)session.getAttribute("email");
		User user=new User();
		
		user.setFirstname(request.getParameter("firstname"));
		user.setLastname(request.getParameter("lastname"));
		user.setAddress(request.getParameter("adress"));
		user.setContactno(request.getParameter("contactno"));
		user.setGender(request.getParameter("gender"));
		user.setEmail(request.getParameter("email"));
		user.setPassword(request.getParameter("password"));
		
		UserDao userDao=new UserDaoImpl();
		if(userDao.editUser(user,email))
		{
			session.setAttribute("email", user.getEmail());
			response.sendRedirect("EditProfile");
		}
		else
		{
			response.sendRedirect("Editprofile");
		}
		
	}

}
