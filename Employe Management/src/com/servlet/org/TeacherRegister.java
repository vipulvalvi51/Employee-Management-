package com.servlet.org;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.org.TeacherDao;
import com.daoimpl.org.TeacherDaoImpl;
import com.pojo.org.Teacher;


@WebServlet("/TeacherRegister")
public class TeacherRegister extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		Teacher teacher=new Teacher();
		teacher.setFirstname(request.getParameter("firstname"));
		teacher.setLastname(request.getParameter("lastname"));
		teacher.setEmail(request.getParameter("email"));
		teacher.setDepartment(request.getParameter("department"));
		teacher.setPassword(request.getParameter("password"));
		teacher.setMono(request.getParameter("contactno"));
		teacher.setGender(request.getParameter("gender"));
		teacher.setAddress(request.getParameter("address"));
		 java.util.Date utildate = new java.util.Date();
		 java.sql.Date sqldate = new java.sql.Date(utildate.getTime());
		 teacher.setDate(sqldate);
		 TeacherDao user=new TeacherDaoImpl();
		 if(user.addTeacher(teacher))
		 {
			 response.sendRedirect("login.jsp");
		 }
		 else{
			 response.sendRedirect("teacherregister.jsp");
		 }
		
	}

}
