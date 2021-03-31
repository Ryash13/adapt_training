package io.assignment.RabbitMQ.Service;

import java.util.List;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import io.assignment.RabbitMQ.Config.MessageConfig;
import io.assignment.RabbitMQ.Model.Customer;
import io.assignment.RabbitMQ.Repository.CustomerRepository;

@RestController
public class CustomerService {
	
	@Autowired
	private CustomerRepository customerRepository;
	
	@Autowired
	private RabbitTemplate template;
	
	@PostMapping("/addCustomer")
	public String addCustomer(@RequestBody Customer customer) {
		
		template.convertAndSend(MessageConfig.EXCHANGE, MessageConfig.ROUTING_KEY, customer);
		return "Success !!";
	}
	
	@GetMapping("/getCustomers")
	public List<Customer> getCustomers(){
		return customerRepository.findAll();
	}

}
