package com.student.manage;
import java.sql.Connection;
import java.sql.DriverManager;

public class CP {
	static Connection conn;
	public static Connection createC() {
		try {
			//load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			//create the connection
			System.out.println("connection successful");
			String user="root";
			String password="admin";
			String url="jdbc:mysql://localhost:3306/student_manage";
			conn=DriverManager.getConnection(url, user, password);
		}catch(Exception e) {
			System.out.println(e);
			//e.printStackTrace();
		}
		return conn;
	}

}
