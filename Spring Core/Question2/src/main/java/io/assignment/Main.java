package io.assignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		context.registerShutdownHook();
		
		ListQues qList = (ListQues) context.getBean("quesList");
		System.out.println(qList.display());
		
		SetQues qSet = (SetQues) context.getBean("quesSet");
		System.out.println(qSet.display());
	
		MapQues qMap = (MapQues) context.getBean("quesMap");
		System.out.println(qMap.display());
	}
	
	public String listQuestionTesting() {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		ListQues qList = (ListQues) context.getBean("quesList");
		return qList.display();
	}
	
	public String setQuestionTesting() {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		SetQues qSet = (SetQues) context.getBean("quesSet");
		return qSet.display();
	}
	
	public String mapQuestionTesting() {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		MapQues qMap = (MapQues) context.getBean("quesMap");
		return qMap.display();
	}
	
}
