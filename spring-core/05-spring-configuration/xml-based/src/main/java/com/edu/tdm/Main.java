package com.edu.tdm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        // Load Spring XML configuration file
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");

        // Get the Car bean
        Car car = context.getBean("car", Car.class);

        // Show car details
        car.showDetails();

        // Close the context
        ((ClassPathXmlApplicationContext) context).close();

    }
}