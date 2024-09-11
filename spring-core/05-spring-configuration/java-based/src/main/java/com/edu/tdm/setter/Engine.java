package com.edu.tdm.setter;

public class Engine {

    private String type;

    public Engine(){

    }

    public Engine(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Engine type: " + type;
    }

}
