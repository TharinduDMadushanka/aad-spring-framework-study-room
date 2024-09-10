package com.edu.tdm;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class Main {
    public static void main(String[] args) {

        BeanFactory factory = new XmlBeanFactory(new ClassPathResource("beans.xml"));

    }
}