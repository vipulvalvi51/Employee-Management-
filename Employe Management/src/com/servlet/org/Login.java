package com.servlet.org;
import com.dao.org.AdminDao;
import com.dao.org.TeacherDao;
import com.dao.org.UserDao;
import com.daoimpl.org.AdminDaoImpl;
import com.daoimpl.org.TeacherDaoImpl;
import com.daoimpl.org.UserDaoImpl;
import com.pojo.org.Admin;
import com.pojo.org.Teacher;
import com.pojo.org.User;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;


@WebServlet("/Login")
public class Login extends HttpServlet
	{
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		HttpSession session = request.getSession();
		System.out.println("");
		Admin admin=new Admin();
		admin.setEmail(email);
		admin.setPassword(password);
		AdminDao adminDao=new AdminDaoImpl();
		Admin admin1 =adminDao.verifyAdmin(admin);
		
		Teacher teacher=new Teacher();
		teacher.setEmail(email);
		teacher.setPassword(password);
		TeacherDao teacherdao=new TeacherDaoImpl();
		Teacher teacher1=teacherdao.verifyTeacher(teacher);
		
		User user =new User();
		user.setEmail(email);
		user.setPassword(password);
		UserDao userDao =new UserDaoImpl();
		User user1 = userDao.verifyUser(user);
		
		 
		if(admin1!=null)
		{
			session.setAttribute("loginType", "Admin");
			session.setAttribute("firstname", admin1.getFirstname());
			session.setAttribute("lastname", admin1.getLastname());
			session.setAttribute("email", admin1.getEmail());
			session.setAttribute("login", true);
			response.sendRedirect("admin.jsp");
		}else if(teacher1!=null)
		{
			session.setAttribute("loginType", "Teacher");
			session.setAttribute("firstname", teacher1.getFirstname());
			session.setAttribute("lastname", teacher1.getLastname());
			session.setAttribute("email", teacher1.getEmail());
			session.setAttribute("login", true);
			response.sendRedirect("index.jsp");
		}
		else if(user1!=null)
		{
			session.setAttribute("loginType", "student");
			session.setAttribute("firstname", user1.getFirstname());
			session.setAttribute("lastname", user1.getLastname());
			session.setAttribute("email", user1.getEmail());
			session.setAttribute("user_id", user1.getId());
			session.setAttribute("login", true);
			response.sendRedirect("index.jsp");
		}
		else 
		{
			response.sendRedirect("login.jsp");
		}
	
	}

}
