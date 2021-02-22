package io.assignment;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import jakarta.validation.Valid;

@Controller
public class CustomerController {
	
	@RequestMapping(value="/register.html" , method=RequestMethod.GET)
	public ModelAndView homepage() {
		ModelAndView modelandview = new ModelAndView("registrationForm");
		return modelandview;
	}
	
	@RequestMapping(value="/submitButton" , method=RequestMethod.GET)
	public ModelAndView buttonClicked(@Valid @ModelAttribute("Customer1") Customer Customer1 , BindingResult result) {
		if(result.hasErrors()) {
			return new ModelAndView("registrationForm");
		}
		
		ModelAndView modelandview = new ModelAndView("success");
		return modelandview;
	}
}
