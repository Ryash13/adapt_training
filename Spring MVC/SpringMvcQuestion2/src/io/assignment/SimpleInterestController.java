package io.assignment;


import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SimpleInterestController {
	
	@RequestMapping(value = "/simpleInterest.html")
	public ModelAndView getInputValues() {
		
		ModelAndView modelandview = new ModelAndView("simpleInterest");
		return modelandview;
	
	}
	
	@RequestMapping(value = "/calculatedSI.html")
	public ModelAndView calculatedSI(@ModelAttribute("SICalculator1") 
	SICalculator SICalculator1 , @RequestParam Map<String , String> param) {
		
		String P = param.get("principle");
		String R = param.get("rate");
		String T = param.get("time");
		
		double interest = SICalculator1.calc();
		ModelAndView modelandview = new ModelAndView("output");
		modelandview.addObject("outputLine" , "Principle = " + P + "Rate = " + R + "Time = " + T);
		modelandview.addObject("ans" ,"Interest = " + interest);
		return modelandview;
	}
	
}
