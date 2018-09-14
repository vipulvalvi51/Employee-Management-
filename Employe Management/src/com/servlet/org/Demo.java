package com.servlet.org;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.connection.org.Connect;
import com.pojo.org.Degree;


@WebServlet("/Demo")
public class Demo extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try{
			String q="select * from degree";
			Connection con=Connect.getCon();
			PreparedStatement ps=con.prepareStatement(q);
			ResultSet rs=ps.executeQuery();
			List<Degree> list=new ArrayList<Degree>();
			while(rs.next())
			{
				Degree degree=new Degree();
				degree.setMid(rs.getInt(1));
				degree.setDegree(rs.getString(2));
				list.add(degree);
			}
			request.setAttribute("list", list);
			RequestDispatcher rd=request.getRequestDispatcher("demo.jsp");
			rd.forward(request, response);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
