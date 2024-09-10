package com.edu.tdm.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        // Load the Spring configuration from beans.xml
        ApplicationContext context = new ClassPathXmlApplicationContext("constructor.xml");

        // Retrieve the NotificationService bean using constructor injection
        NotificationService not = (NotificationService) context.getBean("constructorNotification");

        not.sendNotification("Hello TDM","tdm@gmail.com");

    }
}