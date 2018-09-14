package com.servlet.org;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.connection.org.Connect;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.pojo.org.Classes;

@WebServlet("/GetData")
public class GetData extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		int id= Integer.parseInt(request.getParameter("datapost"));
		
		try{
			String sql="select * from classes where mid=?";
			Connection con=Connect.getCon();
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(1, id);
			ResultSet rs=ps.executeQuery();
			List<Classes> list=new ArrayList<Classes>();
			while(rs.next())
			{
				Classes clasess=new Classes();
				clasess.setId(rs.getInt(1));
				clasess.setClasses(rs.getString(2));
				clasess.setMid(rs.getInt(3));
				list.add(clasess);
			}
			ObjectMapper mapper=new ObjectMapper();
			String Json=mapper.writeValueAsString(list);
			out.print(Json);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}