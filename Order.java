package com.project.BankSimulator.model;

import javax.persistence.*;

@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "orderId")
    private Long orderId;

    @Column(name = "orderDetail")
    private String orderDetail;

    @Column(name = "orderQuantity")
    private Integer orderQuantity;

    public Order() {

    }

    public Order(Long orderId, String orderDetail, Integer orderQuantity) {
        this.orderId = orderId;
        this.orderDetail = orderDetail;
        this.orderQuantity = orderQuantity;
    }

    //Getters and Setters
    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public String getOrderDetail() {
        return orderDetail;
    }

    public void setOrderDetail(String orderDetail) {
        this.orderDetail = orderDetail;
    }

    public Integer getOrderQuantity() {
        return orderQuantity;
    }

    public void setOrderQuantity(Integer orderQuantity) {
        this.orderQuantity = orderQuantity;
    }

}
