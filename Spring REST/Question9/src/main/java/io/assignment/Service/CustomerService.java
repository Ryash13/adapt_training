package io.assignment.Service;

import io.assignment.Model.Customer;

import java.util.List;
import java.util.Optional;

public interface CustomerService {

    Customer addNewCustomer(Customer customer);
    void updateCustomer(Customer customer);
    String deleteCustomer(int id);
    Customer getCustomerById(int id);
    String getALlCustomer();
}
