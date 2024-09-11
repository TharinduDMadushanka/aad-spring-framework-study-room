package com.edu.tdm.setter;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Engine engine() {
        return new Engine("V6");
    }

    @Bean
    public Car car() {
        Car car = new Car();
        car.setEngine(engine()); // Setter injection
        return car;
    }

}
