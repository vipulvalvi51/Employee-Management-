package com.daoimpl.org;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.connection.org.Connect;
import com.dao.org.AdminDao;
import com.pojo.org.Admin;

public class AdminDaoImpl implements AdminDao {

	@Override
	public Admin verifyAdmin(Admin admin) {
		
		try{
			String url="select firstname,lastname,email from admin where email=? and password=?";
			Connection con1=Connect.getCon();
			PreparedStatement ps1=con1.prepareStatement(url);
			ps1.setString(1, admin.getEmail());
			ps1.setString(2, admin.getPassword());
			ResultSet rs1 =ps1.executeQuery();
			rs1.next();
			Admin admin1=new Admin();
			 admin1.setFirstname( rs1.getString(1));
			 admin1.setLastname(rs1.getString(2));
			 admin1.setEmail(rs1.getString(3));
			 return admin1;
		}catch(Exception e)
		{
			return null;
		}
	}
	@Override
	public Admin getAdmin(String email) {
		try
		{
			String sql="select * from admin where email=?";
			Connection con=Connect.getCon();
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1 , email);
			ResultSet rs=ps.executeQuery();
			rs.next();
			Admin admin=new Admin();
			admin.setId(rs.getInt(1));
			admin.setFirstname(rs.getString(2));
			admin.setLastname(rs.getString(3));
			admin.setEmail(rs.getString(4));
			admin.setPassword(rs.getString(5));
			admin.setAge(rs.getInt(6));
			admin.setContactno(rs.getLong(7));
			admin.setGender(rs.getString(8));
			admin.setAdress(rs.getString(9));
			return admin;	
		}catch(Exception e)
		{
			return null;
		}
		
	}
	@Override
	public boolean editAdmin(Admin admin, String email) {
		try{
			System.out.println(email);
			System.out.println(admin);
			String sql="update admin set firstname=?,lastname=?,email=?,password=?,age=?,contactno=?,gender=?,address=? where email=?";
			Connection con=Connect.getCon();
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, admin.getFirstname());
			ps.setString(2, admin.getLastname());
			ps.setString(3, admin.getEmail());
			ps.setString(4, admin.getPassword());
			ps.setInt(5, admin.getAge());
			ps.setLong(6, admin.getContactno());
			ps.setString(7, admin.getGender());
			ps.setString(8, admin.getAdress());
			ps.setString(9, email);
			ps.executeUpdate();
			return true;
		}catch(Exception e)
		{
			return false;

		}
	}	
}
