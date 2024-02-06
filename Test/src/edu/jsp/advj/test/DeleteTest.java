package edu.jsp.advj.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteTest {
	public static void main(String[] args) {
		String dburl ="jdbc:postgresql://localhost:5432/test";
		String user = "postgres";
		String password ="root";
		
		
//		Step1: Load and register the driver
		
		try {
			
			Class.forName("org.postgresql.Driver");
			
//			Step2: Create connection
			Connection connection = DriverManager.getConnection(dburl, user, password);
			
//			Step3: Create Statement
			Statement statement = connection.createStatement();
			
			String sql = "Delete from Employees where emp_id=2";
			
//			Step4: Execute Statement
			int result = statement.executeUpdate(sql);
			System.out.println(result+" Deleted rows");
			
//			Close jdbc object
			statement.close();
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