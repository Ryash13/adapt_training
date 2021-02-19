package io.assignment.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloAppController {
	
	@RequestMapping(value="/hello")
	public String sayHello() {
		return "Hello World";
	}
}
