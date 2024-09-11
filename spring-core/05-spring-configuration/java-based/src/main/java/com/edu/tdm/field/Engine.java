package com.edu.tdm.field;

import org.springframework.stereotype.Component;

@Component
public class Engine {

    private String type;

    public Engine() {
        this.type = "V6";
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Engine type: " + type;
    }

}
