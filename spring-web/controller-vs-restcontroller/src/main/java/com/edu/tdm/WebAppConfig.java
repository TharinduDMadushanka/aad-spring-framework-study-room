package com.edu.tdm;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
public class WebAppConfig {

    public WebAppConfig() {
        System.out.println("WebAppConfig Instantiated -constructor()");
    }


}
