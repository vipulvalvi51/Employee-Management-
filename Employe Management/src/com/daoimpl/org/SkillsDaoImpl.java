package com.daoimpl.org;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.connection.org.Connect;
import com.dao.org.SkillsDao;
import com.pojo.org.Skills;

public class SkillsDaoImpl implements SkillsDao {
	
	private Connection con=null;

	@Override
	public List<Skills> getSkillsByUser_id(int user_id) {
		con=Connect.getCon();
		String sql="select * from Skills where user_id=?";
		PreparedStatement ps;
		try {
			ps = con.prepareStatement(sql);
			ps.setInt(1, user_id);
			ResultSet rs=ps.executeQuery();
			List<Skills> list=new ArrayList<Skills>();
			while(rs.next())
			{
				Skills skills=new Skills();
				skills.setId(rs.getInt(1));
				skills.setUser_id(rs.getInt(2));
				skills.setSkill(rs.getString(3));
				list.add(skills);
			}
			return list;
		} catch (SQLException e) {
			return null;
			
		}
	}

	@Override
	public boolean setSkillsByUser_id(Skills skills) {
		try{
			String sql="insert into skills(user_id,skill_name) values(?,?)";
			Connection con=Connect.getCon();
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(1, skills.getUser_id());
			ps.setString(2, skills.getSkill());
			ps.executeUpdate();
			return true;
		}catch(Exception e)
		{
			return false;
		}
		
	}

	@Override
	public boolean deleteSkills(int id) {
		try
		{
			String sql="delete from skills where id=?";
			Connection con=Connect.getCon();
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(1, id);
			ps.executeUpdate();
			return true;
		}catch(Exception e)
		{
			return false;
		}
	}	
}