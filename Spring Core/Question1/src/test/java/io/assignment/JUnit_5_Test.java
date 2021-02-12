package io.assignment;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


@TestInstance(Lifecycle.PER_CLASS)
class JUnit_5_Test {

	static ApplicationContext context;
	static Main main;
	private Object expected;
	
	
	@BeforeAll
	void init() {
		context = new ClassPathXmlApplicationContext("spring.xml");
		main = new Main();
	}
	
	@Test
	void testApp() {
		String expected = "Customer Details => CustomerId = 11717121 , CustomerName = Yash Raj , CustomerContact = 8146827678 , CustomerAddress = [Street = New Chandmari , State = Bihar , ZipCode = 845401 , Country = India]";
		String actual = main.Testing();
		assertEquals(expected , actual);
		
	}

}
