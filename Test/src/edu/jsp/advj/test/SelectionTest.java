package edu.jsp.advj.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectionTest {
	
	public static void main(String[] args) {
		String dburl ="jdbc:postgresql://localhost:5432/test";
		String user = "postgres";
		String password ="root";
		
		
		
//		Step1: Load and register the driver
		
		try {
//			This 👇 statemate will throw an classNotFoundException Surround it with try catch.
			
			Class.forName("org.postgresql.Driver");
			
//			Step2: Create Connection
//			This 👇 Connection we have to import and surround it with catch as it will throw SQLException
			
			Connection connection = DriverManager.getConnection(dburl, user, password);
			
//			Step3: Create Statemate
			
			Statement statement = connection.createStatement();
			String query ="select *   from employee";
			
			
//			Step4: Execute
			
			
			ResultSet result = statement.executeQuery(query);
			while(result.next())
			{
				System.out.println("Emp_ID: "+result.getInt(1));
				System.out.println("Emp_Name: "+result.getString(2));
				System.out.println("Salary: "+result.getInt(3));
				System.out.println("Contact: "+result.getInt(4));
				System.out.println();
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}