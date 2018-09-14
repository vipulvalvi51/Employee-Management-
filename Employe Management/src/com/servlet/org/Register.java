package com.servlet.org;
import com.dao.org.UserDao;
import com.daoimpl.org.UserDaoImpl;
import com.pojo.org.User;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		String firstname=request.getParameter("firstname");
		String lastname=request.getParameter("lastname");
		String address=request.getParameter("adress");
		
		String contactno=request.getParameter("contact");
		String gender=request.getParameter("gender");

		String email=request.getParameter("email");
		String password=request.getParameter("password");

		 java.util.Date utildate = new java.util.Date();
		 java.sql.Date sqldate = new java.sql.Date(utildate.getTime());
		User user=new User();
		user.setFirstname(firstname);
		user.setLastname(lastname);
		user.setAddress(address);
		user.setContactno(contactno);
		user.setEmail(email);
		user.setGender(gender);
		user.setJoin_date(sqldate);
		user.setPassword(password);
		UserDao userDao=new UserDaoImpl();
		if(userDao.addUser(user)){
			response.sendRedirect("login.jsp");
		}else{
			PrintWriter out = response.getWriter();
			out.println("Invalid");
		}
		
	}

}
