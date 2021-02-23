package io.assignment;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
	
	@RequestMapping(value = "/index.html" , method = RequestMethod.GET)
	public ModelAndView register() {
		ModelAndView modelandview = new ModelAndView("registration");
		return modelandview;
	}
	
	@RequestMapping(value = "/submitRegistration.html" , method = RequestMethod.GET)
	public ModelAndView submitRegister(@ModelAttribute("User1") User User1) {
		UserDatabase database = new UserDatabase();
		database.addUser(User1.getUsername(), User1.getPassword(), User1.getEmail());
		return new ModelAndView("login");
	}
	
	@RequestMapping(value = "/submitLogin.html" , method = RequestMethod.GET)
	public ModelAndView login(@ModelAttribute("user") User user ,@RequestParam String username , @RequestParam String password) {
		UserDatabase database = new UserDatabase();
		UserAuth auth = new UserAuth();
		user = database.getUser(username);
		boolean valid = auth.isValid(user.getUsername() , user.getPassword());
		if(valid) {
			return new ModelAndView("success");
		}
		else
			return new ModelAndView("error");
	}
	
}
