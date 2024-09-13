package com.edu.tdm.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "com.edu.tdm")
@EnableAspectJAutoProxy // Enable AOP functionality
public class AppConfig {
}

/**
 * @EnableAspectJAutoProxy: This annotation enables AOP proxy creation in Spring using AspectJ annotations.
 * @ComponentScan: Tells Spring to scan the base package for annotated components (like @Component, @Service, @Aspect).
 */