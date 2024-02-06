package edu.jsp.advj.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateTest {
	
	public static void main(String[] args) {
		
		String dburl ="jdbc:postgresql://localhost:5432/test";
		String user = "postgres";
		String password ="root";
		
		try {
			Class.forName("org.postgresql.Driver");
			
			Connection connection = DriverManager.getConnection(dburl, user, password);
			
			Statement statement = connection.createStatement();
			
			String query ="update employee set sal=700 where id=2";
			
			int result = statement.executeUpdate(query);
			System.out.println(result+" Updated rows");
			
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
