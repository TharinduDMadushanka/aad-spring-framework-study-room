package com.edu.tdm.field;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class NotificationService {

    //field injection
    @Autowired
    private EmailService emailService;

    public void sendNotification(String message, String receiver) {
        System.out.println("Sending notification via field injection...");
        emailService.sendEmail(message, receiver);
    }

}
