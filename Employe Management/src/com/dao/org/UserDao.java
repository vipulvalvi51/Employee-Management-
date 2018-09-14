package com.dao.org;

import java.util.List;

import com.pojo.org.User;

public interface UserDao {
	public boolean addUser(User user);
	public boolean editUser(User user,String email);
	public User verifyUser(User user);
	public User getUser(String email);
	public List<User> getListOfUsers();
	
}
