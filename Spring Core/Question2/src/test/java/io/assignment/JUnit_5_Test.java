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
	void testList() {
		String expected = "ListQuestion => QuestionId = 1 , Question = What is the capital of India? Answer = [1) Bihar, 2) Punjab, 3) New Delhi, 4) Tamil Nadu]";
		String actual = main.listQuestionTesting();	
		assertEquals(expected , actual);
	}
	
	@Test
	void testSet() {
		String expected = "SetQuestion => QuestionId = 2 , Question = In Java, JAR stands for? Answer = [1) Java Archive Runner, 2) Java Application Resource, 3) Java Application Runner, 4) Java Archiver]";
		String actual = main.setQuestionTesting();
		assertEquals(expected , actual);
	}
	
	@Test
	void testMap() {
		String expexted = "MapQuestion => QuestionId = 3 , Question = Which attribute is used to set the scope of a bean? Answer = {1=getBean, 2=setBean, 3=beanScope, 4=scope}";
		String actual = main.mapQuestionTesting();
		assertEquals(expexted , actual);
	}

}
