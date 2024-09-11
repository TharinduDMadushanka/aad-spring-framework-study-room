package com.edu.tdm;

public class Car {

    private Engine engine;

    public Car() {}

    // Setter Injection
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    // Constructor Injection
    public Car(Engine engine) {
        this.engine = engine;
    }

    public void showDetails() {
        System.out.println("Car has " + engine);
    }
}
