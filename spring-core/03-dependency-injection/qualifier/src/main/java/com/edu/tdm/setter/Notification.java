package com.edu.tdm.setter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Notification {

    private SuperEmail superEmail;

    //setter inject
    @Autowired
    @Qualifier("emailService1")
    public void setEmailService(SuperEmail superEmail) {
        this.superEmail = superEmail;
    }

    public void sendNotification(String message, String receiver) {
        System.out.println("NotificationService setter: Sending notification...");
        superEmail.sendEmail(message, receiver);
    }

}

/**

 @Autowired
 @Qualifier("emailService1")
 private EmailService emailService;

 */



