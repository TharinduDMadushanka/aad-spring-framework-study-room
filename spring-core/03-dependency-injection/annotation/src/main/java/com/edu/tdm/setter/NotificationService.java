package com.edu.tdm.setter;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class NotificationService {

    private EmailService emailService;

    //setter injection
    @Autowired
    public void setEmailService(EmailService emailService) {
        this.emailService = emailService;
    }

    public void sendNotification(String message, String receiver) {
        System.out.println("Sending notification via setter injection...");
        emailService.sendEmail(message, receiver);
    }

}
