package com.jtc.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class Test1 {
	public static void main(String[] args) {
		Connection con = null;
		Statement st = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("", null, null);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}

}
