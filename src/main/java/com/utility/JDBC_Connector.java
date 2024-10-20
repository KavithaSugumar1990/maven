package com.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_Connector {
	static String url="jdbc:mysql://localhost:3306/employees";
	static String userName="root";
	static String passWord="root@123";
	static String query="select * from employees";
	
	private static void getParticularData() throws SQLException {
		//establish the connection
		Connection connection=DriverManager.getConnection(url, userName, passWord);//method overloading
    
		//create a statement 
		
		Statement statement=connection.createStatement();
		ResultSet result=statement.executeQuery(query);
		result.next();
		int empNo=result.getInt(1);
		System.out.println(empNo);
		
	
	}
	public static void main(String[] args) throws SQLException {
		getParticularData();
		
	}
	
	

}
