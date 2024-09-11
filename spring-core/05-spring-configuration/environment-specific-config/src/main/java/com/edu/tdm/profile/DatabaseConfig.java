package com.edu.tdm.profile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;


@Configuration
public class DatabaseConfig {

    @Bean
    @Profile("dev") // This bean will be active in the "dev" environment
    public DataSource devDataSource() {
        return new DataSource("Development URL", "dev_user", "dev_password");
    }

    @Bean
    @Profile("prod")  // This bean will be active in the "prod" environment
    public DataSource prodDataSource() {
        return new DataSource("Production URL", "prod_user", "prod_password");
    }

}
