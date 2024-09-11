package com.fooddeliverysystem.services;

import java.util.Map;

import com.fooddeliverysystem.entities.Order;

public class OrderService {
    private Map<Integer, Order> orders;

    // Constructor
    public OrderService(Map<Integer, Order> orders) {
        this.orders = orders;
    }

    // Get orders
    public Map<Integer, Order> getOrders() {
        return orders;
    }
}