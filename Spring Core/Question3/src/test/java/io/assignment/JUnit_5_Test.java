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
	
	@BeforeAll
	void init() {
		context = new ClassPathXmlApplicationContext("spring.xml");
		main = new Main();
	}
	
	@Test
	void testWithdraw() {
		String expected = "Bank Account = [BankAccountNumber = 125000045241 , AccountHolderName = Yash Raj , AccountType = savings , Balance =  80000.0]";
		String actual = main.withdrawService();
		assertEquals(expected , actual);
	}
	
	@Test
	void testDeposite() {
		String expected = "Bank Account = [BankAccountNumber = 125000045241 , AccountHolderName = Yash Raj , AccountType = savings , Balance =  100500.0]";
		String actual = main.depositeService();
		assertEquals(expected , actual);
	}

}
