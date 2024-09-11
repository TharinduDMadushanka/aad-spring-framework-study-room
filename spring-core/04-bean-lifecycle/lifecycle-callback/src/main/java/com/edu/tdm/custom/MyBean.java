package com.edu.tdm.custom;

public class MyBean {

    public void customInit(){
        System.out.println("Custom initialization method called.");
    }

    public void customDestroy(){
        System.out.println("Custom destroy method called.");
    }

}

/**
 * customInit() is called after the bean is initialized.
 * customDestroy() is called when the bean is being destroyed.
 */