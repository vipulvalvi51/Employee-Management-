package com.daoimpl.org;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.connection.org.Connect;
import com.dao.org.EmployeeDao;
import com.pojo.org.Employee;

public class EmployeeDaoImpl implements EmployeeDao {

	@Override
	public boolean registerEmployee(Employee employee) {
		try{
			String sql="insert into employee(firstname,lastname,adress,email,contact,gender,password,department_id) values(?,?,?,?,?,?,?,?)";
			Connection con=Connect.getCon();
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, employee.getFirstname());
			ps.setString(2, employee.getLastname());
			ps.setString(3, employee.getAdress());
			ps.setString(4, employee.getEmail());
			ps.setString(5, employee.getContact());
			ps.setString(6, employee.getGender());
			ps.setString(7, employee.getPassword());
			ps.setInt(8, employee.getDepartment());
			ps.executeUpdate();
			return true;
		}catch(Exception e)
		{
			return false;
		}
	}

	@Override
	public List<Employee> getEmployee() {
		try{
			String sql="select * from employee";
			Connection con=Connect.getCon();
			PreparedStatement ps=con.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			List <Employee> list=new ArrayList<Employee>();
			while(rs.next())
			{
				Employee employee=new Employee();
				employee.setEid(rs.getInt(1));
				employee.setFirstname(rs.getString(2));
				employee.setLastname(rs.getString(3));
				employee.setEmail(rs.getString(4));
				employee.setAdress(rs.getString(5));
				employee.setContact(rs.getString(6));
				employee.setGender(rs.getString(7));
				employee.setPassword(rs.getString(8));
				employee.setDepartment(rs.getInt(9));
				list.add(employee);
			}
			return list;
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
		
	}
}
