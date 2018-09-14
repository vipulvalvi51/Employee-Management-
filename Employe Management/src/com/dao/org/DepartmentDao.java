package com.dao.org;

import java.util.List;
import com.pojo.org.Department;

public interface DepartmentDao {

	public boolean deleteDepartment(int id);
	public boolean setDepartment(String department);
	public List<Department> getDepartment();
}
