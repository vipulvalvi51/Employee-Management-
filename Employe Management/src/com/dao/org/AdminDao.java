package com.dao.org;

import com.pojo.org.Admin;

public interface AdminDao {
public Admin verifyAdmin(Admin admin);
public Admin getAdmin(String email);
public boolean editAdmin(Admin admin,String email);
}
