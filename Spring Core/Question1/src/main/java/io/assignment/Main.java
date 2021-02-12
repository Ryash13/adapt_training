package io.assignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	static ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
	
	public static void main(String[] args) {
		
		 ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml"); 
		 Customer customer = (Customer)context.getBean("customer"); 
		 System.out.println(customer.toString());		
	}
	
	public String Testing() {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml"); 
		 Customer customer = (Customer)context.getBean("customer"); 
		 return customer.toString();
		 
	}

}
