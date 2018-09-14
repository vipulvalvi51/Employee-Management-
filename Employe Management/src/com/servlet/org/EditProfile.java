package com.servlet.org;
import com.dao.org.UserDao;
import com.daoimpl.org.UserDaoImpl;
import com.pojo.org.User;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/EditProfile")
public class EditProfile extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{	
		HttpSession session=request.getSession();
		String email=(String)session.getAttribute("email");
		UserDao userDao=new UserDaoImpl();
		User user = userDao.getUser(email);
		request.setAttribute("user", user);
		RequestDispatcher rd=request.getRequestDispatcher("editprofile.jsp");
		rd.forward(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		doGet(request, response);
	}

}
