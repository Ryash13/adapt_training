package io.assignment;

import java.sql.*;

public class UserDatabase {
	
	public User getUser(String userName) {
		User user = new User();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "root");
			PreparedStatement statement = connection.prepareStatement("SELECT * FROM user WHERE username=?");
			statement.setString(1, userName);
			ResultSet resultset = statement.executeQuery();
			
			while(resultset.next()) {
				String USERNAME = resultset.getString("username");
				String PASSWORD = resultset.getString("password");
				String EMAIL = resultset.getString("email");
				
				user.setUsername(USERNAME);
				user.setPassword(PASSWORD);
				user.setEmail(EMAIL);
			}
			resultset.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		return user;
	}
	
	public void addUser(String uname , String uemail , String upassword) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "root");
			PreparedStatement statement = connection.prepareStatement("INSERT INTO user values(?,?,?)");
			
			statement.setString(1, uname);
			statement.setString(2, uemail);
			statement.setString(3, upassword);
			
			statement.executeUpdate();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
