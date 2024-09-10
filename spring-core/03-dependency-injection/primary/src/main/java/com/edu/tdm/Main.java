package com.edu.tdm;

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

 * @Primary: This annotation is used to specify which bean should be given priority when multiple beans of the same type are present.
 * It ensures that this bean is selected by default when no @Qualifier is used.
 */