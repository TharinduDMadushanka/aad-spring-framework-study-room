package com.edu.tdm.constructor;

public class Car {

    private Engine engine;

    // Constructor Injection
    public Car(Engine engine) {
        this.engine = engine;
    }

    public void showDetails() {
        System.out.println("Car has " + engine);
    }
}
