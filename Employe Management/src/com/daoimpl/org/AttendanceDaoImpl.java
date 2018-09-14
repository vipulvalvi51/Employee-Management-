package com.daoimpl.org;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import com.connection.org.Connect;
import com.dao.org.AttendanceDao;
import com.pojo.org.Attendance;

public class AttendanceDaoImpl implements AttendanceDao 
{

	@Override
	public boolean addAttendance(List<Attendance> list) 
	{
		try{
			String sql="select date from attendance where date=?";
			Connection con=Connect.getCon();
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setDate(1, list.get(0).getDate());
			ResultSet rs=ps.executeQuery();
			rs.next();
			@SuppressWarnings("unused")
			Date sqldate1 =rs.getDate(1);
		
				for(Attendance attendance:list)
				{
					try{
						String sql2="update attendance set user_id=?,attendance=?,date=?,firstname=?,lastname=? where date=?";
						Connection con2=Connect.getCon();
						PreparedStatement ps2=con2.prepareStatement(sql2);
						ps2.setInt(1, attendance.getUser_id());
						ps2.setString(2, attendance.getAttendance());
						ps2.setDate(3, attendance.getDate());
						ps2.setString(5, attendance.getFirstname());
						ps2.setString(6, attendance.getLastname());
						ps2.setDate(4, attendance.getDate());
						ps2.executeUpdate();
					}catch(Exception e)
					{
						e.printStackTrace();
						return false;
					}
				}
	
		}catch(Exception e1)
		{
				for(Attendance attendance:list)
				{
					try{
						String sql1="insert into attendance(user_id,attendance,date,firstname,lastname) values(?,?,?,?,?)";
						Connection con1=Connect.getCon();
						PreparedStatement ps1=con1.prepareStatement(sql1);
						ps1.setInt(1, attendance.getUser_id());
						ps1.setString(2, attendance.getAttendance());
						ps1.setDate(3, attendance.getDate());
						ps1.setString(4, attendance.getFirstname());
						ps1.setString(5, attendance.getLastname());
						ps1.executeUpdate();
					}catch(Exception e){
						e.printStackTrace();
						return false;
					}
				}
		}
		return true;
}

	@Override
	public boolean deleteAttendance(Date date) {
		try{
			String sql="delete from attendance where date=?";
			Connection con=Connect.getCon();
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setDate(1, date);
			ps.executeUpdate();
		}catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
		return false;
	}

	
}
