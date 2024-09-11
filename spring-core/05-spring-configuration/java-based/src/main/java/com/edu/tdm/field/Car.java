package com.edu.tdm.field;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {
    @Autowired
    private Engine engine;  // Field Injection

    public void showDetails() {
        System.out.println("Car has " + engine);
    }
}
