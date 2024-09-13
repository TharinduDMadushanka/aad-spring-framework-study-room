package com.edu.tdm;

import com.edu.tdm.config.AppConfig;
import com.edu.tdm.service.OrderService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        // Load the Spring context
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // Get the OrderService bean
        OrderService orderService = context.getBean(OrderService.class);

        // Call the placeOrder method
        orderService.placeOrder("Laptop", 2);

        // Call the cancelOrder method
        orderService.cancelOrder("ORD1234");

        // Close the context
        ((AnnotationConfigApplicationContext) context).close();

    }
}