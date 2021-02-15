package io.assignment;

public class UserAuth {
	
	String userID = "yash1301";
	String userPass = "yash8146@";
	
	public boolean isValidAuth(String user , String pass) {
		if(user.equalsIgnoreCase(userID) && pass.equalsIgnoreCase(userPass))
			return true;
		else
			return false;
	}
	
}
