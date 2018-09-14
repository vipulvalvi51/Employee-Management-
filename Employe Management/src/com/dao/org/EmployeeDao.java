package com.dao.org;

import java.util.List;

import com.pojo.org.Employee;

public interface EmployeeDao {

	public boolean registerEmployee(Employee employee);
	public List<Employee> getEmployee();
}
