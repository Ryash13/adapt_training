package io.assignment.Service;

import io.assignment.Model.Customer;
import io.assignment.Repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public Customer addNewCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public void updateCustomer(Customer customer) {

    }

    @Override
    public String deleteCustomer(int id) {
        customerRepository.deleteById(id);
        return "Customer deleted Successfully";
    }

    @Override
    public Customer getCustomerById(int id) {
        return customerRepository.findById(id).get();
    }

    @Override
    public String getALlCustomer() {
        customerRepository.findAll();
        return "Found all Customers";
    }
}
