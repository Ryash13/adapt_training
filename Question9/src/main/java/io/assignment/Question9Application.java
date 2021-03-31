package io.assignment;

import io.assignment.Service.CustomerServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Question9Application {

	public static void main(String[] args) {
		SpringApplication.run(Question9Application.class, args);
	}

	@Bean
	public CustomerServiceImpl createBean() {
		return new CustomerServiceImpl();
	}

}
