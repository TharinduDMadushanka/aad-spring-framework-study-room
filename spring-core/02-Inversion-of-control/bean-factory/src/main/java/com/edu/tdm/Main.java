package com.edu.tdm;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class Main {
    public static void main(String[] args) {

        // Load the XML configuration file
        BeanFactory factory = new XmlBeanFactory(new ClassPathResource("beans.xml"));

        // Retrieve the Client bean from the BeanFactory
        Client client = (Client) factory.getBean("client");

        // Perform the task, which will invoke the injected Service
        client.performTask();

    }
}