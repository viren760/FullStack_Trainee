package com.Student_manage;

import java.sql.Connection;
import java.sql.DriverManager;

public class CP {
	
	static Connection con;

	public static Connection CreateC(){
		try {
			//Load the class
			Class.forName("com.mysql.cj.jdbc.Driver");
			
            //Create the connection
			
		String	user= "root";
		String password="root";
		String url="jdbc:mysql://localhost:3306/student_manage";
			
			con = DriverManager.getConnection(url, user, password);
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return con;
	}
}
