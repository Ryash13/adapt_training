package io.assignment;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorAPI {
	
	@GetMapping("/add/{num1}/{num2}")
	public double add(@PathVariable("num1") double num1 , @PathVariable("num2") double num2) {
		return num1 + num2;
	}
	
	@GetMapping("/sub/{num1}/{num2}")
	public double sub(@PathVariable("num1") double num1 , @PathVariable("num2") double num2) {
		return num1 - num2;
	}
	@GetMapping("/mult/{num1}/{num2}")
	public double mult(@PathVariable("num1") double num1 , @PathVariable("num2") double num2) {
		return num1 * num2;
	}
	@GetMapping("/div/{num1}/{num2}")
	public double div(@PathVariable("num1") double num1 , @PathVariable("num2") double num2) {
		return num1 / num2;
	}
	@GetMapping("/sqrt/{num1}")
	public double squareRoot(@PathVariable("num1") double num1) {
		return Math.sqrt(num1);
	}
}
