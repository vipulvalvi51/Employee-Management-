package com.servlet.org;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.org.SkillsDao;
import com.daoimpl.org.SkillsDaoImpl;

@WebServlet("/DeleteSkill")
public class DeleteSkill extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		int id=Integer.parseInt(request.getParameter("id"));
		SkillsDao skillsdao=new SkillsDaoImpl();
		if(skillsdao.deleteSkills(id))
		{
			response.sendRedirect("SkillsEdit");
		}else
		{
			response.sendRedirect("SkillsEdit");
		}
		
	}

}
