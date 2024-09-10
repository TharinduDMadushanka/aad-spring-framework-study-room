package com.edu.tdm;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class EmailService1 implements SuperEmail {

    @Override
    public void sendEmail(String message, String receiver) {
        System.out.println("EmailService1: Sending email to " + receiver + " with message: " + message);
    }
}

/**
 * The @Primary annotation marks this bean as the default bean to be used when no specific qualifier is present.
 */