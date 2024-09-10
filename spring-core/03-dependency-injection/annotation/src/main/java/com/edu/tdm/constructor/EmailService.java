package com.edu.tdm.constructor;

import org.springframework.stereotype.Component;

@Component
public class EmailService {
    public void sendEmail(String message, String receiver) {
        System.out.println("Sending email to " + receiver + " with message: " + message);
    }
}

/**
 * The @Component annotation marks the EmailService class as a Spring bean
 */
