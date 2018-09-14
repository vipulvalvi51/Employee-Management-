package com.connection.org;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connect {

	public static Connection getCon()
	{
		Connection con=null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/management";
			con = DriverManager.getConnection(url,"root","root");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return con;
	}

}
