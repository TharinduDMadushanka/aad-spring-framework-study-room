package com.edu.tdm.setter;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        NotificationService not = context.getBean(NotificationService.class);
        not.sendNotification("Hello TDM", "tdm@gmail.com");

    }
}