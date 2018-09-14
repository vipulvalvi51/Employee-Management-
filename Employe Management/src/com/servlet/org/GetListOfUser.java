package com.servlet.org;
import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.org.UserDao;
import com.daoimpl.org.UserDaoImpl;
import com.pojo.org.User;


@WebServlet("/GetListOfUser")
public class GetListOfUser extends HttpServlet
{
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String listType=request.getParameter("listType");
		if(listType.equals("studentList"))
		{
			UserDao userDao=new UserDaoImpl();
			List<User> list=userDao.getListOfUsers();
			request.setAttribute("list", list);
			RequestDispatcher rd =request.getRequestDispatcher("user.jsp");
			rd.forward(request,response);
		}else if(listType.equals("attendanceList"))
			{
			UserDao userDao=new UserDaoImpl();
			List<User> list=userDao.getListOfUsers();
			request.setAttribute("list", list);
			RequestDispatcher rd =request.getRequestDispatcher("attendance.jsp");
			rd.forward(request,response);
			}
	}

}
