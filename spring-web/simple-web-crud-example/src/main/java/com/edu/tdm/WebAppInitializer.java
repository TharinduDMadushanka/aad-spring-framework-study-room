package com.edu.tdm;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{WebRootConfig.class}; // For database and other backend configurations
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{WebAppConfig.class}; // For Spring MVC configuration
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}