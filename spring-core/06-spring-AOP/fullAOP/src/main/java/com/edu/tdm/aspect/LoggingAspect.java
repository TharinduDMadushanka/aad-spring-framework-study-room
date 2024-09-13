package com.edu.tdm.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    /**
     * Pointcut: The @Pointcut annotation defines a pointcut that matches all methods in OrderService.
     * The expression execution(* com.example.service.OrderService.*(..)) matches all methods (*) in
     * the OrderService class with any parameters.
     */
    // Pointcut: Define a pointcut expression for methods in OrderService
    @Pointcut("execution(* com.edu.tdm.service.OrderService.*(..))")
    public void allOrderServiceMethods(){}

    /**
     * Before Advice: The @Before annotation applies before the target method execution. It logs the start of the method execution.
     */
    // Before Advice: Runs before the method execution
    @Before("allOrderServiceMethods()")
    public void logBefore(){
        System.out.println("LoggingAspect: Method execution started...");
    }

    /**
     * After Advice: The @After annotation runs after the method execution, regardless of whether it returns or throws an exception.
     */
    // After Advice: Runs after the method execution (regardless of the outcome)
    @After("allOrderServiceMethods()")
    public void logAfter(){
        System.out.println("LoggingAspect: Method execution completed.");
    }

    /**
     *Around Advice: The @Around advice is more powerful as it allows us to control when to proceed with the method execution.
     * Here, it also calculates and logs the execution time.
     */
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

    /**
     * AfterReturning Advice: The @AfterReturning advice runs after a method successfully returns, and we can capture the return value.
     */
    // AfterReturning Advice: Logs after a method successfully returns
    @AfterReturning(pointcut = "allOrderServiceMethods()", returning = "result")
    public void logAfterReturning(Object result){
        System.out.println("LoggingAspect: Method returned successfully.");
    }

    /**
     *AfterThrowing Advice: The @AfterThrowing advice runs when the method throws an exception, logging the exception details.
     */
    // AfterThrowing Advice: Logs if a method throws an exception
    @AfterThrowing(pointcut = "allOrderServiceMethods()", throwing = "exception")
    public void logAfterThrowing(Exception exception){
        System.out.println("LoggingAspect: An exception occurred: " + exception.getMessage());
    }

}

