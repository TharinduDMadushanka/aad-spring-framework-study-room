package com.edu.tdm;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Scope("singleton")
public class MessageService implements BeanNameAware, BeanFactoryAware, InitializingBean, DisposableBean {

    private String message;

    // Constructor
    public MessageService() {
        System.out.println("Step 1: Bean is instantiated.");
    }

    // Set message (setter injection)
    public void setMessage(String message) {
        this.message = message;
    }

    //from BeanNameAware interface
    @Override
    public void setBeanName(String name) {
        System.out.println("Step 2: BeanNameAware's setBeanName() called with bean name: " + name);
    }

    //from BeanFactoryAware interface
    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("Step 3: BeanFactoryAware's setBeanFactory() called.");
    }

    // Custom init method using @PostConstruct
    @PostConstruct
    public void customInit() {
        System.out.println("Step 4: @PostConstruct custom initialization method called.");
    }


    //from InitializingBean interface
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Step 5: InitializingBean's afterPropertiesSet() called.");
    }

    // Bean ready to use
    public void printMessage() {
        System.out.println("Step 6: Bean is ready to use: " + message);
    }

    // Custom destroy method using @PreDestroy
    @PreDestroy
    public void customDestroy() {
        System.out.println("Step 7: @PreDestroy custom destroy method called.");
    }

    //from DisposableBean interface
    @Override
    public void destroy() throws Exception {
        System.out.println("Step 8: DisposableBean's destroy() called.");
    }
}
