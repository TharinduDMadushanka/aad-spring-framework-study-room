package com.edu.tdm.interfaces;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        // Load the Spring context
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // Retrieve bean
        MyBean myBean = context.getBean(MyBean.class);

        // Close the context to trigger bean destruction
        ((AnnotationConfigApplicationContext) context).close();

    }
}