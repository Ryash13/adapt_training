package io.assignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	static ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

	public static void main(String[] args) {
		
		BankAccountController controller = (BankAccountController) context.getBean("bankAccountController");
		controller.withdraw(controller.getAccount().getAccountId(), 20000);
		System.out.println(controller);
		
		controller.deposit(controller.getAccount().getAccountId(), 500);
		System.out.println(controller);
	}
	
	public String withdrawService() {
		
		BankAccountController controller = (BankAccountController) context.getBean("bankAccountController");
		controller.withdraw(controller.getAccount().getAccountId(), 20000);
		return controller.toString(); 
	}
	
	public String depositeService() {
		
		BankAccountController controller = (BankAccountController) context.getBean("bankAccountController");
		controller.deposit(controller.getAccount().getAccountId(), 500);
		return controller.toString(); 
	}

}
