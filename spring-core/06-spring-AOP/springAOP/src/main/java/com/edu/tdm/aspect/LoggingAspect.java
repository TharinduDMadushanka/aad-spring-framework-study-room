package com.edu.tdm.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect //Marks the class as an aspect.
@Component
public class LoggingAspect {

    //Advice to execute before the processPayment method is invoked.
    @Before("execution(* com.edu.tdm.service.PaymentService.processPayment(..))")
    public void logBefore(){
        System.out.println("LoggingAspect: Payment processing started...");
    }

    //Advice to execute after the method is invoked, whether it returned successfully or threw an exception.
    @After("execution(* com.edu.tdm.service.PaymentService.processPayment(..))")
    public void logAfter(){
        System.out.println("LoggingAspect: Payment processing completed.");
    }

    //Advice to execute after the method successfully returns.
    @AfterReturning("execution(* com.edu.tdm.service.PaymentService.processPayment(..))")
    public void logAfterReturning(){
        System.out.println("LoggingAspect: Payment processed successfully.");
    }

}

/**
 * The execution(* com.example.service.PaymentService.processPayment(..)) expression is the pointcut,
 * which matches the processPayment method in the PaymentService class.
 */