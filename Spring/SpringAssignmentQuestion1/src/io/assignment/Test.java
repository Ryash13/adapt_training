/**
 * 
 */
package io.assignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Yash Raj
 *
 */
public class Test {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml"); 
		Customer customer = (Customer) context.getBean("customer");
		System.out.println(customer.toString());		
	}
}
