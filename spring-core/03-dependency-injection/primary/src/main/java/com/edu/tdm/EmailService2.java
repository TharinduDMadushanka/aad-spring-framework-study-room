package com.edu.tdm;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class EmailService2 implements SuperEmail{
    @Override
    public void sendEmail(String message, String receiver) {
        System.out.println("EmailService2: Sending email to " + receiver + " with message: " + message);
    }
}
