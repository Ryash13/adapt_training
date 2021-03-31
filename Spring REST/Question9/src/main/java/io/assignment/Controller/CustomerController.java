package io.assignment.Controller;

import io.assignment.Model.Customer;
import io.assignment.Service.CustomerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class CustomerController {

    @Autowired
    private CustomerServiceImpl customerService;

    @GetMapping("/allCustomer")
    public ResponseEntity getAllCustomers() {
        customerService.getALlCustomer();
        return new ResponseEntity(HttpStatus.FOUND);
    }

    @GetMapping("/customer/{id}")
    public ResponseEntity getCustomerById(@PathVariable("id") int id) {
        customerService.getCustomerById(id);
        return new ResponseEntity(HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity addNewCustomer(@RequestBody Customer customer) {
        customerService.addNewCustomer(customer);
        return new ResponseEntity(HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity updateCustomer(@RequestBody Customer customer) {
        customerService.updateCustomer(customer);
        return new ResponseEntity(HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity deleteCustomer(@PathVariable("id") int id) {
        customerService.deleteCustomer(id);
        return new ResponseEntity(HttpStatus.OK);
    }
}
