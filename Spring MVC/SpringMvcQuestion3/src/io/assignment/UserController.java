package io.assignment;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
	
	@RequestMapping(value = "/homepage.html")
	public ModelAndView loginPage() {
		
		ModelAndView modelandview = new ModelAndView("login");
		return modelandview;
	
	}
	
	@RequestMapping(value = "/loginButton")
	public ModelAndView decision(@RequestParam Map<String , String> param , @ModelAttribute("UserModel1")
			UserModel UserModel1) {
		
		String username = param.get("userName");
		
		ModelAndView modelandview;
		UserAuth auth = new UserAuth();
		boolean isValid = auth.isValidAuth(UserModel1.getUserName(), UserModel1.getPassword());
		if(isValid) {
			modelandview = new ModelAndView("Success");
			modelandview.addObject("userDetails","UserName = " + username);
		}	
		else
			modelandview = new ModelAndView("Failed");
		
		return modelandview;
	}
	
}
