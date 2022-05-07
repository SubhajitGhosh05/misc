package com.subhajit.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestJDBC {
	public static void main(String[] args) {

		String jdbcUrl = "jdbc:oracle:thin:@localhost:1521:XE";
		String user = "system";
		String pass = "abcd123";
		
		try {
			System.out.println("Connecting to database: " + jdbcUrl);
			Class.forName("oracle.jdbc.driver.OracleDriver");  
			
			Connection myConn =
					DriverManager.getConnection(jdbcUrl, user, pass);
			
			System.out.println("Connection successful!!!");
			
		}
		catch (Exception exc) {
			exc.printStackTrace();
		}
		
	}

}
