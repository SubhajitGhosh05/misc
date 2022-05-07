package com.subhajit.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestJDBC {
	public static void main(String[] args) {

		
		  String jdbcUrl = "jdbc:oracle:thin:@localhost:1521:XE"; String user =
		  "ONE2MANY"; String pass = "abcd1234";
		 
		
		/*
		 * String jdbcUrl = "jdbc:oracle:thin:@localhost:1522:orclpdb"; String user =
		 * "HR"; String pass = "HR";
		 */
		
		try {
			System.out.println("Connecting to database: " + jdbcUrl);
			
			Connection myConn =
					DriverManager.getConnection(jdbcUrl, user, pass);
			
			System.out.println("Connection successful!!!");
			
		}
		catch (Exception exc) {
			exc.printStackTrace();
		}
		
	}

}
