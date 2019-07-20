package com.naum.hibernate;

import java.sql.Connection;
import java.sql.DriverManager;

import com.mysql.cj.jdbc.JdbcConnection;

public class TestJdbc {

	public static void main(String[] args) {
		
		String jdbUrl = "jdbc:mysql://localhost:3306/hb_student_tracker?useSSL=false&serverTimezone=UTC";
		String user = "hbstudent";
		String pass = "hbstudent";
		
		try {
			System.out.println("Connecting to db"+ jdbUrl);
			Connection myConn =
					DriverManager.getConnection(jdbUrl,user,pass);
			System.out.println("Connection successful");
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
