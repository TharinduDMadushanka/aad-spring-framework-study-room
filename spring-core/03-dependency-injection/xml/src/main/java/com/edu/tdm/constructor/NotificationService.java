package com.edu.tdm.constructor;

public class NotificationService {

    private EmailService emailService;

    //constructor for constructor injection
    public NotificationService(EmailService emailService) {
        this.emailService = emailService;
    }

    public void sendNotification(String message, String receiver) {
        System.out.println("Sending notification...");
        emailService.sendEmail(message, receiver);
    }

}
