package com.Student_manage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;



public class StudentDao {

	public static boolean  insertStudentToDB(Student st) {
		
		boolean f= false;
		try {
			
			
			Connection con = CP.CreateC();
			String q = "insert into students(sname, sphone, scity) values(?,?,?)";
			
           //Prepared statement ...
		PreparedStatement pstmt	=con.prepareStatement(q);
		
		
		// set the values of parameter 
		pstmt.setString(1, st.getStudentName());
		pstmt.setString(2, st.getStudentPhone());
		pstmt.setString(3, st.getStudentCity());
		
		//execute
		pstmt.executeUpdate();
		f=true;
			
			
			
		}catch(Exception e){
			e.printStackTrace();
		}
		return f;
	}

	public static boolean deleteStudent(int userID) {
		boolean f= false;
		try {
			
			
			Connection con = CP.CreateC();
			String q = "delete from students where sid=?";
			
           //Prepared statement ...
		PreparedStatement pstmt	=con.prepareStatement(q);
		
		
		// set the values of parameter 
		pstmt.setInt(1, userID);
		
		
		//execute
		pstmt.executeUpdate();
		f=true;
			
			
			
		}catch(Exception e){
			e.printStackTrace();
		}
		return f;

		
	}

	public static void showAll() {
		
		try {
			
			
			Connection con = CP.CreateC();
			String q = "select * from students";
			
           // statement
			Statement stmt= con.createStatement();
			
			
			// resultset
			ResultSet set = stmt.executeQuery(q);
			
			while(set.next()) {
				
				int id= set.getInt(1);
				String name = set.getString(2);
				String number = set.getString(3);
				String city = set.getString(4);
				
				System.out.println("ID :"+id);
				System.out.println("Name :"+name);
				System.out.println("Mobile Number :"+number);
				System.out.println("CITY:"+city);
				System.out.println("===================================================");
			}
			
			
		}catch(Exception e){
			e.printStackTrace();
		}
		

		
	}
	
}
