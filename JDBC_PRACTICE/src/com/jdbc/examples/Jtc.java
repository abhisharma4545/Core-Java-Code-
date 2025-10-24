 package com.jdbc.examples;
 import java.sql.DriverManager;
 import java.sql.Connection;
 import java.sql.Statement;

public class Jtc {
	static {
		Connection con =null;
		Statement st =null;
		try {
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			con=DriverManager.getConnection("jdbc:odbc:JTCMYDSN","root","@bhi4545#");
			String sql="insert into jtcStudent";
			st =con.createStatement();
			int x=st.executeUpdate(sql);
			if (x==1) {
				System.out.println("Record inserted");
			}else{
				System.out.println("Record not Inserted");
				
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally {
			try {
				if(st!=null) {
					st.close();
				} 
				else if(con!=null){
					con.close();	
				}
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
		
		
	}
}
