package com.dao.org;

import com.pojo.org.Teacher;

public interface TeacherDao {
	public boolean addTeacher(Teacher teacher);
	public Teacher verifyTeacher(Teacher teacher);
}
