package com.edu.tdm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        // Create an ApplicationContext by loading the beans.xml file
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        // Retrieve the Client bean from the ApplicationContext
        Client client = (Client) context.getBean("client");

        // Perform the task, which will invoke the injected Service
        client.performTask();

    }
}