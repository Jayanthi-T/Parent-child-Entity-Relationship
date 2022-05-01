package com.project.BankSimulator.repository;

import com.project.BankSimulator.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerOrderRepository extends JpaRepository<Customer, Long> {

}
