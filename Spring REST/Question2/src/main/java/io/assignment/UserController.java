package io.assignment;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@RequestMapping(value = "/isValid/{username}/{password}" , method = RequestMethod.GET)
	public String check(@RequestBody @ModelAttribute("user")User user) {
		boolean isValid = loginCheck(user.getUsername() , user.getPassword());
		if(isValid)
			return "Valid User";
		else
			return "Not a Valid User";
		
	}
	
	public boolean loginCheck(String username , String password) {
		if(username.contentEquals("ryash") && password.contentEquals("ryash")) {
			return true;
		}
		else 
			return false;
	}
}