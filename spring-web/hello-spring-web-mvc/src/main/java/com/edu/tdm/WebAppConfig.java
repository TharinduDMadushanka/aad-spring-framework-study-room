package com.edu.tdm;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan("com.edu.tdm")
@EnableWebMvc
public class WebAppConfig {

}

/**
 * Purpose: This class acts as a configuration class for your Spring MVC web application.
 * @Configuration: Marks the class as a configuration class.
 * @ComponentScan: This annotation ensures that Spring scans the specified package (or the default package)
   for annotated components (like @RestController, @Service, etc.).
 * @EnableWebMvc: Enables support for Spring Web MVC, allowing you to use the core MVC features (like controllers,
   request mappings, etc.).
 */