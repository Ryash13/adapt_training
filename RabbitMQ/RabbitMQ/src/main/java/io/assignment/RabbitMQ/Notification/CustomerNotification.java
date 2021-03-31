package io.assignment.RabbitMQ.Notification;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import io.assignment.RabbitMQ.Config.MessageConfig;
import io.assignment.RabbitMQ.Model.Customer;
import io.assignment.RabbitMQ.Repository.CustomerRepository;

@Component
public class CustomerNotification {

	@Autowired
	private CustomerRepository customerRepository;

	@RabbitListener(queues=MessageConfig.QUEUE)
	public void consumeMessageFromQueue(Customer customer){
		customerRepository.save(customer);
	} 
}