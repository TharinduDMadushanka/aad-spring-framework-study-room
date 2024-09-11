package com.edu.tdm.annotation;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class MyBean {

    @PostConstruct
    public void init() {
        System.out.println("Bean is initialized - @PostConstruct method called.");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Bean is being destroyed - @PreDestroy method called.");
    }

}
