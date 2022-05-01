package com.project.BankSimulator.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customerId")
    private Long customerId;

    @Column(name = "customerName")
    private String customerName;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_customerId", referencedColumnName = "customerId")
    private List<Order> orders;

    public Customer() {

    }

    public Customer(Long customerId, String customerName, List<Order> orders) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.orders = orders;
    }

    //Getters and Setters
    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }
}
