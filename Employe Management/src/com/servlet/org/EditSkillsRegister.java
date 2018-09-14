package com.servlet.org;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.org.SkillsDao;
import com.daoimpl.org.SkillsDaoImpl;
import com.pojo.org.Skills;

@WebServlet("/EditSkillsRegister")
public class EditSkillsRegister extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		HttpSession session=request.getSession();
		int user_id=(int)session.getAttribute("user_id");
		Skills skills=new Skills();
		
		skills.setId(skills.getId());
		skills.setUser_id(user_id);
		String skills1=request.getParameter("skills");
		if(!skills1.equals(""))
		{
			char ch=skills1.charAt(0);
			if(ch==' ')
			{
				response.sendRedirect("SkillsEdit");
			}
			else
			{
				skills.setSkill(skills1);
				SkillsDao skillsDao=new SkillsDaoImpl();
				if(skillsDao.setSkillsByUser_id(skills))
				{
					response.sendRedirect("SkillsEdit");
				}else
				{
				response.sendRedirect("404.html");
				}
			}
	
		}else
		{
			response.sendRedirect("SkillsEdit");
		}
	}

}
