package com.edu.tdm.constructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Notification {

    private SuperEmail superEmail;

    //constructor inject
    @Autowired
    public Notification(@Qualifier("emailService2") SuperEmail superEmail) {
        this.superEmail = superEmail;
    }

    public void sendNotification(String message, String receiver) {
        System.out.println("NotificationService Constructor: Sending notification...");
        superEmail.sendEmail(message, receiver);
    }

}
