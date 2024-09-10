package com.edu.tdm.setter;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.edu.tdm.setter")
public class AppConfig {
    // No explicit bean definition required, @Component handles it.
}
