package io.assignment.Repository;

import io.assignment.Model.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer , Integer> {
}
