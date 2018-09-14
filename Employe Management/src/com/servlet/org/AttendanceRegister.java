package com.servlet.org;

import java.io.IOException;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.org.AttendanceDao;
import com.dao.org.UserDao;
import com.daoimpl.org.AttendanceDaoImpl;
import com.daoimpl.org.UserDaoImpl;
import com.pojo.org.Attendance;
import com.pojo.org.User;

@WebServlet("/AttendanceRegister")
public class AttendanceRegister extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		UserDao userDao=new UserDaoImpl();
		List<User> list=userDao.getListOfUsers();
		
		List<Attendance> list1=new ArrayList<Attendance>();
		String date=request.getParameter("date");
		java.sql.Date sqldate=Date.valueOf(date);		
		for(int i=0;i<list.size();i++)
		{
			Attendance attendance =new Attendance();
			attendance.setUser_id(list.get(i).getId());
			attendance.setAttendance(request.getParameter(""+list.get(i).getId()));
			attendance.setDate(sqldate);
			attendance.setFirstname(list.get(i).getFirstname());
			attendance.setLastname(list.get(i).getLastname());
			list1.add(attendance);
		}
		
		AttendanceDao attendanceDao=new AttendanceDaoImpl();
		
		if(attendanceDao.addAttendance(list1))
		{
			response.sendRedirect("admin.jsp");
		}
		else
		{
			attendanceDao.deleteAttendance(sqldate);
			response.sendRedirect("404.html");
		}
		
	}

}
