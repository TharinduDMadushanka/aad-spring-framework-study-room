package com.edu.tdm.setter;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("emailService1")
public class EmailService1 implements SuperEmail {

    @Override
    public void sendEmail(String message, String receiver) {
        System.out.println("EmailService1: Sending email to " + receiver + " with message: " + message);
    }
}
