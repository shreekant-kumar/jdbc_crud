package com.student.manage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class StudentDao {
	public static boolean insertStudentToDB(Student s)
	{
		boolean f=false;
		try
		{
			Connection con=CP.createC();
			String q="insert into students(sname,sphone,scity) values (?,?,?)";
			//prepared statement
			PreparedStatement ptsmt=con.prepareStatement(q);
			//set values to insert queries
			ptsmt.setString(1,s.getSname());
			ptsmt.setString(2,s.getSphone());
			ptsmt.setString(3,s.getScity());
			
			//execute query
			ptsmt.executeUpdate();
			f=true;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return f;
	}

	public static boolean deleteStudentFromDB(int studid) {
		boolean f=false;
		try
		{
			Connection con=CP.createC();
			String q="delete from students where sid=?";
			//prepared statement
			PreparedStatement ptsmt=con.prepareStatement(q);
			//set value to delete
			ptsmt.setInt(1, studid);
			//execute query
			ptsmt.executeUpdate();
			f=true;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return f;
	}

	public static void showAllStudents() {
		try
		{
			Connection con=CP.createC();
			String q="select * from students";
			//create statement
			Statement stmt=con.createStatement();
			//execute query
			ResultSet rs=stmt.executeQuery(q);
			while(rs.next()) {
				int id=rs.getInt(1);
				//or int id=rs.getInt("sid");
				String name=rs.getString(2);
				//String name=rs.getString("sname");
				String phone=rs.getString(3);
				//String phone=rs.getString("sphone");
				String city=rs.getString(4);
				//String city=rs.getString("scity");
				System.out.println("student ID :"+ id +" Student name : "+name +" Student Phone : "+phone + " Student City : "+city);
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
