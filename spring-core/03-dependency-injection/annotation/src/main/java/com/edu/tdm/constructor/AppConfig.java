package com.edu.tdm.constructor;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.edu.tdm.constructor")
public class AppConfig {
    // No explicit bean definition required, @Component handles it.
}
