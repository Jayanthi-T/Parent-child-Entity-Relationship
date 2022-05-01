package com.project.BankSimulator.controller;

import com.project.BankSimulator.model.Customer;
import com.project.BankSimulator.model.Order;
import com.project.BankSimulator.repository.CustomerOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class CustomerOrderController {
    @Autowired
    private CustomerOrderRepository repo;

    @GetMapping("/getCustomer/{id}")
    public Optional<Customer> getCustomer(@PathVariable Long id){
        return repo.findById(id);
    }

    @PostMapping("/addCustomer")
    public Customer addCustomer(@RequestBody Customer customer){
        return repo.save(customer);
    }

}
