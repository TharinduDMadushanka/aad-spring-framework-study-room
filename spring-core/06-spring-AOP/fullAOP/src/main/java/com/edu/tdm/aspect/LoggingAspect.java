package com.edu.tdm.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    // Pointcut: Define a pointcut expression for methods in OrderService
    @Pointcut("execution(* com.edu.tdm.service.OrderService.*(..))")
    public void allOrderServiceMethods(){}

    // Before Advice: Runs before the method execution
    @Before("allOrderServiceMethods()")
    public void logBefore(){
        System.out.println("LoggingAspect: Method execution started...");
    }

    // After Advice: Runs after the method execution (regardless of the outcome)
    @After("allOrderServiceMethods()")
    public void logAfter(){
        System.out.println("LoggingAspect: Method execution completed.");
    }

    // Around Advice: Logs execution time of methods
    @Around("allOrderServiceMethods()")
    public Object logExecution(ProceedingJoinPoint joinPoint) throws Throwable {

        long startTime = System.currentTimeMillis();

        // Proceed with method execution
        Object result = joinPoint.proceed();

        long endTime = System.currentTimeMillis();
        System.out.println("Execution time: " + (endTime - startTime) + " ms");

        return result;

    }

    // AfterReturning Advice: Logs after a method successfully returns
    @AfterReturning(pointcut = "allOrderServiceMethods()", returning = "result")
    public void logAfterReturning(Object result){
        System.out.println("LoggingAspect: Method returned successfully.");
    }

    // AfterThrowing Advice: Logs if a method throws an exception
    @AfterThrowing(pointcut = "allOrderServiceMethods()", throwing = "exception")
    public void logAfterThrowing(Exception exception){
        System.out.println("LoggingAspect: An exception occurred: " + exception.getMessage());
    }

}
