package com.edu.tdm.profile;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        // Set active profile programmatically (for testing purposes)
        System.setProperty("spring.profiles.active", "dev"); // Change to "prod" for production

        ApplicationContext context = new AnnotationConfigApplicationContext(com.edu.tdm.profile.DatabaseConfig.class);

        // Get the DataSource bean
        DataSource dataSource = context.getBean(DataSource.class);

        // Show the data source configuration
        System.out.println(dataSource);

        ((AnnotationConfigApplicationContext) context).close();

    }
}