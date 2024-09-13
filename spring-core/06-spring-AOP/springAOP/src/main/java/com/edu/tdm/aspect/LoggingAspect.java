package com.edu.tdm.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Before("execution(* com.edu.tdm.service.PaymentService.processPayment(..))")
    public void logBefore(){
        System.out.println("LoggingAspect: Payment processing started...");
    }

    @After("execution(* com.edu.tdm.service.PaymentService.processPayment(..))")
    public void logAfter(){
        System.out.println("LoggingAspect: Payment processing completed.");
    }

    @AfterReturning("execution(* com.edu.tdm.service.PaymentService.processPayment(..))")
    public void logAfterReturning(){
        System.out.println("LoggingAspect: Payment processed successfully.");
    }

}
