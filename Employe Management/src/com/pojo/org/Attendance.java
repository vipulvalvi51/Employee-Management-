package com.pojo.org;

import java.sql.Date;

public class Attendance {
private int id;
private int user_id; 
private String attendance;
private Date date;
private String firstname;
private String lastname;

public String getFirstname() {
	return firstname;
}
public void setFirstname(String firstname) {
	this.firstname = firstname;
}
public String getLastname() {
	return lastname;
}
public void setLastname(String lastname) {
	this.lastname = lastname;
}
public Date getDate() {
	return date;
}
public void setDate(Date date) {
	this.date = date;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getAttendance() {
	return attendance;
}
public void setAttendance(String attendance) {
	this.attendance = attendance;
}
public int getUser_id() {
	return user_id;
}
public void setUser_id(int user_id) {
	this.user_id = user_id;
}
@Override
public String toString() {
	return "Attendance [id=" + id + ", user_id=" + user_id + ", attendance=" + attendance + ", date=" + date
			+ ", firstname=" + firstname + ", lastname=" + lastname + "]";
}


}
