package com.edu.tdm.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@PropertySource("classpath:application-dev.properties") // Load dev properties
//@PropertySource("classpath:application-prod.properties")  // Load prod properties
public class AppConfig {

    @Value("${app.name}")
    private String appName;

    @Value("${app.version}")
    private String appVersion;

    @Value("${db.url}")
    private String dbUrl;

    @Value("${db.username}")
    private String dbUsername;

    @Value("${db.password}")
    private String dbPassword;

    @Bean
    @Profile("Dev")
    public DataSource devDataSource() {
        System.out.println("App Name: " + appName + ", Version: " + appVersion);
        return new DataSource(dbUrl, dbUsername, dbPassword);
    }

    @Bean
    @Profile("prod")
    public DataSource prodDataSource() {
        System.out.println("App Name: " + appName + ", Version: " + appVersion);
        return new DataSource(dbUrl, dbUsername, dbPassword);
    }

}

/**
 * @PropertySource: Specifies the property file to be loaded for the given profile.
 * @Value: Injects property values from the loaded property file into fields.
 */