package com.edu.tdm.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "com.edu.tdm")
@EnableAspectJAutoProxy // enable AOP
public class AppConfig {
}

/**
 * @EnableAspectJAutoProxy: Enables support for handling components marked with @Aspect and uses AspectJ-based AOP proxies.
 */