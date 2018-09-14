package com.servlet.org;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.org.TeacherDao;
import com.daoimpl.org.TeacherDaoImpl;
import com.pojo.org.Teacher;


@WebServlet("/TeacherLogin")
public class TeacherLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		
		Teacher teacher=new Teacher();
		teacher.setEmail(email);
		teacher.setPassword(password);
		TeacherDao teacherdao = new TeacherDaoImpl();
		Teacher teacher1= teacherdao.verifyTeacher(teacher);
		HttpSession session=request.getSession();
		if(teacher1!=null)
		{
			session.setAttribute("email", email);
			session.setAttribute("login", true);
			response.sendRedirect("index.jsp");
		}
		else
		{
			response.sendRedirect("teacherlogin.jsp");
		}
	}

}
