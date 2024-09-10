package com.edu.tdm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Notification {

    private SuperEmail superEmail;

    //constructor inject
    @Autowired
    public Notification(SuperEmail superEmail) {
        this.superEmail = superEmail;
    }

    public void sendNotification(String message, String receiver) {
        System.out.println("NotificationService : Sending notification...");
        superEmail.sendEmail(message, receiver);
    }

}

/**
 * For Setter Injection
     @Autowired
     public void setEmailService(EmailService emailService) {
     this.emailService = emailService;
     }

 * For field injection
     @Autowired
     private EmailService emailService;

 */