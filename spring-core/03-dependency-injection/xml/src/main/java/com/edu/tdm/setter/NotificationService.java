package com.edu.tdm.setter;


public class NotificationService {

    private EmailService emailService;

    // Setter method for Setter Injection
    public void setEmailService(EmailService emailService) {
        this.emailService = emailService;
    }

    public void sendNotification(String message, String receiver) {
        System.out.println("Sending notification in setter injection...");
        emailService.sendEmail(message, receiver);
    }

}
