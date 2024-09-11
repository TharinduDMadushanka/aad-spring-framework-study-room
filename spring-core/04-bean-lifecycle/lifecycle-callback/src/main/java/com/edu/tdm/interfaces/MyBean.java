package com.edu.tdm.interfaces;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class MyBean implements InitializingBean , DisposableBean {

    public MyBean() {
        System.out.println("Bean is instantiated.");
    }

    // from InitializingBean interface
    // This method is called after the bean is initialized
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Bean is initialized - afterPropertiesSet() method called.");
    }

    // from DisposableBean interface
    // This method is called when the bean is destroyed
    @Override
    public void destroy() throws Exception {
        System.out.println("Bean is being destroyed - destroy() method called.");
    }

}

/**
 * afterPropertiesSet() is called after the bean is initialized and all properties are set.
 * destroy() is called when the bean is about to be destroyed (typically when the application context is closed).
 */