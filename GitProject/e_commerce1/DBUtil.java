package com.e_commerce1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {

	static Connection connection=null;
	public static Connection getDBConnection() {
		try { 
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver()); //step1 : Register/Load driver
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/e_commerce", "root", "sima"); //step2
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return connection;
	}
}
