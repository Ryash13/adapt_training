package io.assignment.RabbitMQ.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import io.assignment.RabbitMQ.Model.Customer;

public interface CustomerRepository extends MongoRepository<Customer, Integer> {

}
