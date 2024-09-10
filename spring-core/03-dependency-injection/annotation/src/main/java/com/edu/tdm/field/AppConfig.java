package com.edu.tdm.field;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.edu.tdm.field")
public class AppConfig {
    // No explicit bean definition required, @Component handles it.
}
