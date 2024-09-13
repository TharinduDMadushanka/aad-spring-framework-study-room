package com.edu.tdm;

import com.edu.tdm.config.AppConfig;
import com.edu.tdm.service.PaymentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        // Load the Spring context
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // Get the PaymentService bean
        PaymentService paymentService = context.getBean(PaymentService.class);

        // Call the processPayment method
        paymentService.processPayment("123456", 500.00);

        // Call the cancelPayment method (without AOP applied)
        paymentService.cancelPayment("123456");

        // Close the context
        ((AnnotationConfigApplicationContext) context).close();

    }
}