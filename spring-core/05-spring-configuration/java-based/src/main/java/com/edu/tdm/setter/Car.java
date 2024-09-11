package com.edu.tdm.setter;

public class Car {

    private Engine engine;

    public Car() {}

    // Setter method for injection
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void showDetails() {
        System.out.println("Car has " + engine);
    }
}
