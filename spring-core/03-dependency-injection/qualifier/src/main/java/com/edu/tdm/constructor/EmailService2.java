package com.edu.tdm.constructor;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("emailService2")
public class EmailService2 implements SuperEmail{
    @Override
    public void sendEmail(String message, String receiver) {
        System.out.println("EmailService2: Sending email to " + receiver + " with message: " + message);
    }
}
