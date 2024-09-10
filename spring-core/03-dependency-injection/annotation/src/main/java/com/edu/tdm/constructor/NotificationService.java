package com.edu.tdm.constructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class NotificationService {

    private EmailService emailService;

    //constructor injection
    @Autowired
    public NotificationService(EmailService emailService) {
        this.emailService = emailService;
    }

    public void sendNotification(String message, String receiver) {
        System.out.println("Sending notification via constructor injection...");
        emailService.sendEmail(message, receiver);
    }

}
