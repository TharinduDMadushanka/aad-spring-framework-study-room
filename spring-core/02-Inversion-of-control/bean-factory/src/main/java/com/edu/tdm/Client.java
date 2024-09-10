package com.edu.tdm;

public class Client {

    private Service service;

    // Setter method for injecting the Service dependency
    public void setService(Service service) {
        this.service = service;
    }

    public void performTask(){
        System.out.println("Client is delegating task to the service.");
        service.doService();
    }

}
