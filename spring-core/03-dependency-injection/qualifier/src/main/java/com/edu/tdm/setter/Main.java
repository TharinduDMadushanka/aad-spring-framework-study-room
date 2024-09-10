package com.edu.tdm.setter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Notification notification = context.getBean(Notification.class);
        notification.sendNotification("Hello TDM","tdm@gmail.com");

    }
}

/**
 *  @Qualifier annotation in Spring helps resolve ambiguity when multiple beans of the same type are available.
 *  It allows you to specify which bean should be injected when multiple candidates are present.
 */