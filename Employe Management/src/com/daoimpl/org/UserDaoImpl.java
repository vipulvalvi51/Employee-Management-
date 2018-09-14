package com.daoimpl.org;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.connection.org.Connect;
import com.dao.org.UserDao;
import com.pojo.org.User;

public class UserDaoImpl implements UserDao{

	@Override
	public boolean addUser(User user) {
		Connection con =Connect.getCon();
		try
		{
			String q="insert into user(firstname,lastname,email,address,contactno,gender,password,join_date) values(?,?,?,?,?,?,?,?)";
			PreparedStatement ps1= con.prepareStatement(q);
			ps1.setString(1, user.getFirstname());
			ps1.setString(2, user.getLastname());
			ps1.setString(3, user.getEmail());
			ps1.setString(4, user.getAddress());
			ps1.setString(5, user.getContactno());
			ps1.setString(6, user.getGender());
			ps1.setString(7, user.getPassword());
			ps1.setDate(8, user.getJoin_date());
			

			if(ps1.executeUpdate()>0){
				return true;
			}else{
				return false;
			}
		}catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
		
	}

	@Override
	public List<User> getListOfUsers() {
		String sql="select * from user";
		List<User> list=null;
		try{
			Connection con =Connect.getCon();
			PreparedStatement ps=con.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			list = new ArrayList<User>();
			
			while(rs.next())
			{	User user=new User();
				user.setId(rs.getInt(1));
				user.setFirstname(rs.getString(2));
				user.setLastname(rs.getString(3));
				user.setEmail(rs.getString(4));
				user.setContactno(rs.getString(6));
				user.setAddress(rs.getString(7));
				user.setJoin_date(rs.getDate(8));
				user.setGender(rs.getString(9));
				list.add(user);
			}
			return list;
		}catch(Exception e)
		{
			e.printStackTrace();
			return null;
		}
		
	}

	@Override
	public User getUser(String email) {
		Connection con=Connect.getCon();
		String sql1="select * from user where email=?";
		PreparedStatement ps1;
		User user=null;
		try {
			ps1 = con.prepareStatement(sql1);
			ps1.setString(1 ,email);
			ResultSet rs= ps1.executeQuery();
			rs.next();
			user=new User();
			user.setId(rs.getInt(1));
			user.setFirstname(rs.getString(2));
			user.setLastname(rs.getString(3));
			user.setEmail(rs.getString(4));
			user.setPassword(rs.getString(5));
			user.setContactno(rs.getString(6));
			user.setAddress(rs.getString(7));
			user.setJoin_date(rs.getDate(8));
			user.setGender(rs.getString(9));
			return user;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
}

	@Override
	public boolean editUser(User user,String email) {
		
		
		try{
			String sql="update user set firstname=?,lastname=?,address=?,contactno=?,gender=?,email=?,password=? where email=?";
			Connection con = Connect.getCon();
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, user.getFirstname());
			ps.setString(2, user.getLastname());
			ps.setString(3, user.getAddress());
			ps.setString(4, user.getContactno());
			ps.setString(5, user.getGender());
			ps.setString(6, user.getEmail());
			ps.setString(7, user.getPassword());
			ps.setString(8, email);
			ps.executeUpdate();
			return true;
		}catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
	
	}

	@Override
	public User verifyUser(User user) {
		try{
			Connection con =Connect.getCon();
			String q="select firstname,lastname,email,id from user where email=? and password=?" ;
			PreparedStatement ps= con.prepareStatement(q);
			ps.setString(1, user.getEmail());
			ps.setString(2, user.getPassword());
			ResultSet rs = ps.executeQuery();
			rs.next();
			User user1 =new User();
			user1.setFirstname(rs.getString(1));
			user1.setLastname(rs.getString(2));
			user1.setEmail(rs.getString(3));
			user1.setId(rs.getInt(4));
			return user1;
		}catch(Exception e)
		{
			return null;
		}

	}
	
}