package com.daoimpl.org;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.connection.org.Connect;
import com.dao.org.DepartmentDao;
import com.pojo.org.Department;

public class DepartmentDaoImpl implements DepartmentDao {

	@Override
	public List<Department> getDepartment() {

		try{
			String sql="select * from department";
			Connection con=Connect.getCon();
			PreparedStatement ps=con.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			List<Department> list=new ArrayList<Department>();
			while(rs.next())
			{
				Department department=new Department();
				department.setId(rs.getInt(1));
				department.setDepartment(rs.getString(2));
				list.add(department);	
			}
			return list;
		}catch(Exception e)
		{
			return null;
		}
		
	}

	@Override
	public boolean setDepartment(String department) {
		
		try{
			String sql="insert into department(department) values(?)";
			Connection con=Connect.getCon();
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, department);
			ps.executeUpdate();
			return true;
		}catch(Exception e)
		{
			return false;
		}
		
	}

	@Override
	public boolean deleteDepartment(int id) {
		try{
			String sql="delete from department where id=?";
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
