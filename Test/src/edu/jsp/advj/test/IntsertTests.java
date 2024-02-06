package edu.jsp.advj.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class IntsertTests {

	public static void main(String[] args) {
		String dburl = "jdbc:postgresql://localhost:5432/test";
		String user ="postgres";
		String password ="root";
		

		
		try {
//			Step1: Load & register the driver
			
			Class.forName("org.postgresql.Driver"); 
			
//			Step2: Create Connection
			
			Connection connection = DriverManager.getConnection(dburl,user,password);
			
//			Step3: create Statement 
			
			Statement statemate = connection.createStatement();
			String query = "insert into employee values(2,'xyz',300,789)";
			
//			Step4: Execute Statement
			
			int result = statemate.executeUpdate(query);
			System.out.println(result+" Row inserted");
			
//			Step5: Close jdbc object
			
			statemate.close();
			connection.close();
			
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	}
}
