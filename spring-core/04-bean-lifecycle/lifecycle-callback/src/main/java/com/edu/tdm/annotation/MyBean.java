package com.edu.tdm.annotation;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class MyBean {

    @PostConstruct
    public void init(){

    }

}
