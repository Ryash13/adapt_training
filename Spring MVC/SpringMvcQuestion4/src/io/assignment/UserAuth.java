package io.assignment;

public class UserAuth {

	User user = new User();
	String u = user.getUsername();
	String p = user.getPassword();
	
	public boolean isValid(String user , String pass) {
		if(user.equals(u) && pass.equals(p)) {
			return true;
		}
		else
			return false;
	}
}
