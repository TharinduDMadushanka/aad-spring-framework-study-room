package com.edu.tdm.config;

import jakarta.persistence.EntityManagerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;

import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;



import javax.sql.DataSource;
import java.util.Properties;

@Configuration
@ComponentScan(basePackages = "com.edu.tdm")
@EnableTransactionManagement
public class AppConfig {

    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/company_db?createDatabaseIfNotExist=true");
        dataSource.setUsername("root");
        dataSource.setPassword("Thariya920@"); // Replace with your MySQL password
        return dataSource;
    }

    @Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
        LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
        em.setDataSource(dataSource());
        em.setPackagesToScan(new String[] {"com.edu.tdm"});

        // Set Hibernate properties
        Properties hibernateProperties = new Properties();
        hibernateProperties.put("hibernate.dialect", "org.hibernate.dialect.MySQL8Dialect");
        hibernateProperties.put("hibernate.hbm2ddl.auto", "update"); // Use "create" or "create-drop" for fresh creation
        hibernateProperties.put("hibernate.show_sql", "true");
        hibernateProperties.put("hibernate.format_sql", "true");

        em.setJpaProperties(hibernateProperties);

        return em;
    }

    @Bean
    public JpaTransactionManager transactionManager(EntityManagerFactory emf) {
        JpaTransactionManager transactionManager = new JpaTransactionManager();
        transactionManager.setEntityManagerFactory(emf);
        return transactionManager;
    }

}

/**
 * Explanation of Hibernate Properties
 * hibernate.dialect: This specifies the SQL dialect that Hibernate should use. Since we are using MySQL 8, we use org.hibernate.dialect.
   MySQL8Dialect.
 * hibernate.hbm2ddl.auto:
 * "create": Creates the schema, destroying any existing data.
 * "create-drop": Creates the schema on startup and drops it on shutdown.
 * "update": Updates the schema; it won't delete or modify existing data but will make changes to the table structure.
 * "validate": Validates the schema, making no changes to the database.
 * hibernate.show_sql: Enables logging of SQL statements.
 * hibernate.format_sql: Pretty-prints the SQL statements in the log.
 */
