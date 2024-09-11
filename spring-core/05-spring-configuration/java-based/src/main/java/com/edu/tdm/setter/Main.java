package com.edu.tdm.setter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        // Load Spring context from Java-based configuration
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // Get the Car bean
        Car car = context.getBean(Car.class);

        // Show car details
        car.showDetails();

        // Close the context
        ((AnnotationConfigApplicationContext) context).close();


    }
}
