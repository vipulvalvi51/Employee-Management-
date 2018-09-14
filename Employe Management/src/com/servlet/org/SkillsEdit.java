package com.servlet.org;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.org.SkillsDao;
import com.dao.org.UserDao;
import com.daoimpl.org.SkillsDaoImpl;
import com.daoimpl.org.UserDaoImpl;
import com.pojo.org.Skills;


@WebServlet("/SkillsEdit")
public class SkillsEdit extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		HttpSession session= request.getSession();
		String email =(String)session.getAttribute("email");
		UserDao userDao=new UserDaoImpl();
		SkillsDao skillsDao=new SkillsDaoImpl();
		List<Skills> list= skillsDao.getSkillsByUser_id(userDao.getUser(email).getId());
		
		request.setAttribute("list",list);
		RequestDispatcher rd=request.getRequestDispatcher("editskill.jsp");
		rd.forward(request, response);

			
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
		doGet(request, response);
		
			}

}
