package com.edu.tdm.service;

import org.springframework.stereotype.Service;

@Service
public class OrderService {

    public void placeOrder(String productName, int quantity) {
        System.out.println("Order placed for product: " + productName + " with quantity: " + quantity);
    }

    public void cancelOrder(String orderId) {
        System.out.println("Order with ID: " + orderId + " has been canceled.");
    }

}
