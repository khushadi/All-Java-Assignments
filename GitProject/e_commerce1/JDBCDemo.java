package com.e_commerce1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo {

	public static void main(String[] args) {
		
		//Step 1: Register/Load Driver 
				try {
					DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
					//or Class.forName("com.mysql.cj.jdbc.Driver");
					
					//Step 2: Get the connection object by supplying DB URL, DB Username & DN Password
					//DB URL: IP address of the machine where DB server is installed, protocol, port number
					Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/e_commerce", "root", "sima");
					System.out.println(connection);
					
					//Step 3: Create Statement object, which is used to send SQL queries to the database
					Statement statement = connection.createStatement();
					
					//Step 4: Execute SQL Query
					
	// change step 4 After connecting with database Step # 4 is //commented

	
				/*	
					ResultSet resultSet = statement.executeQuery("SELECT emp_id, emp_name, salary, dept_id FROM employee");
					while(resultSet.next()) {
						System.out.println(resultSet.getInt("emp_id") + "\t" 
						+ resultSet.getString("emp_name") + "\t" + resultSet.getFloat("salary") + "\t"
						+ resultSet.getInt("dept_id"));
					}
					*/
					
	// now we need to insert the data... we use executeUpdate() method 
	
	// for select query,  use we use executeQuery() method	
	// for Non-select query,  use we use executeUpdate() method			
					
int noofRecordsInserted = statement.executeUpdate
("insert into Product(p_Id, p_Name, price, qty, totalPrice, custID)"
		+ " values(1005,'105Calculator', 15.00, 1, 15.00, 9003)");

//("insert into Customer(custId, custName, custAddress ) values(9003,'Sara','QueensNY')");
					//System.out.println("number of records inserted"+noofRecordsInserted);
					
					
//int updateProduct = statement.executeUpdate("UPDATE Product set dept_id = 3 where emp_id = 107");
							
System.out.println("number of records Inserted "+noofRecordsInserted); 
	// now if you want to update then just Query will be change, no need to change the method
	// int updateEmployee mean number of connection			
					
					
					//Step 5:After job is done it is highly recommended to  Close the DB Connection
					//so others can use it
					connection.close();
					
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
	}