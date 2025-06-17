package com.kelompok2.selfOrderApp.selfOrderAppBackend.controllers;

import com.kelompok2.selfOrderApp.selfOrderAppBackend.models.Customer;
import com.kelompok2.selfOrderApp.selfOrderAppBackend.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customers")
@CrossOrigin(origins = "http://localhost:3000")
public class CustomerController {

    @Autowired
    private CustomerRepository customerRepo;

    @GetMapping
    public List<Customer> getAllCustomers() {
        return customerRepo.findAll();
    }

    @PostMapping
    public Customer createCustomer(@RequestBody Customer customer) {
        return customerRepo.save(customer);
    }

    @GetMapping("/{id}")
    public Customer getById(@PathVariable Integer id) {
        return customerRepo.findById(id).orElse(null);
    }

    @PutMapping("/{id}")
    public Customer updateCustomer(@PathVariable Integer id, @RequestBody Customer updated) {
        Customer customer = customerRepo.findById(id).orElse(null);
        if (customer != null) {
            customer.setCustomerName(updated.getCustomerName());
            customer.setPhoneNumber(updated.getPhoneNumber());
            return customerRepo.save(customer);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void deleteCustomer(@PathVariable Integer id) {
        customerRepo.deleteById(id);
    }
}
