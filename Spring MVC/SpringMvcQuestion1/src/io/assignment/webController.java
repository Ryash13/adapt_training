package io.assignment;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class webController {
	
	@RequestMapping("/HelloWorld.html")
	public ModelAndView controller() {
		ModelAndView modelandview = new ModelAndView("HelloWorld");
		return modelandview;
	}
}
