package com.dao.org;

import java.sql.Date;
import java.util.List;
import com.pojo.org.Attendance;

public interface AttendanceDao {
	public boolean deleteAttendance(Date date);
	public boolean addAttendance(List<Attendance> list);
}
