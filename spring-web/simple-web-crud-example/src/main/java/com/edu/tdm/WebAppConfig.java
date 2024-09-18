package com.edu.tdm;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@ComponentScan("com.edu.tdm")
public class WebAppConfig implements WebMvcConfigurer {
}
