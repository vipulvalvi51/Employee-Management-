package com.daoimpl.org;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.connection.org.Connect;
import com.dao.org.TeacherDao;
import com.pojo.org.Teacher;

public class TeacherDaoImpl implements TeacherDao {

	@Override
	public boolean addTeacher(Teacher teacher) {
		try
		{
			String sql="insert into teacher(firstname,lastname,email,department,password,mono,date,adress) values(?,?,?,?,?,?,?,?)";
			Connection con=Connect.getCon();
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, teacher.getFirstname());
			ps.setString(2, teacher.getLastname());
			ps.setString(3, teacher.getEmail());
			ps.setString(4, teacher.getDepartment());
			ps.setString(5, teacher.getPassword());
			ps.setString(6, teacher.getMono());
			ps.setDate(7, teacher.getDate());
			ps.setString(8, teacher.getAddress());
			ps.executeUpdate();
			return true;
		}catch(Exception e)
		{
			return false;
		}
	}

	@Override
	public Teacher verifyTeacher(Teacher teacher) {
		
		try
		{
			String sql="select * from teacher where email=? and password=?";
			Connection con=Connect.getCon();
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, teacher.getEmail());
			ps.setString(2, teacher.getPassword());
			ResultSet rs=ps.executeQuery();
			rs.next();
			Teacher teacher1=new Teacher();
			teacher1.setId(rs.getInt(1));
			teacher1.setEmail(rs.getString(2));
			teacher1.setDepartment(rs.getString(3));
			teacher1.setPassword(rs.getString(4));
			teacher1.setMono(rs.getString(5));
			teacher1.setDate(rs.getDate(6));
			teacher1.setAddress(rs.getString(7));
			teacher1.setFirstname(rs.getString(8));
			teacher1.setLastname(rs.getString(9));
			return teacher1;
		}catch(Exception e)
		{
			return null;
		}	
		
	}

}
